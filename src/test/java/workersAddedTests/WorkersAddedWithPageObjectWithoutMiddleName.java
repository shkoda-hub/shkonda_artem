package workersAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class WorkersAddedWithPageObjectWithoutMiddleName extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedWorkerWithoutMiddleName(){
        workersAddedPage.openWorkersAddedForm();
        workersAddedPage.inputWorkerSurname("Shkonda");
        workersAddedPage.inputWorkerName("Artem11");
        workersAddedPage.inputWorkerPhone("+9412914123");
        workersAddedPage.clickCreateButton();
        checkExpectedResult("Не удалось найти ФИО работника", workersAddedPage.checkNewWorkers("Shkonda Artem11 "));
        checkExpectedResult("Не удалось найти номер телефона работника", workersAddedPage.checkNewWorkers("+9412914123"));

    }
}
