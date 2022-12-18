package Hanhtester.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNGTest {
    WebDriver driver;

    @Test (priority = 0)// Priority thứ tự chạy
    public void Test01(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        driver.quit();
    }

    @Test (priority = 1)// Priority thứ tự chạy
    public void Test02(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

        driver.quit();
    }
}
