package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectUpperLogin extends AbstractParentTest {
    @Test
    public void validLogin(){
        loginPage.openPageLogin();
        loginPage.inputLogin("STUDENT1");
        loginPage.inputPassword("909090");
        loginPage.clickSubmitButton();
        checkExpectedResult("Avatar is not present", loginPage.isLoginBoxRefreshed());
    }
}
