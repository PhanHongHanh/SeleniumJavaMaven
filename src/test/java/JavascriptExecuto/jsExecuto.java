package JavascriptExecuto;

import Initiation.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class jsExecuto extends Init {
    @Test (priority = 0)
    public void jsExecutoDemo() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver; //khởi tạo js thuộc (JavascriptExecutor) điều hướng theo driver
        driver.get("https://anhtester.com/");
        Thread.sleep(2000);

        WebElement button = driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']"));
        js.executeScript("arguments[0].click();",button);
        Thread.sleep(2000);

        //Hiển thị tiêu đề
        String titleText = js.executeScript("return document.title").toString();
        System.out.println("page title: "+titleText);

        //Hiển thị tên miền
        String domainName = js.executeScript("return document.domain").toString();
        System.out.println("page domain: "+domainName);

        driver.quit();
    }
    @Test (priority = 1)
    public void jsCheckboxDemo() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://anhtester.com/");
        Thread.sleep(2000);

        WebElement button =driver.findElement(By.xpath("//a[normalize-space()='view profile']"));
        js.executeScript("arguments[0].scrollIntoView(true);",button);

        js.executeScript("arguments[0].click();", button);

    }

}
//button_CheckAll = driver.findElement(By.id("check1"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", new Object[]{button_CheckAll});