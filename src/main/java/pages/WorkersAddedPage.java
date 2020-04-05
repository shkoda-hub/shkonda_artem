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

    @FindBy(xpath = "//td[contains(text(),'Shkonda Artem Vladimirovich')]")
    private WebElement addedWorkerFIO;

    @FindBy(xpath = "//td[contains(text(),'+380990123456')]")
    private WebElement addedWorkerPhone;

    String surname = "Shkonda";
    String name = "Artem";
    String middleName = "Vladimirovich";
    String phone = "+380990123456";

    public WorkersAddedPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openWorkersPage(){
        actionWithWebElements.openDictionaryPage(dictionaryList, workersDictionary);
    }

    public void openWorkersAddedForm(){
        actionWithWebElements.clickButton(addButton);
    }

    public void inputWorkerSurname(){
        actionWithWebElements.enterTextToTextField(workersSurnameField, surname);
    }

    public void inputWorkerName(){
        actionWithWebElements.enterTextToTextField(workersNameField, name);
    }

    public void inputWorkerMiddleName(){
        actionWithWebElements.enterTextToTextField(workersMiddleNameField, middleName);
    }

    public void inputWorkerPhone(){
        actionWithWebElements.enterTextToTextField(workersPhoneField, phone);
    }

    public void clickCreateButton(){
        actionWithWebElements.clickButton(createWorkersButton);
    }

    public boolean checkNewWorkersFIO(){
        return actionWithWebElements.isElementDisplay(addedWorkerFIO);
    }

    public boolean checkNewWorkersPhone(){
        return actionWithWebElements.isElementDisplay(addedWorkerPhone);
    }






}
