package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ProvidersAddedPage extends ParentPage {

    @FindBy(id = "dictionary")
    private WebElement dictionaryList;

    @FindBy(id = "prov_cus")
    private WebElement providersDictionary;

    @FindBy(className = "box-tools")
    private WebElement openProvidersAddedFormButton;

    @FindBy(xpath = "//h3[text() = 'Список контрагентов']")
    private WebElement titleProvidersGrid;

    @FindBy(id = "prov_cus_proCustName")
    private WebElement providerNameField;

    @FindBy(id = "prov_cus_proCustAddress")
    private WebElement providerAddressField;

    @FindBy(id = "prov_cus_proCustPhone")
    private WebElement providerPhoneField;

    @FindBy(id = "prov_cus_proCustIsFl")
    private WebElement privatePersonCheckBox;

    @FindBy(id = "prov_cus_isOurFirm")
    private WebElement isOurFirmCheckBox;

    @FindBy(name = "add")
    private WebElement createProviderButton;

    @FindBy(name = "prov_cus")
    private WebElement providerAddedForm;

    @FindBy(xpath = "//tr[last()][td]")
    private WebElement lastRow;

    public ProvidersAddedPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openProviderAddedForm(){
        actionWithWebElements.clickButton(dictionaryList);
        actionWithWebElements.clickButton(providersDictionary);
        actionWithWebElements.clickButton(openProvidersAddedFormButton);
    }

    public void inputProviderName(String name){
        actionWithWebElements.enterTextToTextField(providerNameField, name);
    }

    public void inputProviderAddress(String address){
        actionWithWebElements.enterTextToTextField(providerAddressField, address);
    }

    public void inputProviderPhone(String phone){
        actionWithWebElements.enterTextToTextField(providerPhoneField, phone);
    }

    public void setPrivatePersonCheckBox(boolean state){
        actionWithWebElements.setCheckBox(privatePersonCheckBox, state);
    }

    public void setIsOurFirmCheckBox(boolean state){
        actionWithWebElements.setCheckBox(isOurFirmCheckBox, state);
    }

    public void clickCreateButton(){
        actionWithWebElements.clickButton(createProviderButton);
    }

    public boolean checkNewProvider(String text) {
        return actionWithWebElements.isTextDisplayedInElement(lastRow, text);
    }

    public boolean checkProviderAddedForm(){
        return actionWithWebElements.isElementDisplay(providerAddedForm);
    }

}
