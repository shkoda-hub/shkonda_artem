package apparatAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class ApparatAddedWithPageObjectTest extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.loginToPage("Student", "909090");
    }
    @Test
    public void addedApparat(){
        apparatAddedPage.openApparatPage();
        apparatAddedPage.openApparatAddedForm();
        apparatAddedPage.inputApparatNumber("823211");
        apparatAddedPage.inputApparatComment("Apparat 928312");
        apparatAddedPage.clickCreateButton();
        checkExpectedResult("Не удалось найти номер нового аппарата", apparatAddedPage.checkNewApparatNumber("823211"));
        checkExpectedResult("Не удалось найти комментарий нового аппарата", apparatAddedPage.checkNewApparatComment("Apparat 928312"));

    }

}
