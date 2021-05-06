package Homework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Homework.utils.BasePage;
import Homework.utils.PropertiesReading;

public class AddressBookLogin extends BasePage {


    @FindBy(id="session_email")
    private WebElement emailBox;

    @FindBy(id="session_password")
    private WebElement passwordBox;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement signInButton;


   public void setEmailBox(){emailBox.sendKeys(PropertiesReading.getProperties("userName"));}

   public void setPasswordBox(){passwordBox.sendKeys(PropertiesReading.getProperties("password"));}

   public void setSignInButton(){signInButton.click();}

   public void Login(){

       emailBox.sendKeys(PropertiesReading.getProperties("userName"));
       passwordBox.sendKeys(PropertiesReading.getProperties("password"));
       signInButton.click();
   }
}
