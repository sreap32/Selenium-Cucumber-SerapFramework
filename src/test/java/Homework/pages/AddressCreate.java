package Homework.pages;

import Homework.utils.BasePage;
import Homework.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressCreate extends BasePage {

    @FindBy(xpath = "//a[.='New Address']")
    private WebElement newAddresscreateButton;


    public void clickNewaddressesButton() {
        BrowserUtils.wait(1);
        newAddresscreateButton.click();
    }
}
