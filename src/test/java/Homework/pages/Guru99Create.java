package Homework.pages;

import Homework.utils.BasePage;
import Homework.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guru99Create extends BasePage {

    @FindBy(xpath = "//a[.='New Customer']")
    private WebElement newGuru99CreateButton;

    public void clickNewGuru99CreateButton(){
        BrowserUtils.wait(1);
        newGuru99CreateButton.click();
    }

}