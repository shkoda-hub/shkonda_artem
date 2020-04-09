package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SpareTypesAddedPage extends ParentPage {

    @FindBy(id = "spareType")
    private WebElement spareTypesDictionary;

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

    public void openSpareTypesAddedForm(){
        actionWithWebElements.openDictionaryAddedForm(spareTypesDictionary);
    }

    public void inputSpareTypeName(String spareTypeName){
        actionWithWebElements.enterTextToTextField(spareTypeNameField, spareTypeName);
    }

    public void clickCreateButton(){
        actionWithWebElements.clickButton(createSpareTypeButton);
    }

    public boolean checkNewSpareTypeInfo(String idx, String text){
        return actionWithWebElements.checkNewElement(idx, text);
    }

    public boolean checkSpareTypeAddedForm(){
        return actionWithWebElements.isElementDisplay(spareTypeAddedForm);
    }


}
