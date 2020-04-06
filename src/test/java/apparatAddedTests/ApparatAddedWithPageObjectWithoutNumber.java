package apparatAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class ApparatAddedWithPageObjectWithoutNumber extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedApparatWithoutNumber(){
        apparatAddedPage.openApparatPage();
        apparatAddedPage.openApparatAddedForm();
        apparatAddedPage.inputApparatComment("Comment Comment");
        apparatAddedPage.clickCreateButton();
        checkExpectedResult("", apparatAddedPage.checkApparatAddedForm());
    }

}
