package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectWrongLogin extends AbstractParentTest {
    @Test
    public void validLogin(){
        loginPage.openPageLogin();
        loginPage.inputLogin("STUDENT123");
        loginPage.inputPassword("909090");
        loginPage.clickSubmitButton();
        checkExpectedResult("Avatar is not present", loginPage.isLoginBoxRefreshed());
    }
}
