package evraka.pages;

import evraka.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//span[.='RESULTS']")
    public WebElement resultsList;

    @FindBy(xpath = "//span[.='Apple iPhone 12 Pro Max, 512GB, Pacific Blue - Unlocked (Renewed Premium)']")
    public WebElement atTheTopIphone12;

    @FindBy(xpath = "(//span[@class='selection'])[2]")
    public WebElement color;

    @FindBy(xpath = "(//span[@class='selection'])[3]")
    public WebElement memoryStorageCapacity;

    @FindBy(css = "div[id=availability]>span")
    public WebElement availability;

    @FindBy(xpath = "(//td[@class='a-span9'])[2]/span")
    public WebElement modelName;

    @FindBy(xpath = "(//span[@aria-hidden='true'])[4]")
    public WebElement price;


}
