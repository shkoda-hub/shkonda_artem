package libs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ActionWithWebElements {

    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    //By dictionaryList = By.id("dictionary");
    @FindBy(id = "dictionary")
    private WebElement dictionaryList;

    public ActionWithWebElements (WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void enterTextToTextField(WebElement element, String text){
        try {
            element.clear();
            element.sendKeys(text);
            logger.info("");
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("");

        }

    }
    public void clickButton(WebElement element){
        try{
            element.click();
            logger.info("");
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("");
        }
    }

    public boolean isElementDisplay(WebElement element){
        try {
            return element.isDisplayed();
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("");
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
            logger.info("The check box is "+state);
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("");
        }
    }

    public void selectElementFromDD(WebElement element, String itemName){
        Select dropDownValue = new Select(element);
        try {
            dropDownValue.selectByVisibleText(itemName);
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("");
        }

    }

    public void openDictionaryPage(WebElement dictionary){
        try {
            dictionaryList.click();
            dictionary.click();
            logger.info("");
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("");
        }
    }

}
