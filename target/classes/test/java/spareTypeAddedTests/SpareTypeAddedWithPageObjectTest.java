package spareTypeAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class SpareTypeAddedWithPageObjectTest extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedSpareType(){
        spareTypesAddedPage.openSpareTypesAddedForm();
        spareTypesAddedPage.inputSpareTypeName("Spare type 00093212312");
        spareTypesAddedPage.clickCreateButton();
        checkExpectedResult("Тип запчасти не найден", spareTypesAddedPage.checkNewSpareType( "Spare type 00093212312"));
    }
}
