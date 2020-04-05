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
        workersAddedPage.inputWorkerSurname("Shkonda");
        workersAddedPage.inputWorkerName("Artem11");
        workersAddedPage.inputWorkerMiddleName("Vladimirovich11");
        workersAddedPage.inputWorkerPhone("+9412914123");
        workersAddedPage.clickCreateButton();
        checkExpectedResult("Не удалось найти ФИО работника", workersAddedPage.checkNewWorkers("Shkonda Artem11 Vladimirovich11"));
        checkExpectedResult("Не удалось найти номер телефона работника", workersAddedPage.checkNewWorkers("+9412914123"));

    }


}
