package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Base {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {

        // Initialize the WebDriver (ChromeDriver in this case)
        driver = new ChromeDriver();

        // Optional: Set other WebDriver configurations (e.g., timeouts, window size)
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        // Close the browser after all tests
        Thread.sleep(10000L);
        driver.quit();
    }

}
