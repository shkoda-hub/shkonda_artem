package loginTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import libs.ActionWithWebElements;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest{

    private WebDriver webdriver = driverInit();


    private WebDriver driverInit(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    /*@Test
    public void validLogin(){
        webdriver.get("http://v3.test.itpmgroup.com");
        webdriver.findElement(By.name("_username")).clear();
        webdriver.findElement(By.name("_username")).sendKeys("Student");
        webdriver.findElement(By.name("_password")).clear();
        webdriver.findElement(By.name("_password")).sendKeys("909090");
        webdriver.findElement(By.xpath("//button[@type = 'submit']")).click();
        Assert.assertTrue(webdriver.findElement(By.xpath("//div[@class = 'pull-left info']")).isDisplayed());
    }
    @After
    public void tearDown(){
        webdriver.quit();
    }

     */






}







