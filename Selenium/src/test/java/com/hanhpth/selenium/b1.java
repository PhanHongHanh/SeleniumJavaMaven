package com.hanhpth.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class b1 {
    String baseUrl="https://shopee.vn/";
    public WebDriver driver=new ChromeDriver();
    @Test
    public void TestTC(){
        System.setProperty("webdriver.clrome.driver","chromedriver.exe");
        driver.get(baseUrl);
        WebElement focus = driver.findElement(By.xpath("//*[@id=\"main\"]/div/header/div[2]/div/div[1]/div[1]"));
        WebElement Tagsearch = driver.findElement(By.className("shopee-searchbar-input__input"));// hiển thị mục tìm kiếm
        Tagsearch.sendKeys("Deal hot sale sốc chỉ từ 8K\n");// tự động nhập thông tin tìm kiếm
        focus.click();
    }
}
