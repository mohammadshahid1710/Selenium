package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test
    public void loginUsingForgotPasswordMethod(){

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector ("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        CommonUtils.waitTime(1);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9876543210");
        driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
        System.out.println(driver.findElement(By.xpath("//form/p[1]")).getText());



    }
}
