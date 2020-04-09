package apparatAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class ApparatAddedWithPageObjectTest extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedApparat(){
        apparatAddedPage.openApparatAddedForm();
        apparatAddedPage.inputApparatNumber("823211");
        apparatAddedPage.inputApparatComment("Apparat 928312");
        apparatAddedPage.clickCreateButton();
        checkExpectedResult("Не удалось найти номер нового аппарата", apparatAddedPage.checkNewApparatInfo("1", "823211" ));
        checkExpectedResult("Не удалось найти комментарий нового аппарата", apparatAddedPage.checkNewApparatInfo("2", "Apparat 928312"));

    }

}
