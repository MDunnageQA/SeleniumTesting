package org.example;

import static java.lang.Thread.*;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private WebDriver driver;

    @Before
    public void setUP()
    {
        driver = new ChromeDriver();
    }

    @Test
    public void seleniumExampleTest() throws InterruptedException
    {
        driver.manage().window().maximize();
        sleep(2000);
        driver.get("http://google.co.uk");
        sleep(2000);
        WebElement googleSearchBar = driver.findElement(By.name("q"));
        googleSearchBar.sendKeys("neil breen pics");
        sleep(1000);
        googleSearchBar.submit();
        sleep(2000);
        WebElement linkToDogPics = driver.findElement(By.partialLinkText("Images for neil breen"));
        linkToDogPics.click();
        sleep(2000);
        WebElement imagesLink = driver.findElement(By.className("NZmxZe"));
        assertTrue(imagesLink.isDisplayed());
    }

    @After
    public void tearDown()
    {
        driver.close();
    }


}
