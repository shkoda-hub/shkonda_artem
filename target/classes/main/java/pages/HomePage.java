package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import parentPage.ParentPage;
import org.apache.log4j.Logger;

public class HomePage extends ParentPage {

    @FindBy(xpath = "//div[@class='pull-left image']")
    private WebElement avatar;

    @FindBy(xpath = ".//li[@id='dictionary']//ul[@class='treeview-menu menu-open']//li[@id='prov_cus']")
    private WebElement submenuProviders;

    //WebDriverWait webDriverWaitExp = new WebDriverWait(webDriver, 2*timeout);


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarDisplayed(){
        //webDriverWaitExp.until(ExpectedConditions.visibilityOf(avatar));
        return actionWithWebElements.isElementDisplay(avatar);
    }

    public void checkIsAvatarPresent() {
        Assert.assertTrue("Avatar is not displayed", isAvatarDisplayed());
    }

    public void clickOnSubmenuProviders() {
        actionWithWebElements.clickButton(submenuProviders);
    }



}
