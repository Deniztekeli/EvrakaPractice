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


    @FindBy(xpath = "//span[contains(text(),'Apple iPhone 12, 256GB,')]")
    public WebElement atTheTopIphone12;

    //@FindBy(xpath = "(//img)[2]")
    //@FindBy(xpath = "//span[contains(text(),'Apple iPhone 12 Pro, 512GB')]")

    @FindBy(xpath = "//th[text()=' Colour ']/following-sibling::td[1]")
    public WebElement color;

    @FindBy(xpath = "(//td[@class='a-span9'])[6]/span")
    public WebElement memoryStorageCapacity;

    @FindBy(css = "div[id=availability]>span")
    public WebElement availability;

    @FindBy(xpath = "(//td[@class='a-span9'])[2]/span")
    public WebElement modelName;

    @FindBy(xpath = "(//span[@aria-hidden='true'])[4]")
    public WebElement price;


}
