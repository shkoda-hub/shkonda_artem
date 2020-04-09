package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SpareAddedPage extends ParentPage {

    @FindBy(id = "spares")
    private WebElement spareDictionary;

    @FindBy(xpath = "//div[@class = 'box-tools']")
    private WebElement addButton;

    @FindBy(id = "spares_spareName")
    private WebElement spareNameField;

    @FindBy(id = "spares_spareType")
    private WebElement spareTypeDD;

    @FindBy(name = "spares")
    private WebElement spareAddedForm;

    @FindBy(name = "add")
    private WebElement createSpareButton;




    public SpareAddedPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void openSpareAddedForm(){
        actionWithWebElements.openDictionaryAddedForm(spareDictionary);
    }

    public void inputSpareName(String name){
        actionWithWebElements.enterTextToTextField(spareNameField, name);
    }


    public void selectSpareType(String spareTypeName){
        actionWithWebElements.selectElementFromDD(spareTypeDD, spareTypeName);
    }

    public void clickCreateButton(){
        actionWithWebElements.clickButton(createSpareButton);
    }

    public boolean checkNewSpareInfo(String idx, String text){
        return actionWithWebElements.checkNewElement(idx, text);
    }

    public boolean checkSpareAddedForm(){
        return actionWithWebElements.isElementDisplay(spareAddedForm);
    }




}
