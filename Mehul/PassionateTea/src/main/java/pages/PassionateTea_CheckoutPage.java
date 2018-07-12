package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PassionateTea_CheckoutPage {

    @FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000451989411\"]/div/p/span/strong")
    private WebElement checkoutPage;


    public String  atCheckoutPage(){
        return checkoutPage.getText();
    }


}
