package libs;


import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionWithWebElements {

    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    WebDriverWait webDriverWait_10, webDriverWait_15;


    public ActionWithWebElements (WebDriver webDriver){
        this.webDriver = webDriver;
        webDriverWait_10 = new WebDriverWait(webDriver, 10);
        webDriverWait_15 = new WebDriverWait(webDriver, 15);
    }
    

    public void enterTextToTextField(WebElement element, String text){
        try {
            element.clear();
            element.sendKeys(text);
            logger.info("Значение '"+text+"' было записано в поле");
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("Текст не был записан");

        }

    }
    public void clickButton(WebElement element){
        try{
            //webDriverWait_10.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            logger.info("Клик на элемент");
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("Не удалось кликнуть на '"+element+"'");
        }
    }

    public boolean isElementDisplay(WebElement element){
        try {
            //webDriverWait_15.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("Элемент '"+element+"' не был найден");
            return false;
        }
    }

    public boolean  isElementEnable(WebElement element){
        try{
            return element.isEnabled();
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("");
            return false;
        }
    }

    public void setCheckBox (WebElement element, boolean state){
        try{
            if(element.isSelected()==state){
            }
            else {
                element.click();
            }
            logger.info("Чек-бокс '"+element+"' в состоянии "+state);
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("Не удаловс перевести чек-бокс '"+element+"' в состояние "+state);
        }
    }

    public void selectElementFromDD(WebElement element, String itemName){
        Select dropDownValue = new Select(element);
        try {
            dropDownValue.selectByVisibleText(itemName);
            logger.info("Значение '"+itemName+"' было выбрано в списке");
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("");
        }

    }

    public boolean isTextDisplayedInElement(WebElement element, String text){
        try {
            String elementText = element.getText();
            return elementText.contains(text);
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("Текст '"+text+"' не отображается в элементе");
            return false;
        }
    }

    /*public boolean getAlert(){
        try {
            webDriverWait_10.until(ExpectedConditions.alertIsPresent());
            return webDriver.switchTo().alert().getText().contains("Заполните это поле");
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("");
            return false;
        }
    }

     */







}
