package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class DealsAddedPage extends ParentPage {

    @FindBy(id = "dictionary")
    private WebElement dictionaryList;

    @FindBy(id = "deal")
    private WebElement dealsDictionary;

    @FindBy(className = "box-tools")
    private WebElement openDealAddedFormButton;

    @FindBy(id = "deal_dealDate_date_day")
    @CacheLookup
    private WebElement dealDay;

    @FindBy(id = "deal_dealDate_date_month")
    @CacheLookup
    private WebElement dealMonth;

    @FindBy(id = "deal_dealDate_date_year")
    @CacheLookup
    private WebElement dealYear;

    @FindBy(id = "deal_dealDate_time_hour")
    @CacheLookup
    private WebElement dealHour;

    @FindBy(id = "deal_dealDate_time_minute")
    @CacheLookup
    private WebElement dealMinute;

    @FindBy(id = "deal_dealType")
    @CacheLookup
    private WebElement dealTypeDD;

    @FindBy(id = "deal_customer")
    @CacheLookup
    private WebElement dealCustomerDD;

    @FindBy(id = "deal_provider")
    @CacheLookup
    private WebElement dealProviderDD;

    @FindBy(name = "add")
    @CacheLookup
    private WebElement createDealButton;

    @FindBy(name = "deal")
    @CacheLookup
    private WebElement dealAddedForm;

    @FindBy(xpath = "//tr[last()][td]")
    private WebElement lastRow;

    public DealsAddedPage(WebDriver webDriver) {
        super(webDriver);

    }

    public void openDealAddedForm() {
        actionWithWebElements.clickButton(dictionaryList);
        actionWithWebElements.clickButton(dealsDictionary);
        actionWithWebElements.clickButton(openDealAddedFormButton);
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

    public boolean checkNewDeal(String text) {
        return actionWithWebElements.isTextDisplayedInElement(lastRow, text);
    }

    public boolean checkDealAddedForm(){
        return actionWithWebElements.isElementDisplay(dealAddedForm);
    }
}
