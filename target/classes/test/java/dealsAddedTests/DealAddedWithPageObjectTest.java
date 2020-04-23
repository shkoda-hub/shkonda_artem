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
        checkExpectedResult("", dealsAddedPage.checkNewDeal("09.04.2020 21:48 Deal with JAVA TOV Planet3 TOV Planet324"));
    }
}
