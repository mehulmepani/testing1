import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertEquals;

public class ShoppingWebsiteTest {

    ChromeDriver driver;
    @Before
    public void setup() {
                System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
                driver = new ChromeDriver();
            }
     @Test
    public void test(){
         driver.manage().window().maximize();

         driver.get("http://automationpractice.com/index.php");
         ShoppingWebsiteHome homepage = PageFactory.initElements(driver,ShoppingWebsiteHome.class);
         homepage.search("dress");

         ShoppingWebsiteSearchResults results = PageFactory.initElements(driver,ShoppingWebsiteSearchResults.class);
         results.findItem();


         ShoppingWebsiteItem item = PageFactory.initElements(driver,ShoppingWebsiteItem.class);
         item.getDress();


//         String element.getText();


//         assertEquals("Printed Dress",);


     }
     @After
    public void teardown(){
        driver.quit();
     }

}
