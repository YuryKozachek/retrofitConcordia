package endpoints;

import modelsPoJoPage.OpeningAccountRequest;
import modelsPoJoPage.OpeningAccountResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface AccountService {
    // AccS. 1 - Открытие счета
    @POST("accounts/applications")
    Call<OpeningAccountResponse> getInfoMassage(@Header("clientId") String clientId,
                                                @Body OpeningAccountRequest openingAccountRequest);
}
