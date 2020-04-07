package spareTypeAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class SpareTypeAddedWithPageObjectWithoutName extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedSpareTypeWithoutName(){
        spareTypesAddedPage.openSpareTypesAddedForm();
        spareTypesAddedPage.clickCreateButton();
        checkExpectedResult("", spareTypesAddedPage.checkSpareTypeAddedForm());
    }

}
