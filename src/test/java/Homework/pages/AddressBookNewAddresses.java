package Homework.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import Homework.utils.BasePage;
import Homework.utils.BrowserUtils;

public class AddressBookNewAddresses extends BasePage {

    @FindBy(id = "address_first_name")
    private WebElement firstname;

    @FindBy(id = "address_last_name")
    private WebElement lastname;

    @FindBy(id = "address_street_address")
    private WebElement addresses;

    @FindBy(id = "address_city")
    private WebElement city;

    @FindBy(id = "address_state")
    private WebElement state;

    @FindBy(id = "address_zip_code")
    private WebElement zipcode;

    @FindBy(id = "address_country_us")
    private WebElement country;

    @FindBy(id = "address_birthday")
    private WebElement birthday;

    @FindBy(id = "address_age")
    private WebElement age;

    @FindBy(id = "address_website")
    private WebElement website;


    @FindBy(id = "address_phone")
    private WebElement phone;

    @FindBy(id = "address_interest_climb")
    private WebElement commonInterests;


    @FindBy(id = "address_note")
    private WebElement notes;

    @FindBy(xpath ="//input[@value='Create Address']")
    private WebElement createAddress;

    public void setNotes(String note) {
        BrowserUtils.wait(1);
        notes.sendKeys(note);
    }
    public void clickCreateAddressButton(){
        BrowserUtils.wait(1);
       createAddress.click();
    }
    public void setFirstname(String name1) {
        BrowserUtils.wait(1);
        firstname.sendKeys(name1);
    }
    public void setLastname(String lastname1) {
        BrowserUtils.wait(1);
        lastname.sendKeys(lastname1);
    }
    public void setAddress(String address1) {
        BrowserUtils.wait(1);
        addresses.sendKeys(address1);
    }

    public void setState(String stateName) {
        BrowserUtils.wait(1);
        Select select = new Select(state);
        select.selectByVisibleText(stateName);
    }
    public void setCity(String city1) {
        BrowserUtils.wait(1);
        city.sendKeys(city1);
    }
    public void setZipcode(String zipcode1) {
        BrowserUtils.wait(1);
        zipcode.sendKeys(zipcode1);
    }
    public void clickCountryButton(){
        BrowserUtils.wait(1);
        country.click();
    }

    public void setAge(String age1) {
        BrowserUtils.wait(1);
        age.sendKeys(age1);
    }
    public void setWebsite(String website1) {
        BrowserUtils.wait(1);
        website.sendKeys(website1);
    }
    public void setPhone(String phone1) {
        BrowserUtils.wait(1);
        phone.sendKeys(phone1);
    }
    public void setBirthday(String birthday1) {
        BrowserUtils.wait(1);
        birthday.sendKeys(birthday1);
    }
    public void clickCommonInterestsButton() {
        BrowserUtils.wait(1);
        commonInterests.click();
    }




}
