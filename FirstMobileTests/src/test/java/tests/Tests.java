package tests;

import core.AndroidOptions;
import elements.Buttons;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class Tests {


    AndroidOptions options = new AndroidOptions();
    Buttons buttons = new Buttons();

    @Before
    public void setCap() throws MalformedURLException {
        options.setCapability();
        options.logIn();
    }

    @Test
    public void isVisibleADTest() {
        Assert.assertTrue(options.visibleElementAD());
    }

    @Test
    public void haveTextADTest(){
        Assert.assertTrue(options.haveTextAD());
    }
    @After
    public void logOut(){
        options.logOut();
    }
}
