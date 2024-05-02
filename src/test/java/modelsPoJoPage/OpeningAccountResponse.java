package modelsPoJoPage;

public class OpeningAccountResponse {
    private String infoMessage;

    public OpeningAccountResponse(String infoMessage) {
        this.infoMessage = infoMessage;
    }

    public String getInfoMessage() {
        return infoMessage;
    }

    public void setInfoMessage(String infoMessage) {
        this.infoMessage = infoMessage;
    }
}
