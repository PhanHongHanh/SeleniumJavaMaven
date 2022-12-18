package Initiation;

import ThucHanh2.Helpers;
import ThucHanh2.ObjectRepositoryHRM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Init {

    public WebDriver driver;
    public JavascriptExecutor js;
    public Helpers helpers;
    public ObjectRepositoryHRM objectRepositoryHRM;



    @BeforeTest
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("http://live.techpanda.org/index.php/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        js =(JavascriptExecutor) driver;

        helpers = new Helpers(driver);

        //Khởi tạo đối tượng cho ObjectRepositoryHRM class để gọi từng object qua dùng lại
        objectRepositoryHRM = new ObjectRepositoryHRM();

    }
    @AfterTest
    public void TearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }
}
