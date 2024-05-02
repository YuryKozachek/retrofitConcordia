package endpoints;

import modelsPoJoPage.CardListRoodResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface CardService {
    // CarS. 1- Просмотр имеющихся дебетовых карт у клиента, получаем все карты клиента, в Header передаём clientId
    @GET("cards")
    Call<CardListRoodResponse> getCardList(@Header("clientId") String clientId);
}
