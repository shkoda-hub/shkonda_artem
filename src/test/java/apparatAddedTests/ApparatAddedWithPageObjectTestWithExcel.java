package apparatAddedTests;

import libs.ConfigClass;
import libs.SpreadsheetData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTests.AbstractParentTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ApparatAddedWithPageObjectTestWithExcel extends AbstractParentTest {
    private String number, comment;

    public ApparatAddedWithPageObjectTestWithExcel(String number, String comment) {
        this.number = number;
        this.comment = comment;
    }

    @Parameterized.Parameters(name = "Parameters are: number {0} and comment {1}")
    public static Collection testData() throws IOException {
        InputStream spreadsheet
                = new FileInputStream(ConfigClass.getCfgValue("DATA_FILE_PATH")
                +"testDataApparat.xls");
        return new SpreadsheetData(spreadsheet, "validApparatData").getData();
    }

    @Before
    public void login(){
        loginPage.validLoginToPage();
    }
    @Test
    public void addedApparat(){
        apparatAddedPage.openApparatAddedForm();
        apparatAddedPage.inputApparatNumber(number);
        apparatAddedPage.inputApparatComment(comment);
        apparatAddedPage.clickCreateButton();
        checkExpectedResult("Не удалось найти номер нового аппарата", apparatAddedPage.checkNewApparatInfo("1", number));
        checkExpectedResult("Не удалось найти комментарий нового аппарата", apparatAddedPage.checkNewApparatInfo("2", comment));

    }
}
