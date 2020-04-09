package workersAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class WorkersAddedWithPageObjectWithoutPhone extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedWorkerWithoutPhone(){
        workersAddedPage.openWorkersAddedForm();
        workersAddedPage.inputWorkerSurname("Shkonda11");
        workersAddedPage.inputWorkerName("Artem11");
        workersAddedPage.inputWorkerMiddleName("Vladimirovich11");
        workersAddedPage.clickCreateButton();
        checkExpectedResult("Не удалось найти ФИО работника", workersAddedPage.checkNewWorkersInfo("1","Shkonda11 Artem11 Vladimirovich11"));

    }
}
