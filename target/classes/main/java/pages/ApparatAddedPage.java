package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.List;


public class ApparatAddedPage extends ParentPage {

    /**
     * список колонок последней строки грида
     */
    @FindBy(xpath = "//tr[last()]//td")
    private List<WebElement> list;

    @FindBy(id = "dictionary")
    private WebElement dictionaryList;

    @FindBy(id = "apparat")
    private WebElement apparatDictionary;

    @FindBy(className = "box-tools")
    private WebElement openApparatAddedFormButton;

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

    @FindBy(id = "device_list")
    private WebElement table;

    @FindBy(xpath = "//tr[last()][td]")
    private WebElement lastRow;

    @FindBy(xpath = "//tr[last()]//td")
    private WebElement lastRow1;



    public ApparatAddedPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openApparatAddedForm(){
        actionWithWebElements.clickButton(dictionaryList);
        actionWithWebElements.clickButton(apparatDictionary);
        actionWithWebElements.clickButton(openApparatAddedFormButton);
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

    public boolean checkNewApparat (String text) {
        return actionWithWebElements.isTextDisplayedInElement(lastRow, text);
    }

    public boolean checkApparatAddedForm(){
        return actionWithWebElements.isElementDisplay(apparatAddedForm);
    }

    /**
     * по индексу можно получить текст элемента списка List<WebElement>
     * @param idx
     * @return
     */
    public String check(int idx) {
        return list.get(idx).getText();
    }



}
