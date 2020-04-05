package spareAddedTest;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class SpareAddedWithPageObjectTest extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.loginToPage("Student", "909090");
    }
    @Test
    public void addedSpare(){
        spareAddedPage.openSparePage();
        spareAddedPage.openSpareAddedForm();
        spareAddedPage.inputSpareName();
        spareAddedPage.selectSpareType();
        spareAddedPage.clickCreateButton();
        checkExpectedResult("", spareAddedPage.checkNewSpareName());
    }

}
