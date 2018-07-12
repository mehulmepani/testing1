package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class
PassionateTea_MenuPage {
    @FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
    private WebElement menuPage;


    @FindBy(id = "wsb-element-00000000-0000-0000-0000-000453230000")
    private WebElement product;

    @FindBy(id = "wsb-button-00000000-0000-0000-0000-000451955160")
    private WebElement checkout;


    public String  findProduct(){
         return product.getText();
    }

    public void clickProduct(){
        menuPage.click();
        checkout.click();
    }

}
