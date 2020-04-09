package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class DealsAddedPage extends ParentPage {

    @FindBy(id = "deal")
    private WebElement deals;

    @FindBy(xpath = "//a[@class = 'btn btn-info btn-sm']")
    private WebElement openFormButton;

    @FindBy(id = "deal_dealDate_date_day")
    private WebElement dealDay;

    @FindBy(id = "deal_dealDate_date_month")
    private WebElement dealMonth;

    @FindBy(id = "deal_dealDate_date_year")
    private WebElement dealYear;

    @FindBy(id = "deal_dealDate_time_hour")
    private WebElement dealHour;

    @FindBy(id = "deal_dealDate_time_minute")
    private WebElement dealMinute;

    @FindBy(id = "deal_dealType")
    private WebElement dealTypeDD;

    @FindBy(id = "deal_customer")
    private WebElement dealCustomerDD;

    @FindBy(id = "deal_provider")
    private WebElement dealProviderDD;

    @FindBy(name = "add")
    private WebElement createDealButton;

    @FindBy(name = "deal")
    private WebElement dealAddedForm;

    public DealsAddedPage(WebDriver webDriver) {
        super(webDriver);

    }

    public void openDealAddedForm() {
        actionWithWebElements.clickButton(deals);
        actionWithWebElements.clickButton(openFormButton);
    }

    public void selectDealDate(String day, String month, String year, String hour, String minute) {
        actionWithWebElements.selectElementFromDD(dealDay, day);
        actionWithWebElements.selectElementFromDD(dealMonth, month);
        actionWithWebElements.selectElementFromDD(dealYear, year);
        actionWithWebElements.selectElementFromDD(dealHour, hour);
        actionWithWebElements.selectElementFromDD(dealMinute, minute);
    }

    public void selectDealType(String dealType) {
        actionWithWebElements.selectElementFromDD(dealTypeDD, dealType);
    }

    public void selectDealCustomer(String customer) {
        actionWithWebElements.selectElementFromDD(dealCustomerDD, customer);
    }

    public void selectDealProvider(String provider) {
        actionWithWebElements.selectElementFromDD(dealProviderDD, provider);

    }

    public void clickCreateButton(){
        actionWithWebElements.clickButton(createDealButton);
    }

    public boolean checkNewDealInfo(String idx, String text) {
        return actionWithWebElements.checkNewElement(idx, text);
    }

    public boolean checkDealAddedForm(){
        return actionWithWebElements.isElementDisplay(dealAddedForm);
    }
}
