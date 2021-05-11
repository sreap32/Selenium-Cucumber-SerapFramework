package Homework.stepsDefinitions;

import Homework.pages.Guru99Create;
import Homework.pages.Guru99Home;
import Homework.pages.Guru99Login;
import Homework.pages.Guru99NewCustomerinfo;
import Homework.utils.BrowserUtils;
import Homework.utils.Driver;
import Homework.utils.PropertiesReading;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.Map;

public class Guru99StepsDefinitions extends Driver {
    Guru99Login loginPage = new Guru99Login();
    Guru99Home homePage =  new Guru99Home();
    Guru99Create newGuru99CreatePage = new Guru99Create();
    Guru99NewCustomerinfo  newGuru99Page = new Guru99NewCustomerinfo();


@Given("The user wants to check in login page text {string} is present")
    public void theUserWantsToCheckInLoginPageTextIsPresent(String arg0) {
        Driver.getDriver().get(PropertiesReading.getProperties("Guru99_url2"));
        WebElement text = getDriver().findElement(By.xpath("//h2[.='Guru99 Bank']"));
        System.out.println("text.getText() = " + text.getText());

    }

    @When("The user wants to login into application with given credentials")
    public void theUserWantsToLoginIntoApplicationWithGivenCredentials() {
        loginPage.setUserIdBox();
        BrowserUtils.wait(1);
        loginPage.setPasswordBox();
        BrowserUtils.wait(1);
        loginPage.setLoginButton();

    }

    @Then("The user wants to verify  that the Home page contains text as {string}")
    public void theUserWantsToVerifyThatTheHomePageContainsTextAs(String arg0) {

        BrowserUtils.wait(1);
        homePage.getTExtContainsText();



    }

    @Then("The user wants to  Click on new customer button")
    public void theUserWantsToClickOnNewCustomerButton() {

        BrowserUtils.wait(1);
        newGuru99CreatePage.clickNewGuru99CreateButton();


    }

    @Then("The user wants to verify you are in New Customer Entry Page")
    public void theUserWantsToVerifyYouAreInNewCustomerEntryPage() {

        String expectedmessage = "Add New Customer";
        String actualMessage =Driver.getDriver().findElement(By.xpath("//p[.='Add New Customer']")).getText();
        Assert.assertEquals(actualMessage,expectedmessage);

    }

    @Then("The user wants to Fill the information for new customer details")
    public void theUserWantsToFillTheInformationForNewCustomerDetails(Map<String,String> customerInfoTable) {
        newGuru99Page.setCustomerName(customerInfoTable.get("Customer Name"));
        newGuru99Page.setGenderButton(customerInfoTable.get("Gender"));
        newGuru99Page.setBirthDayBox(customerInfoTable.get("DateofBirth"));
        newGuru99Page.setAddressBox(customerInfoTable.get("Address"));
        newGuru99Page.setCityBox(customerInfoTable.get("City"));
        newGuru99Page.setStateBox(customerInfoTable.get("State"));
        newGuru99Page.setPinBox(customerInfoTable.get("PIN"));
        newGuru99Page.setPhoneNumberBox(customerInfoTable.get("Mobile Number"));
        newGuru99Page.setEmailBox(customerInfoTable.get("E-mail"));
        newGuru99Page.setPassWordBox(customerInfoTable.get("Password"));
        newGuru99Page.clickSubmitButton();


    }

    @And("The user wants to verify message as {string}")
    public void theUserWantsToVerifyMessageAs(String arg0) {

        String expectedmessage = "Customer Registered Successfully!!!";
        String actualMessage =Driver.getDriver().findElement(By.xpath("//p[.='Customer Registered Successfully!!!']")).getText();
        Assert.assertEquals(actualMessage,expectedmessage);


    }
}
