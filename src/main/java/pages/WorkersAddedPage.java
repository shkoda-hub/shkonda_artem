package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class WorkersAddedPage extends ParentPage {

    @FindBy(id = "workers")
    private WebElement workersDictionary;

    @FindBy(id = "dictionary")
    private WebElement dictionaryList;

    @FindBy(xpath = "//div[@class = 'box-tools']")
    private WebElement addButton;

    @FindBy(id = "workers_workerSurname")
    private WebElement workersSurnameField;

    @FindBy(id = "workers_workerName")
    private WebElement workersNameField;

    @FindBy(id = "workers_workerMiddleName")
    private WebElement workersMiddleNameField;

    @FindBy(id = "workers_workerPhone")
    private WebElement workersPhoneField;

    @FindBy(name = "add")
    private WebElement createWorkersButton;

    @FindBy(name = "workers")
    private WebElement workersAddedForm;


    public WorkersAddedPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openWorkersPage(){
        actionWithWebElements.openDictionaryPage(dictionaryList, workersDictionary);
    }

    public void openWorkersAddedForm(){
        actionWithWebElements.clickButton(addButton);
    }

    public void inputWorkerSurname(String surname){
        actionWithWebElements.enterTextToTextField(workersSurnameField, surname);
    }

    public void inputWorkerName(String name){
        actionWithWebElements.enterTextToTextField(workersNameField, name);
    }

    public void inputWorkerMiddleName(String middleName){
        actionWithWebElements.enterTextToTextField(workersMiddleNameField, middleName);
    }

    public void inputWorkerPhone(String phone){
        actionWithWebElements.enterTextToTextField(workersPhoneField, phone);
    }

    public void clickCreateButton(){
        actionWithWebElements.clickButton(createWorkersButton);
    }

    public boolean checkNewWorkers(String element){
        return actionWithWebElements.checkNewAddedElement(element);
    }

   public boolean checkWorkersAddedForm(){
        return actionWithWebElements.isElementDisplay(workersAddedForm);
   }








}
