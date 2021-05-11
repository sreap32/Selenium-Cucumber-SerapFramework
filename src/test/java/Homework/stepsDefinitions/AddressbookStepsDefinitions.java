package Homework.stepsDefinitions;

import Homework.pages.AddressCreate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import Homework.pages.AddressBookHome;
import Homework.pages.AddressBookLogin;
import Homework.pages.AddressBookNewAddresses;
import Homework.utils.BrowserUtils;
import Homework.utils.Driver;
import Homework.utils.PropertiesReading;

import java.util.Map;

public class AddressbookStepsDefinitions {
    AddressBookLogin loginPage = new AddressBookLogin();
    AddressBookHome homePage = new AddressBookHome();
    AddressBookNewAddresses newAddressesPage = new AddressBookNewAddresses();
    AddressCreate  newAddressCreatePage  = new AddressCreate();



    @Given("The user wants to Address Book")
    public void theUserWantsToAddressBook() {

       // driver.get("http://a.testaddressbook.com/");
        Driver.getDriver().get(PropertiesReading.getProperties("AddressBook_url"));


    }


    @When("The user wants to enter Email and Password")
    public void theUserWantsToEnterEmailAndPassword() {

        loginPage.setEmailBox();
        BrowserUtils.wait(1);
        loginPage.setPasswordBox();

    }

    @Then("Click Sign in button")
    public void clickSignInButton() {

        BrowserUtils.wait(1);
        loginPage.setSignInButton();
    }

    @Then("Click Addresses")
    public void clickAddresses() {

    BrowserUtils.wait(1);
    homePage.clickAddressesButton();


    }

    @Then("Click New Addresses")
    public void clickNewAddresses() {
    BrowserUtils.wait(1);
        newAddressCreatePage.clickNewaddressesButton();

    }

    @Then("Enter all infos")
    public void enterAllInfos(Map<String,String> enterAllInfos) {

    newAddressesPage.setFirstname(enterAllInfos.get("FirstName"));
        newAddressesPage.setLastname(enterAllInfos.get("LastName"));
        newAddressesPage.setAddress(enterAllInfos.get("Address1"));
        newAddressesPage.setAddress(enterAllInfos.get("Address2"));
        newAddressesPage.setCity(enterAllInfos.get("City"));
        newAddressesPage.setState(enterAllInfos.get("State"));
        newAddressesPage.setZipcode(enterAllInfos.get("ZipCode"));
        newAddressesPage.clickCountryButton();
        newAddressesPage.setBirthday(enterAllInfos.get("Birthday"));
        newAddressesPage.setAge(enterAllInfos.get("Age"));
        newAddressesPage.setWebsite(enterAllInfos.get("Website"));
        newAddressesPage.setPhone(enterAllInfos.get("Phone"));
        newAddressesPage.clickCommonInterestsButton();
        newAddressesPage.setNotes(enterAllInfos.get("Note"));






    }

    @Then("Click Create Addresses button")
    public void clickCreateAddressesButton() {

        BrowserUtils.wait(1);
        newAddressesPage.clickCreateAddressButton();






    }

    @Then("Check success message")
    public void checkSuccessMessage() {

       String expectedmessage = Driver.getDriver().findElement(By.xpath("//div[@data-test='notice']")).getText();

        String success = "Address was successfully created.";
        Assert.assertEquals(success,expectedmessage,"Not Success");





    }

    @And("Click Sign out")
    public void clickSignOut() {
        homePage.clickSignOutButton();


    }


}
