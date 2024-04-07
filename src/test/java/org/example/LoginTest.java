package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends Base {

    @Test
    public void loginUsingForgotPasswordMethod(){

        driver.get("https://rahulshettyacademy.com/locatorspractice/");


    }
}
