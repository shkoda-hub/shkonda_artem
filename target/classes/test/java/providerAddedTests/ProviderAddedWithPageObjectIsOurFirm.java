package providerAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class ProviderAddedWithPageObjectIsOurFirm extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void providerAdded() {
        providersAddedPage.openProviderAddedForm();
        providersAddedPage.inputProviderName("TOV Planet324");
        providersAddedPage.inputProviderAddress("Maidan Nezalegnosti 12/1");
        providersAddedPage.inputProviderPhone("+9379992");
        providersAddedPage.setPrivatePersonCheckBox(false);
        providersAddedPage.setIsOurFirmCheckBox(true);
        providersAddedPage.clickCreateButton();
        checkExpectedResult("", providersAddedPage.checkNewProvider("TOV Planet324 Maidan Nezalegnosti 12/1 +9379992"));
    }
}
