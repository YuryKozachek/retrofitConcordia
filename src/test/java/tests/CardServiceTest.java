package tests;

import endpoints.CardService;
import modelsClassPage.CardListRoodResponse;
import org.junit.jupiter.api.Test;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardServiceTest {
    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://172.17.1.65:9006/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    private final CardService cardService = retrofit.create(CardService.class);

    // проверяем что у клиента 4 карты
    @Test
    public void getCardsListUser() throws IOException {
        String clientId = "063cf200-1876-4fc3-a88a-be27d2303c64";
        Response<CardListRoodResponse> response = cardService.getCardList(clientId).execute();
        assertTrue(response.isSuccessful());

        CardListRoodResponse cardListRoodResponse = response.body();

        assertEquals(4, cardListRoodResponse.cards.size());

    }
}
