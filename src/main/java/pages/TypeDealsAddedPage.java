package pages;

import libs.ActionWithWebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TypeDealsAddedPage {

    protected LoginPage loginPage;
    protected WebDriver webDriver;
    protected Logger logger = Logger.getLogger(getClass());
    protected ActionWithWebElements actionWithWebElements;

    By dealsDictionary = By.id("deal_type");
    By addButton = By.xpath("//div[@class = 'box-tools']");
    By titleDealsTypeGrid = By.xpath("//h3[text() = 'Список типов']");
    By dealTypeNameField = By.id("deal_type_dealTypeName");
    By createDealsTypeButton = By.name("add");
    By newDealTypeName = By.xpath("//td[text() = 'ShkondaDealType'");

    String dealName = "ShkondaDealType";

    public TypeDealsAddedPage (WebDriver webDriver){
        this.webDriver = webDriver;
        actionWithWebElements = new ActionWithWebElements(webDriver);
    }

    /**
     * переход на страницу словаря Типы сделок
     */
    public void openDealsTypePage(){
        actionWithWebElements.openDictionaryPage(dealsDictionary);
        actionWithWebElements.isElementDisplay(titleDealsTypeGrid);
    }

    /**
     * открытие формы создания Типа сделки
     */
    public void openAddedDealsTypeForm(){
        actionWithWebElements.clickButton(addButton);
        actionWithWebElements.isElementDisplay(dealTypeNameField);
    }

    /**
     * ввести имя типа сделки
     */
    public void inputDealsTypeName(){
        actionWithWebElements.enterTextToTextField(dealTypeNameField, dealName);
    }

    public void clickCreateButton(){
        actionWithWebElements.clickButton(createDealsTypeButton);

    }

    public void createNewDealType(){
        openDealsTypePage();
        openAddedDealsTypeForm();
        inputDealsTypeName();
        clickCreateButton();
        actionWithWebElements.isElementDisplay(newDealTypeName);
    }









}
