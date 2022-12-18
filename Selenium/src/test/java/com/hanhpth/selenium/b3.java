package com.hanhpth.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class b3 {
    String baseUrl ="http://live.techpanda.org/";
    public WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void init() {
        driver.get(baseUrl);
        System.out.println("test:");
    }

    @AfterTest
    public void finish() {
        System.out.println("xong");
        driver.close();
    }

    @Test(priority = 0)
    public void TestMH(){
        System.out.println("test MH");
        driver.get(baseUrl);
        WebElement ACCOUNT = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a"));
        ACCOUNT.click();
        WebElement Login = driver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[6]/a"));
        Login.click();
        WebElement email = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.id("pass"));
        WebElement loginBT = driver.findElement(By.id("send2"));
        email.sendKeys("hanhruby2511@gmail.com");
        pass.sendKeys("5e8KRqXJf9tp2yg");
        loginBT.click();
    }

}
