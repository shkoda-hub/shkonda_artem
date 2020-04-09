package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class WorkersAddedPage extends ParentPage {

    @FindBy(id = "workers")
    private WebElement workersDictionary;

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

    public void openWorkersAddedForm(){
        actionWithWebElements.openDictionaryAddedForm(workersDictionary);
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

    public boolean checkNewWorkersInfo(String idx, String text){
        return actionWithWebElements.checkNewElement(idx, text);
    }

   public boolean checkWorkersAddedForm(){
        return actionWithWebElements.isElementDisplay(workersAddedForm);
   }








}
