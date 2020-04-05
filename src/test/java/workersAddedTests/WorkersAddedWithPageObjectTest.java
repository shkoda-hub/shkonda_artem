package workersAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class WorkersAddedWithPageObjectTest extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.loginToPage("Student", "909090");
    }
    @Test
    public void addedWorker(){
        workersAddedPage.openWorkersPage();
        workersAddedPage.openWorkersAddedForm();
        workersAddedPage.inputWorkerSurname();
        workersAddedPage.inputWorkerName();
        workersAddedPage.inputWorkerMiddleName();
        workersAddedPage.inputWorkerPhone();
        workersAddedPage.clickCreateButton();
        checkExpectedResult("Не удалось найти ФИО работника", workersAddedPage.checkNewWorkersFIO());
        checkExpectedResult("Не удалось найти номер телефона работника", workersAddedPage.checkNewWorkersPhone());

    }


}
