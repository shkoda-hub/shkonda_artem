package workersAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class WorkersAddedWithPageObjectWithoutName extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedWorkerWithoutName(){
        workersAddedPage.openWorkersAddedForm();
        workersAddedPage.inputWorkerSurname("Shkonda");
        workersAddedPage.inputWorkerMiddleName("Vladimirovich11");
        workersAddedPage.inputWorkerPhone("+9412914123");
        workersAddedPage.clickCreateButton();
        checkExpectedResult("Не удалось найти ФИО работника", workersAddedPage.checkWorkersAddedForm());

    }
}
