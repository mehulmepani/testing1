import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingWebsiteSearchResults {
    @FindBy(xpath= "//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/h5/a")
    private WebElement item;



    public void findItem(){
        item.click();
    }




}