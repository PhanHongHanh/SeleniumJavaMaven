package UserInteractions;

import Initiation.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends Init {
    @Test
    public void  TestAction() throws InterruptedException {

//        Actions action = new Actions(driver); // Actions: để xử lý các sự kiện bàn phím và chuột
//        action.clickAndHold().moveToElement(null).sendKeys(null).build().perform(); //build: tạo chuỗi hành động, perform: thực hiện chuỗi hành động

        WebElement element = driver.findElement(By.xpath("//input[@id='search']"));

        Actions action = new Actions(driver);

        action.sendKeys(element,"mobile").sendKeys(Keys.ENTER).build().perform();
//        action.sendKeys(Keys.ENTER).build(); //gọi thông tin phím ấn trên bàn phim máy tính

        Thread.sleep(2000);

        WebElement mobileTitleElement = driver.findElement(By.xpath("//a[normalize-space()='Mobile']"));
        mobileTitleElement.click();

        Thread.sleep(2000);

        WebElement headerMobile = driver.findElement(By.xpath("//div[@class='page-title category-title']"));

        action.doubleClick(headerMobile).build().perform();

        action.clickAndHold(headerMobile).build().perform();

        Thread.sleep(2000);

        WebElement lableNewsletter = driver.findElement(By.xpath("//span[normalize-space()='Newsletter']"));

        action.moveToElement(lableNewsletter).build().perform();
    }
    @Test
    public void DragAndDrop(){
        WebElement From = driver.findElement(By.xpath(""));
    }

}
