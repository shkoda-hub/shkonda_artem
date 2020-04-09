package dealTypeAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class DealTypeAddedWithPageObjectTest extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedDealType() {
        dealTypeAddedPage.openDealTypeForm();
        dealTypeAddedPage.inputDealTypeName("Deal with JAVA");
        dealTypeAddedPage.clickCreateButton();
        checkExpectedResult("", dealTypeAddedPage.checkNewDealTypeInfo("1", "Deal with JAVA"));
    }
}
