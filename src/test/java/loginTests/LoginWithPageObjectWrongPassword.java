package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectWrongPassword extends AbstractParentTest {
    @Test
    public void validLogin(){
        loginPage.openPageLogin();
        loginPage.inputLogin("Student");
        loginPage.inputPassword("ds23dsac");
        loginPage.clickSubmitButton();
        checkExpectedResult("Login box did not refresh", loginPage.isLoginBoxRefreshed());
    }
}
