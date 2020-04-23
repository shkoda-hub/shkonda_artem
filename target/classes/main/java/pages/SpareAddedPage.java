package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SpareAddedPage extends ParentPage {
    @FindBy(id = "dictionary")
    private WebElement dictionaryList;

    @FindBy(className = "box-tools")
    private WebElement openSpareAddedFormButton;

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

    @FindBy(xpath = "//tr[last()][td]")
    private WebElement lastRow;




    public SpareAddedPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void openSpareAddedForm(){
        actionWithWebElements.clickButton(dictionaryList);
        actionWithWebElements.clickButton(spareDictionary);
        actionWithWebElements.clickButton(openSpareAddedFormButton);
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

    public boolean checkNewSpare(String text){
        return actionWithWebElements.isTextDisplayedInElement(lastRow, text);
    }

    public boolean checkSpareAddedForm(){
        return actionWithWebElements.isElementDisplay(spareAddedForm);
    }




}
