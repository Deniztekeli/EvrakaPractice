package evraka.step_definitions;

import evraka.pages.AmazonPage;
import evraka.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class AmazonShopping_StepDefinitions {

    AmazonPage amazonPage = new AmazonPage();
    @When("Go to url")
    public void go_to() {
        Driver.getDriver().get("https://www.amazon.com");
    }
    @When("Search iPhone12 512")
    public void search_i_phone12() {
        amazonPage.searchBox.sendKeys("iphone12 512" + Keys.ENTER);
    }
    @When("Check that the results are listed")
    public void check_that_the_results_are_listed() {
        Assert.assertTrue(amazonPage.resultsList.isDisplayed());
    }
    @When("Click iPhone12 at the top of the list")
    public void click_i_phone12_at_the_top_of_the_list() {
        amazonPage.atTheTopIphone12.click();
    }
    @Then("Log the following values for each size .Size information .Price .Color .Stock status")
    public void log_the_following_values_for_each_size_size_information_price_color_stock_status() {

        String info = amazonPage.modelName.getText() + " Size: " + amazonPage.memoryStorageCapacity.getText()  +
                "\nColor: " + amazonPage.color.getText()  + " Price: " + amazonPage.price.getText()  +
                "\nStock: " + amazonPage.availability.getText() ;

        System.out.println(info);
    }

    @After
    public void teardown(){
        Driver.closeDriver();
    }


}
