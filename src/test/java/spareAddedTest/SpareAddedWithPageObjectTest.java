package spareAddedTest;


import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class SpareAddedWithPageObjectTest extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedSpare(){
        spareAddedPage.openSpareAddedForm();
        spareAddedPage.inputSpareName("dsa dewe wefw e");
        spareAddedPage.selectSpareType("Spare type 0009102");
        spareAddedPage.clickCreateButton();
        checkExpectedResult("", spareAddedPage.checkNewSpareName("dsa dewe wefw e"));
    }

}
