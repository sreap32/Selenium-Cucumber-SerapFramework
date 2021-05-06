package Homework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Homework.utils.BasePage;

public class AddressBookHome extends BasePage {


    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement homeButton;

    @FindBy(xpath = "//a[.='Addresses']")
    private WebElement addressesButton;

    @FindBy(xpath = "//a[.='Sign out']")
    private WebElement signOutButton;


    public void clickHomeButton() {homeButton.click();}
    public void clickAddressesButton() {addressesButton.click();}
    public void clickSignOutButton() {
        signOutButton.click();
    }



}
