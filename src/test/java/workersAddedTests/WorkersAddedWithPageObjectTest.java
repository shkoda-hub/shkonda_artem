package workersAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class WorkersAddedWithPageObjectTest extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedWorker(){
        workersAddedPage.openWorkersAddedForm();
        workersAddedPage.inputWorkerSurname("Shkonda");
        workersAddedPage.inputWorkerName("Artem11");
        workersAddedPage.inputWorkerMiddleName("Vladimirovich11");
        workersAddedPage.inputWorkerPhone("+9412914123");
        workersAddedPage.clickCreateButton();
        checkExpectedResult("Не удалось найти ФИО работника", workersAddedPage.checkNewWorkersInfo("1","Shkonda Artem11 Vladimirovich11"));
        checkExpectedResult("Не удалось найти номер телефона работника", workersAddedPage.checkNewWorkersInfo("2","+9412914123"));
    }


}
