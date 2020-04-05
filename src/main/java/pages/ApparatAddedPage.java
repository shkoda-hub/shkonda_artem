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


    public ApparatAddedPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openApparatPage(){
        actionWithWebElements.openDictionaryPage(dictionaryList, apparatDictionary);
    }

    public void openApparatAddedForm(){
        actionWithWebElements.clickButton(addButton);
    }

    public void inputApparatNumber(String number){
        actionWithWebElements.enterTextToTextField(apparatNumberField, number);
    }

    public void inputApparatComment(String comment){
        actionWithWebElements.enterTextToTextField(apparatCommentField, comment);
    }

    public void clickCreateButton(){
        actionWithWebElements.clickButton(createApparatButton);
    }

    public boolean checkNewApparatNumber(String number){
        return actionWithWebElements.checkNewAddedElement(number);
    }

    public boolean checkNewApparatComment(String comment){
        return actionWithWebElements.checkNewAddedElement(comment);
    }

    public boolean checkNumberField(){
        return actionWithWebElements.isElementDisplay(apparatNumberField);
    }

    public boolean checkCommentField(){
        return actionWithWebElements.isElementDisplay(apparatCommentField);
    }

    /*public boolean checkPopUp(){
        return actionWithWebElements.isElementDisplay(alert);
    }

     */









}
