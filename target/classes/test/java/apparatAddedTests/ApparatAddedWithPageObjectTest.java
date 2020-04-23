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
        checkExpectedResult("Новая запись не была найдена", apparatAddedPage.checkNewApparat("823211 Apparat 928312"));
    }

}
