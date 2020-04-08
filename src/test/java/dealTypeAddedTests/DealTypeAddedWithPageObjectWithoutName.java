package dealTypeAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class DealTypeAddedWithPageObjectWithoutName extends AbstractParentTest {

    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedDealType() {
        dealTypeAddedPage.openDealTypeForm();
        dealTypeAddedPage.clickCreateButton();
        checkExpectedResult("", dealTypeAddedPage.checkDealTypeAddedForm());
    }

}
