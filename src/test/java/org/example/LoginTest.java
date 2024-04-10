package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginTest extends Base {

    @Test
    public void loginUsingForgotPasswordMethod(){

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();

        driver.findElement(By.linkText("Forgot your password?")).click();
        CommonUtils.waitTime(1);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9876543210");
        driver.findElement(By.xpath("//button[text()='Reset Login']")).click();

        String text = driver.findElement(By.xpath("//form/p[1]")).getText();
        String patternString = "'(.*?)'";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        var password = "";
        while (matcher.find()) {
              password = matcher.group(1);
        }
       driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();
        CommonUtils.waitTime(2);

        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.id("chkboxOne")).click();
        boolean checkBoxClick = driver.findElement(By.id("chkboxOne")).isEnabled();
        driver.findElement(By.className("signInBtn")).click();
        Assert.assertTrue(checkBoxClick);



    }
}
