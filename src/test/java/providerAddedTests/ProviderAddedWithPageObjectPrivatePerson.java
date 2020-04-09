package providerAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class ProviderAddedWithPageObjectPrivatePerson extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void providerAdded(){
        providersAddedPage.openProviderAddedForm();
        providersAddedPage.inputProviderName("TOV Planet34");
        providersAddedPage.inputProviderAddress("Maidan Nezalegnosti 12/1");
        providersAddedPage.inputProviderPhone("+9379992");
        providersAddedPage.setPrivatePersonCheckBox(true);
        providersAddedPage.setIsOurFirmCheckBox(false);
        providersAddedPage.clickCreateButton();
        checkExpectedResult("", providersAddedPage.checkNewProviderInfo("1","TOV Planet34"));
        checkExpectedResult("", providersAddedPage.checkNewProviderInfo("2","Maidan Nezalegnosti 12/1"));
        checkExpectedResult("", providersAddedPage.checkNewProviderInfo("3", "+9379992"));
    }
}
