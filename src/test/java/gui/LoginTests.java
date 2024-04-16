package gui;

import com.skilo.POM.HomePage;
import com.skilo.POM.LoginPage;
import gui.base.TestBase;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    public static final int WAIT = 3333;

    @Test
    public void verifyUserCanNavigateToLoginPageViaNavigationLoginButton() throws InterruptedException {
        //const and vars that will be used in the test case
        final String USERNAME = "testingDemos";
        final String PASSWORD = "testing";

        HomePage homePage = new HomePage(super.driver);

        log.info("STEP 1: The user has open the ISkilo HomePage.");
        homePage.openHomePage();
        sleepy(WAIT);

        log.info("STEP 2: The user has navigated to ISkilo LoginPage");
        homePage.navigateToLoginPageViaClickOnNavigationLoginButton();
        sleepy(WAIT);

        log.info("STEP 3: The user has verified that the LoginPage is open as per requirements ");
        LoginPage loginPage = new LoginPage(super.driver);

        log.info("STEP 5: The user has provided a valid username");
        loginPage.provideUserName(USERNAME);

        log.info("STEP 6: The user has provided a valid password");
        loginPage.providePassword(PASSWORD);

        log.info("STEP 7: The user has clicked on login submit button");
        loginPage.clickOnLoginSubmitButton();

        sleepy(WAIT);

    }
}
