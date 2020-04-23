package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class DealTypeAddedPage extends ParentPage {

    @FindBy(id = "dictionary")
    private WebElement dictionaryList;

    @FindBy(id = "deal_type")
    private WebElement dealTypeDictionary;

    @FindBy(className = "box-tools")
    private WebElement openDealAddedFormButton;

    @FindBy(id = "deal_type_dealTypeName")
    private WebElement dealTypeNameField;

    @FindBy(name = "add")
    private WebElement createDealTypeButton;

    @FindBy(name = "deal_type")
    private WebElement dealTypeAddedForm;

    @FindBy(xpath = "//tr[last()][td]")
    private WebElement lastRow;

    public DealTypeAddedPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openDealTypeForm() {
        actionWithWebElements.clickButton(dictionaryList);
        actionWithWebElements.clickButton(dealTypeDictionary);
        actionWithWebElements.clickButton(openDealAddedFormButton);
    }

    public void inputDealTypeName(String dealTypeName) {
        actionWithWebElements.enterTextToTextField(dealTypeNameField, dealTypeName );
    }

    public void clickCreateButton() {
        actionWithWebElements.clickButton(createDealTypeButton);
    }

    public boolean checkNewDealType(String text) {
        return actionWithWebElements.isTextDisplayedInElement(lastRow,text);
    }

    public boolean checkDealTypeAddedForm() {
        return actionWithWebElements.isElementDisplay(dealTypeAddedForm);
    }


}
