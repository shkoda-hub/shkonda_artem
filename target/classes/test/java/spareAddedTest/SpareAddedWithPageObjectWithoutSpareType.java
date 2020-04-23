package spareAddedTest;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class SpareAddedWithPageObjectWithoutSpareType extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedSpareWithoutSpareType(){
        spareAddedPage.openSpareAddedForm();
        spareAddedPage.inputSpareName("Spare spare");
        checkExpectedResult("", spareAddedPage.checkSpareAddedForm());
    }
}
