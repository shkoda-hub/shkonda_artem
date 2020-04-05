package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SpareAddedPage extends ParentPage {

    @FindBy(id = "spares")
    private WebElement spareDictionary;

    @FindBy(id = "dictionary")
    private WebElement dictionaryList;

    @FindBy(xpath = "//div[@class = 'box-tools']")
    private WebElement addButton;

    @FindBy(id = "spares_spareName")
    private WebElement spareNameField;

    @FindBy(id = "spares_spareType")
    private WebElement spareTypeDD;

    @FindBy(name = "add")
    private WebElement createSpareButton;

    @FindBy(xpath = "//td[contains(text(),'GTX 2080 ti sn920')]")
    private WebElement addedSpare;

    String spareTypeName = "Spare type 0009102";
    String spareName = "GTX 2080 ti sn920";

    public SpareAddedPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openSparePage(){
        actionWithWebElements.openDictionaryPage(dictionaryList, spareDictionary);
    }

    public void openSpareAddedForm(){
        actionWithWebElements.clickButton(addButton);
    }

    public void inputSpareName(){
        actionWithWebElements.enterTextToTextField(spareNameField, spareTypeName);
    }

    public void selectSpareType(){
        actionWithWebElements.selectElementFromDD(spareTypeDD, spareTypeName);
    }

    public void clickCreateButton(){
        actionWithWebElements.clickButton(createSpareButton);
    }

    public boolean checkNewSpareName(){
        return actionWithWebElements.isElementDisplay(addedSpare);
    }


}
