package parentPage;

import libs.ActionWithWebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentPage {   

    protected WebDriver webDriver;
    protected Logger logger = Logger.getLogger(getClass());
    protected ActionWithWebElements actionWithWebElements;
    //protected int timeout = 5;
    protected WebDriverWait webDriverWaitExplicitly;

    public ParentPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        actionWithWebElements = new ActionWithWebElements(webDriver);
        //webDriverWaitExplicitly = new WebDriverWait(webDriver, timeout);

    }


}
