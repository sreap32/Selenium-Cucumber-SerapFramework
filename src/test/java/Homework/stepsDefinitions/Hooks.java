package Homework.stepsDefinitions;

import org.junit.After;
import org.junit.Before;
import Homework.utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    @After
    public void closing(){

    }
}
