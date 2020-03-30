package pages;

import libs.ActionWithWebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkersAddedPage {
    protected LoginPage loginPage;
    protected WebDriver webDriver;
    protected Logger logger = Logger.getLogger(getClass());
    protected ActionWithWebElements actionWithWebElements;

    String surname = "Shkonda";
    String name = "Artem";
    String middleName = "Vladimirovich";
    String phone = "+380990123456";

    By dictionaryDropDown = By.id("dictionary");
    By workersDictionary = By.id("workers");
    By addButton = By.xpath("//div[@class = 'box-tools']");
    By titleWorkersGrid = By.xpath("//h3[text() = 'Список сотрудников']");
    By workersSurnameField = By.id("workers_workerSurname");
    By workersNameField = By.id("workers_workerName");
    By workersMiddleNameField = By.id("workers_workerMiddleName");
    By workersPhoneField = By.id("workers_workerPhone");
    By createWorkersButton = By.name("add");
    By deleteWorkersButton = By.name("delete");
    By newWorkerSurname = By.xpath("//td[text() = 'Shkonda'");
    By newWorkerName = By.xpath("//td[text() = 'Artem'");
    By newWorkerMiddleName = By.xpath("//td[text() = 'Vladimirovich'");
    By newWorkerPhone = By.xpath("//td[text() = '+380990123456'");

    public WorkersAddedPage (WebDriver webDriver){
        this.webDriver = webDriver;
        actionWithWebElements = new ActionWithWebElements(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
    }

    /**
     * Переход на страницу словаря Сотрудники
     */
    public void openWorkersPage(){
        actionWithWebElements.openDictionaryPage(dictionaryDropDown, workersDictionary);
        actionWithWebElements.isElementDisplay(titleWorkersGrid);
    }

    /**
     * открытие формы создания записи Сотрудника
     */
    public void openAddedWorkersForm(){
        actionWithWebElements.clickButton(addButton);
        actionWithWebElements.isElementDisplay(workersSurnameField);
        actionWithWebElements.isElementDisplay(workersNameField);
        actionWithWebElements.isElementDisplay(workersMiddleNameField);
        actionWithWebElements.isElementDisplay(workersPhoneField);
    }

    /**
     * запись фамилии сотрудника
     */
    public void inputWorkersSurname(){
        actionWithWebElements.enterTextToTextField(workersSurnameField, surname);

    }

    /**
     * запись имени сотрудника
     */
    public void inputWorkersName(){
        actionWithWebElements.enterTextToTextField(workersNameField, name);

    }

    /**
     * запись отчества сотрудника
     */
    public void inputWorkersMiddleName(){
        actionWithWebElements.enterTextToTextField(workersMiddleNameField, middleName);

    }

    /**
     * запись номера телефона сотрудника
     */
    public void inputWorkersPhone(){
        actionWithWebElements.enterTextToTextField(workersPhoneField, phone);

    }

    /**
     *
     */
    public void clickCreateButton(){
        actionWithWebElements.clickButton(createWorkersButton);

    }

    public void deleteWorker(){
            actionWithWebElements.clickButton(newWorkerSurname);
            actionWithWebElements.clickButton(deleteWorkersButton);
    }

    public void createNewWorker(){
            openWorkersPage();
            openAddedWorkersForm();
            inputWorkersSurname();
            inputWorkersName();
            inputWorkersMiddleName();
            inputWorkersPhone();
            clickCreateButton();
            actionWithWebElements.isElementDisplay(newWorkerSurname);
            actionWithWebElements.isElementDisplay(newWorkerName);
            actionWithWebElements.isElementDisplay(newWorkerMiddleName);
            actionWithWebElements.isElementDisplay(newWorkerPhone);
            deleteWorker();
        }

}



