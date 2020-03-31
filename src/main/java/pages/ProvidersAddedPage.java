package pages;

import libs.ActionWithWebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProvidersAddedPage {

    protected LoginPage loginPage;
    protected WebDriver webDriver;
    protected Logger logger = Logger.getLogger(getClass());
    protected ActionWithWebElements actionWithWebElements;

    By providersDictionary = By.id("prov_cus");
    By addButton = By.xpath("//div[@class = 'box-tools']");
    By titleProvidersGrid = By.xpath("//h3[text() = 'Список контрагентов']");
    By providerNameField = By.id("prov_cus_proCustName");
    By providerAddressField = By.id("prov_cus_proCustAddress");
    By providerPhoneField = By.id("prov_cus_proCustPhone");
    By privatePersonCheckBox = By.id("prov_cus_proCustIsFl");
    By isOurFirmCheckBox = By.id("prov_cus_isOurFirm");
    By createProviderButton = By.name("add");
    By newProviderName = By.xpath("//td[text() = ''");
    By newProviderPhone = By.xpath("//td[text() = ''");

    String providerName = "";
    String providerAddress = "";
    String providerPhone = "";

    public ProvidersAddedPage(WebDriver webDriver){
        this.webDriver = webDriver;
        actionWithWebElements = new ActionWithWebElements(webDriver);
    }

    /**
     * переход на страницу словаря Стороны сделок
     */
    public void openProvidersPage(){
        actionWithWebElements.openDictionaryPage(providersDictionary);
        actionWithWebElements.isElementDisplay(titleProvidersGrid);
    }

    /**
     * открытие формы создания Стороны сделок
     */
    public void openAddedProviderForm(){
        actionWithWebElements.clickButton(addButton);
        actionWithWebElements.isElementDisplay(providerNameField);
    }

    public void inputProviderName(){

    }

    public void inputProviderAddress(){

    }

    public void inputProviderPhone(){

    }

    public void checkPrivatePerson(){

    }

    public void checkIsOurFirm(){

    }

    public void clickCreateButton(){

    }

    public void createNewProvider(){
        
    }









}
