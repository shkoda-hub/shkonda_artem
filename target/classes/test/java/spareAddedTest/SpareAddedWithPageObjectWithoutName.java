package spareAddedTest;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class SpareAddedWithPageObjectWithoutName extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedSpareWithoutName(){
        spareAddedPage.openSpareAddedForm();
        spareAddedPage.selectSpareType("Spare type 0009102");
        spareAddedPage.clickCreateButton();
        checkExpectedResult("", spareAddedPage.checkSpareAddedForm());
    }
}
