package pages;

import libs.ActionWithWebElements;
import libs.ConfigClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.lang.ref.SoftReference;

public class LoginPage extends ParentPage {

    //By inputLoginName = By.name("_username");
    @FindBy(name = "_username")
    private WebElement inputLoginName;
    //By inputPasswordName = By.name("_password");
    @FindBy(name = "_password")
    private WebElement inputPasswordName;
    //By inputButtonXpath = By.xpath("//button[@type = 'submit']");
    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement inputButtonXpath;

    @FindBy(xpath = "//div[@class='login-box-body']")
    private WebElement loginBox;

    String url = "http://v3.test.itpmgroup.com";

    public LoginPage(WebDriver webDriver){
        super(webDriver);
    }


    public void openPage(){
        try{
             webDriver.get(url);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void openPageLogin(){
        try{
            webDriver.get(ConfigClass.getCfgValue("base_url")+ "/login");
            logger.info("Page login was opened");
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("");

        }
    }

    public boolean isLoginBoxRefreshed(){
        return actionWithWebElements.isElementDisplay(loginBox);
    }

    public void inputLogin(String text){
        actionWithWebElements.enterTextToTextField(inputLoginName, text);
    }

    public void inputPassword (String text){
        actionWithWebElements.enterTextToTextField(inputPasswordName, text);
    }

    public void clickSubmitButton(){
        actionWithWebElements.clickButton(inputButtonXpath);
    }

    public void loginToPage(String login, String password){
        openPageLogin();
        inputLogin(login);
        inputPassword(password);
        clickSubmitButton();
    }

    public void validLoginToPage(){
        openPageLogin();
        inputLogin("Student");
        inputPassword("909090");
        clickSubmitButton();
    }

}
