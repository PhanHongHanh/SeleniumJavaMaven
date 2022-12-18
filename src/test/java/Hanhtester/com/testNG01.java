package Hanhtester.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNG01 {
    WebDriver driver;

    @BeforeTest
    public void Setup(){

        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("http://live.techpanda.org/index.php/");

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }
    @AfterTest
    public void TearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
