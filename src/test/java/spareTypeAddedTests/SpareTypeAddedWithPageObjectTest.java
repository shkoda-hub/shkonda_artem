package spareTypeAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class SpareTypeAddedWithPageObjectTest extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.loginToPage("Student", "909090");
    }
    @Test
    public void addedSpareType(){
        spareTypesAddedPage.openSpareTypesPage();
        spareTypesAddedPage.openSpareTypesAddedForm();
        spareTypesAddedPage.inputSpareTypeName();
        spareTypesAddedPage.clickCreateButton();
        checkExpectedResult("Тип запчасти не найден", spareTypesAddedPage.checkNewSpareTypeName());
    }
}
