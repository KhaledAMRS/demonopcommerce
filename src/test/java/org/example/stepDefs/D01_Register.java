package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.P01_register;
import org.openqa.selenium.By;

import static org.example.stepDefs.Hooks.driver;

public class D01_Register {

    P01_register register = new P01_register();

    @Given("user go to register page")
    public void step1()
    {
        register.regLink().click();
        //Test second commit
    }


}
