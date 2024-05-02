package modelsClassPage;

import endpoints.CardService;
import modelsPoJoPage.BasePage;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardServicePage extends BasePage {
    public CardServicePage getAllClientsCards(String clientId) throws IOException {
        // создаём http клиент от retrofit, + базовая ссылка куда отправляем запросы, + добавляем фабрику конвертеров там json превращается в объект
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(CARD_SERVICE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        // реализуем интерфейс через класс
        CardService cardService = retrofit.create(CardService.class);
        // execute отправляет запрос и возвращает ответ с указанным типом данных
        responseCardListRood = cardService.getCardList(clientId).execute();
        // достаём из response тело и делаем assert
        cardListRoodResponse = responseCardListRood.body();
        return this;
    }

    public void checkCardListSize() {
        assertTrue(responseCardListRood.isSuccessful());
        assertEquals(4, cardListRoodResponse.cards.size());
    }

}
