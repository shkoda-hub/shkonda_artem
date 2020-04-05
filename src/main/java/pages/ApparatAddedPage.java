package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ApparatAddedPage extends ParentPage {

    @FindBy(id = "apparat")
    private WebElement apparatDictionary;

    @FindBy(id = "dictionary")
    private WebElement dictionaryList;

    @FindBy(xpath = "//div[@class = 'box-tools']")
    private WebElement addButton;

    @FindBy(xpath = "//h3[text() = 'Список аппаратов']")
    private WebElement titleApparatGrid;

    @FindBy(id = "apparat_apparatNumber")
    private WebElement apparatNumberField;

    @FindBy(id = "apparat_apparatComment")
    private WebElement apparatCommentField;

    @FindBy(name = "add")
    private WebElement createApparatButton;

    @FindBy(xpath = "//td[text() = '111001']")
    private WebElement addedApparatNumber;

    @FindBy(xpath = "//td[text() = 'New apparat SN:0000111001']")
    private WebElement addedApparatComment;



    String number = "111001";
    String comment = "New apparat SN:0000111001";

    public ApparatAddedPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openApparatPage(){
        actionWithWebElements.openDictionaryPage(dictionaryList, apparatDictionary);
    }

    public void openApparatAddedForm(){
        actionWithWebElements.clickButton(addButton);
    }

    public void inputApparatNumber(){
        actionWithWebElements.enterTextToTextField(apparatNumberField, number);
    }

    public void inputApparatComment(){
        actionWithWebElements.enterTextToTextField(apparatCommentField, comment);
    }

    public void clickCreateButton(){
        actionWithWebElements.clickButton(createApparatButton);
    }

    public boolean checkNewApparatNumber(){
        return actionWithWebElements.isElementDisplay(addedApparatNumber);
    }

    public boolean checkNewApparatComment(){
        return actionWithWebElements.isElementDisplay(addedApparatComment);
    }









}
