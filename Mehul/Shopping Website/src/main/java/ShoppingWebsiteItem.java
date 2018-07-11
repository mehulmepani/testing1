import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class ShoppingWebsiteItem {
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div/div[3]/h1")
    private WebElement checkdress;

    public String getDress() {
        return checkdress.getText();
    }


}
