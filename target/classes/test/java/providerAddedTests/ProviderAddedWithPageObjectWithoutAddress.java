package providerAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class ProviderAddedWithPageObjectWithoutAddress extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void providerAdded(){
        providersAddedPage.openProviderAddedForm();
        providersAddedPage.inputProviderName("TOV Planet3");
        providersAddedPage.inputProviderPhone("+9379992");
        providersAddedPage.setPrivatePersonCheckBox(false);
        providersAddedPage.setIsOurFirmCheckBox(false);
        providersAddedPage.clickCreateButton();
        checkExpectedResult("", providersAddedPage.checkProviderAddedForm());
    }

}
