package tests;

import modelsClassPage.AccountServicePage;
import modelsClassPage.CardServicePage;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected CardServicePage cardServicePage;
    protected AccountServicePage accountServicePage;

    @BeforeEach
    public void setUp() {
        cardServicePage = new CardServicePage();
        accountServicePage = new AccountServicePage();
    }

}
