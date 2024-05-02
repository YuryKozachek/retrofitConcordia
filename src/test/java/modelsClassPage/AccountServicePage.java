package modelsClassPage;

import DBUtils.QueryCollection;
import endpoints.AccountService;
import modelsPoJoPage.BasePage;
import modelsPoJoPage.OpeningAccountRequest;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountServicePage extends BasePage {
    public AccountServicePage openingAccountByClient(String clientId) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ACCOUNT_SERVICE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        AccountService accountService = retrofit.create(AccountService.class);
        requestOpeningAccount = new OpeningAccountRequest("CREDIT", "Счёт для JavaMen №15", "RUB", true);
        responseOpeningAccount = accountService.getInfoMassage(clientId,
                requestOpeningAccount).execute();
        openingAccountResponse = responseOpeningAccount.body();
        return this;
    }

    public void checkOpeningAccount() {
        assertTrue(responseOpeningAccount.isSuccessful());
        assertEquals("Счет успешно создан", openingAccountResponse.getInfoMessage());
        QueryCollection.deleteAccountName(requestOpeningAccount.getAccountName());
    }
}
