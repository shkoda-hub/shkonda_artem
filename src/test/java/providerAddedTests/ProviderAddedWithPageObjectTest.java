package providerAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class ProviderAddedWithPageObjectTest extends AbstractParentTest {

    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void providerAdded(){
        providersAddedPage.openProviderAddedForm();
        providersAddedPage.inputProviderName("TOV Planet3");
        providersAddedPage.inputProviderAddress("Maidan Nezalegnosti 12/1");
        providersAddedPage.inputProviderPhone("+9379992");
        providersAddedPage.setPrivatePersonCheckBox(false);
        providersAddedPage.setIsOurFirmCheckBox(false);
        providersAddedPage.clickCreateButton();
        checkExpectedResult("", providersAddedPage.checkNewProviderAttribute("TOV Planet3"));
        checkExpectedResult("", providersAddedPage.checkNewProviderAttribute("Maidan Nezalegnosti 12/1"));
        checkExpectedResult("", providersAddedPage.checkNewProviderAttribute("+9379992"));
    }
}
