import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

public class TheDemoSiteTest2 {
    ChromeDriver driver;
    ExtentReports extent = new ExtentReports("C:/Users/Admin/Desktop/report.html",true);




    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Test
    public void testHome() {
        driver.manage().window().maximize();

        DDT.DDT_Method();

//        FileInputStream file = new FileInputStream();
//        XSSFWorkbook workbook = new XSSFWorkbook(file);
//        XSSFSheet sheet = workbook.getSheetAt(0);
//
//        XSSFCell  username = XSSFSheet.getRow(1).getCell(0);
//        XSSFCell password = XSSFSheet.getRow(1).getCell(1);
//
//        String user = username.getStringCellValue();
//        String pass = password.getStringCellValue();


        driver.get("http://thedemosite.co.uk/index.php");
        TheDemoSiteHomePage page = PageFactory.initElements(driver,TheDemoSiteHomePage.class);
        page.addUser();

        AddUserPage secondPage = PageFactory.initElements(driver,AddUserPage.class);
        secondPage.createuser("user1","1234");

        LoginPage thirdPage = PageFactory.initElements(driver, LoginPage.class);
        thirdPage.login("user1", "1234");

        ExtentTest test;
        test = extent.startTest("Test username and password");
        test .log(LogStatus.INFO, "browser Started");
        test.log(LogStatus.PASS,"Test Has Passed");
        extent.endTest(test);
        extent.flush();
    }

}
