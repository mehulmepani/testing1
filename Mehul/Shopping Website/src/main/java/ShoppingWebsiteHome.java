import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingWebsiteHome {


    @FindBy(xpath= "//*[@id=\"search_query_top\"]")
    private WebElement search;
    @FindBy(xpath= "//*[@id=\"searchbox\"]/button")
    private WebElement searchbutton;


    public void search(String Search){
        search.sendKeys(Search);
        searchbutton.click();
    }




}
