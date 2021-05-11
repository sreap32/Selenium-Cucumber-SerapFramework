package Homework.pages;

import Homework.utils.BasePage;
import Homework.utils.PropertiesReading;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guru99Login extends BasePage{

    @FindBy(xpath = "//input[@name = 'uid']")
    private WebElement userIdBox;

    @FindBy(xpath = "//input[@name = 'password']")
    private WebElement passwordBox;

    @FindBy(xpath = "//input[@type = 'submit']")
    private WebElement loginButton;




    public void setUserIdBox(){userIdBox.sendKeys(PropertiesReading.getProperties("Guru99_UserID"));}

    public void setPasswordBox(){passwordBox.sendKeys(PropertiesReading.getProperties("Guru99_Password"));}
    public void setLoginButton(){loginButton.click();}


    public void Login(){

        userIdBox.sendKeys(PropertiesReading.getProperties("Guru99_UserID"));
        passwordBox.sendKeys(PropertiesReading.getProperties("Guru99_Password"));
        loginButton.click();

    }








}
