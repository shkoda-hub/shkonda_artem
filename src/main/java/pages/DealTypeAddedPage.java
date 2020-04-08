package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class DealTypeAddedPage extends ParentPage {

    @FindBy(id = "deal_type")
    private WebElement dealTypeDictionary;

    @FindBy(id = "deal_type_dealTypeName")
    private WebElement dealTypeNameField;

    @FindBy(name = "add")
    private WebElement createDealTypeButton;

    @FindBy(name = "deal_type")
    private WebElement dealTypeAddedForm;

    public DealTypeAddedPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openDealTypeForm() {
        actionWithWebElements.openDictionaryAddedForm(dealTypeDictionary);
    }

    public void inputDealTypeName(String dealTypeName) {
        actionWithWebElements.enterTextToTextField(dealTypeNameField, dealTypeName );
    }

    public void clickCreateButton() {
        actionWithWebElements.clickButton(createDealTypeButton);
    }

    public boolean checkNewDealTypeName(String dealTypeName){
        return actionWithWebElements.checkNewAddedElement(dealTypeName);
    }

    public boolean checkDealTypeAddedForm() {
        return actionWithWebElements.isElementDisplay(dealTypeAddedForm);
    }


}
