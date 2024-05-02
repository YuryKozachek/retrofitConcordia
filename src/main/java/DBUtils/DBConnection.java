package DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private Connection connection;
    private static DBConnection instance;

    // этот метод гарантирует, что в программе будет создан и использован только один экземпляр класса DBConnection
    public static DBConnection getInstance() {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }

    // приватный конструктор
    private DBConnection() {
    }

    // метод возвращает объект Connection, который представляет собой соединение с базой данных
    public Connection getConnection() {
        if (connection == null) {
            Properties properties = PropertyReader
                    .getProperties("src/main/java/DBUtils/jdbc_connect_properties.properties");
            String url = properties.getProperty("url");
            String login = properties.getProperty("login");
            String password = properties.getProperty("password");
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            try {
                connection = DriverManager.getConnection(url, login, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
