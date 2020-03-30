package apparatAddedTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;


public class ApparatAddedTest {

    private WebDriver webdriver = driverInit();

    private WebDriver driverInit(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }



}
