package pages;

import libs.ActionWithWebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.nio.file.WatchEvent;
import org.apache.log4j.Logger;

public class ApparatAddedPage {
    protected LoginPage loginPage;
    protected WebDriver webDriver;
    protected Logger logger = Logger.getLogger(getClass());
    protected ActionWithWebElements actionWithWebElements;

    String number = "0000111001";
    String comment = "New apparat SN:0000111001";

    By dictionaryList = By.id("dictionary");
    By apparatDictionary = By.id("apparat");
    By addButton = By.xpath("//div[@class = 'box-tools']");
    By titleApparatGrid = By.xpath("//h3[text() = 'Список аппаратов']");
    By apparatNumberField = By.id("apparat_apparatNumber");
    By apparatCommentField = By.id("apparat_apparatComment");
    By createApparatButton = By.name("add");
    By newApparatNumber = By.xpath("//td[text() = '0000111001']");
    By newApparatComment = By.xpath("//td[text() = 'New apparat SN:0000111001']");
    By deleteApparatButton = By.name("delete");

    public ApparatAddedPage (WebDriver webDriver){
        this.webDriver = webDriver;
        actionWithWebElements = new ActionWithWebElements(webDriver);
        loginPage = new LoginPage(webDriver);
    }

    /**
     *
     * Переход на страницу словаря Аппарат
     */
    public void openApparatPage(){
        actionWithWebElements.openDictionaryPage(dictionaryList, apparatDictionary);
        actionWithWebElements.isElementDisplay(titleApparatGrid);
    }

    /**
     * Открытие формы создания новой записи Аппарата
     */
    public void openAddedApparatForm(){
        actionWithWebElements.clickButton(addButton);
        actionWithWebElements.isElementDisplay(apparatNumberField);
        actionWithWebElements.isElementDisplay(apparatCommentField);
    }

    /**
     * Запись номера аппарата
     * @param
     */
    public void inputApparatNumber(){
        actionWithWebElements.enterTextToTextField(apparatNumberField, number);
    }

    /**
     * Запись комментария к аппарату
     * @param
     */
    public void inputApparatComment(){
        actionWithWebElements.enterTextToTextField(apparatCommentField, comment);

    }

    /**
     * нажатие на кнопку Создать
     */
    public void clickCreateButton(){
        actionWithWebElements.clickButton(createApparatButton);
    }

    /**
     * удаление записи Аппарата
     * @param
     */
    public void deleteApparat(){
        actionWithWebElements.clickButton(newApparatComment);
        actionWithWebElements.clickButton(deleteApparatButton);

    }

    /**
     * создание нового Аппарата
     */
    public void createNewApparat(){
        openApparatPage();
        if(actionWithWebElements.isElementDisplay(newApparatComment) == true && actionWithWebElements.isElementDisplay(newApparatNumber) ==true ) {
            deleteApparat();
        }
        else {
            openAddedApparatForm();
            inputApparatNumber();
            inputApparatComment();
            clickCreateButton();
            actionWithWebElements.isElementDisplay(newApparatNumber);
            actionWithWebElements.isElementDisplay(newApparatComment);
            deleteApparat();
        }
    }















}
