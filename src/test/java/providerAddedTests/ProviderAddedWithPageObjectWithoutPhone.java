package providerAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class ProviderAddedWithPageObjectWithoutPhone extends AbstractParentTest {

    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void providerAdded(){
        providersAddedPage.openProviderAddedForm();
        providersAddedPage.inputProviderName("TOV 1Planet3");
        providersAddedPage.inputProviderAddress("Maidan Nezalegnosti 12/11");
        providersAddedPage.setPrivatePersonCheckBox(false);
        providersAddedPage.setIsOurFirmCheckBox(false);
        providersAddedPage.clickCreateButton();
        checkExpectedResult("", providersAddedPage.checkNewProviderInfo("1","TOV 1Planet3"));
        checkExpectedResult("", providersAddedPage.checkNewProviderInfo("2","Maidan Nezalegnosti 12/11"));
    }
}
