package workersAddedTests;

import org.junit.Before;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class WorkersAddedWithPageObjectWithoutSurname extends AbstractParentTest {
    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedWorkerWithoutSurname(){
        workersAddedPage.openWorkersAddedForm();
        workersAddedPage.inputWorkerName("Artem11");
        workersAddedPage.inputWorkerMiddleName("Vladimirovich11");
        workersAddedPage.inputWorkerPhone("+9412914123");
        workersAddedPage.clickCreateButton();
        checkExpectedResult("", workersAddedPage.checkWorkersAddedForm());
    }

}
