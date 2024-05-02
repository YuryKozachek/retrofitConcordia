package modelsPoJoPage;

import retrofit2.Response;

public class BasePage {
    public static final String CARD_SERVICE_URL = "http://172.17.1.65:9006/";
    public static final String ACCOUNT_SERVICE_URL = "http://172.17.1.65:9009/";
    protected Response<CardListRoodResponse> responseCardListRood;
    protected CardListRoodResponse cardListRoodResponse;
    protected OpeningAccountRequest requestOpeningAccount;
    protected Response<OpeningAccountResponse> responseOpeningAccount;
    protected OpeningAccountResponse openingAccountResponse;

}
