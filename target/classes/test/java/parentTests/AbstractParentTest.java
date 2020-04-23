package parentTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import libs.Utils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import java.util.concurrent.TimeUnit;


public class AbstractParentTest {
    WebDriver webDriver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected ApparatAddedPage apparatAddedPage;
    protected WorkersAddedPage workersAddedPage;
    protected SpareTypesAddedPage spareTypesAddedPage;
    protected SpareAddedPage spareAddedPage;
    protected ProvidersAddedPage providersAddedPage;
    protected DealTypeAddedPage dealTypeAddedPage;
    protected DealsAddedPage dealsAddedPage;
    protected Utils utils;
    private String pathToScreenShot;

    @Rule
    public TestName testName = new TestName();

    @Before
    public void setUp() throws Exception{
        pathToScreenShot = "..\\shkonda_project\\target\\screenshot\\" + this.getClass().getPackage().getName() + "\\" + this.getClass().getSimpleName()
                + this.testName.getMethodName() + ".jpg";

        webDriver = driverInit();
        /*try {
            webDriver = new RemoteWebDriver(
                    new URL("http://localhost:4444/wd/hub"),
                    DesiredCapabilities.chrome());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

         */

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        apparatAddedPage = new ApparatAddedPage(webDriver);
        workersAddedPage = new WorkersAddedPage(webDriver);
        spareTypesAddedPage = new SpareTypesAddedPage(webDriver);
        spareAddedPage = new SpareAddedPage(webDriver);
        providersAddedPage = new ProvidersAddedPage(webDriver);
        dealTypeAddedPage = new DealTypeAddedPage(webDriver);
        dealsAddedPage = new DealsAddedPage(webDriver);
        utils = new Utils();
    }

    private WebDriver driverInit() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }



    @After
    public void tearDown(){
        webDriver.quit();
    }

    protected void checkExpectedResult(String massage, boolean actualResult){
        if (!actualResult == true){
            utils.screenShot(pathToScreenShot, webDriver);
        }
        Assert.assertEquals(massage, true, actualResult);
    }
}
