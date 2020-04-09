package dealsAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class DealAddedWithPageObjectTest extends AbstractParentTest {

    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedDeal(){
        dealsAddedPage.openDealAddedForm();
        dealsAddedPage.selectDealDate("09","апр.", "2020", "21", "48");
        dealsAddedPage.selectDealType("Deal with JAVA");
        dealsAddedPage.selectDealCustomer("TOV Planet3");
        dealsAddedPage.selectDealProvider("TOV Planet324");
        dealsAddedPage.clickCreateButton();
        checkExpectedResult("", dealsAddedPage.checkNewDealInfo("1","09.04.2020 21:48"));
        checkExpectedResult("", dealsAddedPage.checkNewDealInfo("2","Deal with JAVA"));
        checkExpectedResult("", dealsAddedPage.checkNewDealInfo("3","TOV Planet3"));
        checkExpectedResult("", dealsAddedPage.checkNewDealInfo("4","TOV Planet324"));
    }
}
