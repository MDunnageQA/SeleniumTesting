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

    @Test
    public void seleniumCatPicsTest() throws InterruptedException
    {
        driver.manage().window().maximize();
        sleep(1000);
        driver.get("http://google.co.uk");
        sleep(1000);
        WebElement googleSearchBar = driver.findElement(By.name("q"));
        googleSearchBar.sendKeys("cat pics");
        sleep(1000);
        googleSearchBar.submit();
        sleep(1000);
        WebElement linkToCatPics = driver.findElement(By.partialLinkText("Images for cat"));
        linkToCatPics.click();
        sleep(1000);
        WebElement catPic = driver.findElement(By.className("tx8vtf"));
        catPic.click();
        sleep(1000);
        WebElement catPicBig = driver.findElement(By.className("n3VNCb"));
        catPicBig.click();
        sleep(4000);
    }

    @Test
    public void loginToBitCoinMine() throws InterruptedException
    {
        driver.manage().window().maximize();
        sleep(1000);
        driver.get("http://thedemosite.co.uk/login.php");
        sleep(1000);
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("DunnageBay");
        sleep(1000);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(("Chungus"));
        sleep(1000);
        WebElement successMessage = driver.findElement(By.tagName("b"));
        sleep(1000);


    }

    @After
    public void tearDown()
    {
        driver.close();
    }


}
