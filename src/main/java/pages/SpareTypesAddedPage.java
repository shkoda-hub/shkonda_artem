package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SpareTypesAddedPage extends ParentPage {

    @FindBy(id = "spareType")
    private WebElement spareTypesDictionary;

    @FindBy(id = "dictionary")
    private WebElement dictionaryList;

    @FindBy(xpath = "//div[@class = 'box-tools']")
    private WebElement addButton;

    @FindBy(id = "spareType_spareTypeName")
    private WebElement spareTypeNameField;

    @FindBy(name = "add")
    private WebElement createSpareTypeButton;

    @FindBy(xpath = "//td[contains(text(),'Spare type 0009102')]")
    private WebElement addedSpareType;

    String spareTypeName = "Spare type 0009102";

    public SpareTypesAddedPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openSpareTypesPage(){
        actionWithWebElements.openDictionaryPage(dictionaryList, spareTypesDictionary);
    }

    public void openSpareTypesAddedForm(){
        actionWithWebElements.clickButton(addButton);
    }

    public void inputSpareTypeName(){
        actionWithWebElements.enterTextToTextField(spareTypeNameField, spareTypeName);
    }

    public void clickCreateButton(){
        actionWithWebElements.clickButton(createSpareTypeButton);
    }

    public boolean checkNewSpareTypeName(){
        return actionWithWebElements.isElementDisplay(addedSpareType);
    }


}
