package apparatAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class ApparatAddedWithPageObjectWithoutComment extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }

    @Test
    public void addedApparatWithoutComment(){
        apparatAddedPage.openApparatAddedForm();
        apparatAddedPage.inputApparatNumber("823211");
        apparatAddedPage.clickCreateButton();
        checkExpectedResult("", apparatAddedPage.checkApparatAddedForm());
    }




}
