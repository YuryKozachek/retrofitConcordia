package DBUtils;

import java.sql.ResultSet;
import java.sql.Statement;

public class DataFromSQL {
    private static DBConnection connection = DBConnection.getInstance();

    // метод выполняет запрос к базе данных и возвращает результат в виде строки
    public static String getDataAsString(String query) {
        ResultSet result;
        String queryResult = "";
        try (Statement statement = connection.getConnection().createStatement()) {
            switch (query.substring(0, query.indexOf(" ")).toLowerCase()) {
                case "select": {
                    result = statement.executeQuery(query);
                    int columCount = result.getMetaData().getColumnCount();
                    while (result.next()) {
                        for (int i = 1; i <= columCount; i++) {
                            queryResult += result.getString(i) + "\t";
                        }
                        queryResult += System.lineSeparator();
                    }
                }
                break;
                case "delete", "update", "insert": {
                    statement.execute(query);
                }
                break;
                default:
                    throw new Exception("Wrong query!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return queryResult.trim();
    }
}
