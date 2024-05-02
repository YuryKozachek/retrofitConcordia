package DBUtils;

public interface QueryCollection {
    static void deleteAccountName(String name) {
        DataFromSQL.getDataAsString("DELETE FROM accountserviceapp.account WHERE account_name=('" + name + "')");
    }
}
