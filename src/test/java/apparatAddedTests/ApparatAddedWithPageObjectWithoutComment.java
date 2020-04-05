package apparatAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class ApparatAddedWithPageObjectWithoutComment extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.loginToPage("Student", "909090");
    }

    @Test
    public void addedApparat(){
        apparatAddedPage.openApparatPage();
        apparatAddedPage.openApparatAddedForm();
        apparatAddedPage.inputApparatNumber("823211");
        apparatAddedPage.clickCreateButton();
        checkExpectedResult("", apparatAddedPage.checkNumberField());
        checkExpectedResult("", apparatAddedPage.checkCommentField());


    }




}
