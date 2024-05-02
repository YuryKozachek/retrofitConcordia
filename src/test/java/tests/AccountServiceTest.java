package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class AccountServiceTest extends BaseTest {

    @Test
    public void getOpeningAccount() throws IOException {
        accountServicePage
                .openingAccountByClient("063cf200-1876-4fc3-a88a-be27d2303c64")
                .checkOpeningAccount();
    }
}
