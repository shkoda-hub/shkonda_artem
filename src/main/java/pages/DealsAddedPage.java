package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class DealsAddedPage extends ParentPage {

    @FindBy(id = "deal")
    private WebElement deals;

    @FindBy(id = "")
    private WebElement dealDay;

    @FindBy(id = "")
    private WebElement dealMonth;

    @FindBy(id = "")
    private WebElement dealYear;



    public DealsAddedPage(WebDriver webDriver, WebElement deals) {
        super(webDriver);

    }

}
