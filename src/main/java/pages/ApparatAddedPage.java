package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ApparatAddedPage extends ParentPage {

    @FindBy(id = "apparat")
    private WebElement apparatDictionary;

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

    @FindBy(name = "apparat")
    private WebElement apparatAddedForm;


    public ApparatAddedPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openApparatAddedForm(){
        actionWithWebElements.openDictionaryAddedForm(apparatDictionary);
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

    public boolean checkApparatAddedForm(){
        return actionWithWebElements.isElementDisplay(apparatAddedForm);
    }

    public boolean getAlert(){
        return actionWithWebElements.getAlert();
    }













}
