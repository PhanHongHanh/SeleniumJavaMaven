package com.hanhpth.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class b2 {
    String baseUrl ="https://shopee.vn/V%C3%A1y-Voan-Ti%E1%BB%83u-Th%C6%B0-C%E1%BB%95-T%C3%A0u-ALICE-Thi%E1%BA%BFt-K%E1%BA%BF-D%C3%A0i-Tay-Ph%E1%BB%91i-C%C3%BAc-B%E1%BB%8Dc-Ch%C3%A2t-Li%E1%BB%87u-M%E1%BB%81m-M%E1%BA%A1i-H%E1%BB%8Da-Ti%E1%BA%BFt-H%E1%BA%A1t-Sang-Ch%E1%BA%A3nh-V784-i.272064664.17023675190?sp_atk=9183dfab-6851-4d73-a557-aee1a19a8b7d&xptdk=9183dfab-6851-4d73-a557-aee1a19a8b7d";
    public WebDriver driver = new ChromeDriver();


    @Test(priority = 0)
    public void TestMH(){
        System.setProperty("webdriver.clrome.driver","chromedriver.exe");
        driver.get(baseUrl);

    }

//    @Test(priority = 1)
//    public void TestTile() {
//        System.out.println("test tile");
//        String expectedTitle = "Shopee Việt Nam | Mua và Bán Trên Ứng Dụng Di Động Hoặc Website";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle);
//    }

    @Test(priority = 1)
    public void TestPlayVideo(){

        System.out.println("Test play video");
        WebElement playVD = driver.findElement(By.className("NQvRFp"));
     //   driver.switchTo().frame(playVD);
        playVD.submit();

//        driver.switchTo().frame(playVD);
//        WebElement play=driver.findElement(By.xpath("//*[@id=\"modal\"]/div[3]/div[1]/div/div[1]/svg"));
//        play.click();
    }
}
