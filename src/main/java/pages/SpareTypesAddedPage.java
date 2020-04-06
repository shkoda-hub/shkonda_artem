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

    @FindBy(name = "spareType")
    private WebElement spareTypeAddedForm;


    public SpareTypesAddedPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openSpareTypesPage(){
        actionWithWebElements.openDictionaryPage(dictionaryList, spareTypesDictionary);
    }

    public void openSpareTypesAddedForm(){
        actionWithWebElements.clickButton(addButton);
    }

    public void inputSpareTypeName(String spareTypeName){
        actionWithWebElements.enterTextToTextField(spareTypeNameField, spareTypeName);
    }

    public void clickCreateButton(){
        actionWithWebElements.clickButton(createSpareTypeButton);
    }

    public boolean checkNewSpareTypeName(String spareTypeName){
        return actionWithWebElements.checkNewAddedElement(spareTypeName);
    }

    public boolean checkSpareTypeAddedForm(){
        return actionWithWebElements.isElementDisplay(spareTypeAddedForm);
    }


}
