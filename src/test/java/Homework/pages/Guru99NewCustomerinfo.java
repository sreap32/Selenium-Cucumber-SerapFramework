package Homework.pages;

import Homework.utils.BasePage;
import Homework.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guru99NewCustomerinfo extends BasePage {

    @FindBy(xpath = "//input[@name='name']")
    public WebElement customerName;
    @FindBy(xpath = "//input[@name='rad1'][1]")
    public WebElement genderButton;
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement birthDayBox;
    @FindBy(xpath = "//textarea[@name='addr']")
    public WebElement addressBox;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityBox;
    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateBox;
    @FindBy(xpath = "//input[@name='pinno']")
    public WebElement pinBox;
    @FindBy(xpath = "//input[@name='telephoneno']")
    public WebElement phoneNumberBox;
    @FindBy(xpath = "//input[@name='emailid']")
    public WebElement emailBox;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passWordBox;
    @FindBy(xpath = "//input[@name='sub']")
    public WebElement submitButton;
    public void setCustomerName(String name) {
        BrowserUtils.wait(1);
        customerName.sendKeys(name);
    }
    public void setGenderButton(String gender){
        BrowserUtils.wait(1);
        genderButton.sendKeys(gender);
        genderButton.click();
    }
    public void setBirthDayBox(String birthDay) {
        BrowserUtils.wait(1);
        birthDayBox.sendKeys(birthDay);
    }
    public void setAddressBox(String address) {
        BrowserUtils.wait(1);
        addressBox.sendKeys(address);
    }
    public void setCityBox(String cityName){
        BrowserUtils.wait(1);
        cityBox.sendKeys(cityName);
    }
    public void setStateBox(String stateName){
        BrowserUtils.wait(1);
        stateBox.sendKeys(stateName);
    }
    public void setPinBox(String pinNumber){
      BrowserUtils.wait(1);
        pinBox.sendKeys(pinNumber);
    }
    public void setPhoneNumberBox(String phoneNumber){
        BrowserUtils.wait(1);
        phoneNumberBox.sendKeys(phoneNumber);
    }
    public void setEmailBox(String emailName){
        BrowserUtils.wait(1);
        emailBox.sendKeys(emailName);
    }
    public void setPassWordBox(String password){
        BrowserUtils.wait(1);
        passWordBox.sendKeys(password);
    }
    public void clickSubmitButton() {
        BrowserUtils.wait(1);
        submitButton.click();
    }

}
