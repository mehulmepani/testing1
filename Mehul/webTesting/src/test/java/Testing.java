import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertEquals;

public class Testing {

    ChromeDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();

    }
    //@After
    //public void teardowen(){
     //   driver.quit();
    //}
    @Test
    public void methodTest() throws InterruptedException {
        Thread.sleep(3000);


        driver.manage().window().maximize();
        driver.get("https://www.google.co.uk");
        WebElement checkElement = driver.findElement(By.id("lst-ib"));
        checkElement.sendKeys("hello");

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]"));
        submitButton.click();

    }
}
