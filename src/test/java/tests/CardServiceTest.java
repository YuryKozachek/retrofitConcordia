package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class CardServiceTest extends BaseTest {
    @Test
    public void getCardsListUser() throws IOException {
        cardServicePage
                .getAllClientsCards("063cf200-1876-4fc3-a88a-be27d2303c64")
                .checkCardListSize();
    }
}
