package modelsPoJoPage;

public class OpeningAccountRequest {
    private String accountType;
    private String accountName;
    private String currency;
    private Boolean isMain;

    public OpeningAccountRequest(String accountType, String accountName, String currency, Boolean isMain) {
        this.accountType = accountType;
        this.accountName = accountName;
        this.currency = currency;
        this.isMain = isMain;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getMain() {
        return isMain;
    }

    public void setMain(Boolean main) {
        isMain = main;
    }
}
