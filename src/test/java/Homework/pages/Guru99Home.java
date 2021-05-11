package Homework.pages;

import Homework.utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guru99Home extends BasePage {

    @FindBy(xpath ="//td[.='Manger Id : mngr324930']")
    private WebElement containsText;

    public void getTExtContainsText(){ containsText.getText(); }


}
