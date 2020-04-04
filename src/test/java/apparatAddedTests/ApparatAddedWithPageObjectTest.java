package apparatAddedTests;

import loginTests.LoginWithPageObjectTest;
import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class ApparatAddedWithPageObjectTest extends AbstractParentTest {
    LoginWithPageObjectTest loginWithPageObjectTest = new LoginWithPageObjectTest();
    @Before
    public void login(){
        loginPage.loginToPage("Student", "909090");
    }
    @Test
    public void addedApparat(){
        apparatAddedPage.openApparatPage();
        apparatAddedPage.openApparatAddedForm();
        apparatAddedPage.inputApparatNumber();
        apparatAddedPage.inputApparatComment();
        apparatAddedPage.clickCreateButton();
        checkExpectedResult("Не удалось найти комментарий нового аппарата", apparatAddedPage.checkNewApparatComment());
        checkExpectedResult("Не удалось найти номер нового аппарата", apparatAddedPage.checkNewApparatNumber());
    }

}
