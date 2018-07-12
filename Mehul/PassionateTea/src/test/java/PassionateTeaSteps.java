import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.PassionateTea_CheckoutPage;
import pages.PassionateTea_HomePage;
import pages.PassionateTea_MenuPage;

import static org.junit.Assert.assertEquals;

public class PassionateTeaSteps {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Given("^the correct web address$")
        public void the_correct_web_address() {
            // Write code here that turns the phrase above into concrete actions
            driver.get("http://www.practiceselenium.com");
    }

    @When("^I navigate to the 'Menu' page$")
    public void i_navigate_to_the_Menu_page() {
        PassionateTea_HomePage page = PageFactory.initElements(driver,PassionateTea_HomePage.class);
        page.menu();
    }

    @Then("^I can browse a list of the available products\\.$")
    public void i_can_browse_a_list_of_the_available_products() {
        PassionateTea_MenuPage search1 = PageFactory.initElements(driver,PassionateTea_MenuPage.class);
        assertEquals("Green Tea",search1.findProduct());
    }

    @When("^I click the checkout button$")
    public void i_click_the_checkout_button() {
        //driver.get("http://www.practiceselenium.com/menu.html");
        PassionateTea_MenuPage click1 = PageFactory.initElements(driver,PassionateTea_MenuPage.class);
        click1.clickProduct();
    }

    @Then("^I am taken to the checkout page$")
    public void i_am_taken_to_the_checkout_page()  {
        PassionateTea_CheckoutPage checkout1 = PageFactory.initElements(driver,PassionateTea_CheckoutPage.class);
        assertEquals("Pay with Credit Card or Log In",checkout1.atCheckoutPage());
    }

}
