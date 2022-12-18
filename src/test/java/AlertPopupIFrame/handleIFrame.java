package AlertPopupIFrame;

import Initiation.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class handleIFrame extends Init {
    @Test
    public void IframeDemo() throws InterruptedException {
        driver.get("https://anhtester.com/login");

        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("hanhruby2511@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("SxWxng69VaFaqhq");

        int frameTotal = driver.findElements(By.tagName("iframe")).size();
        System.out.println(frameTotal);

        //chuyển đến frame nào đó theo thứ tự
        driver.switchTo().frame(0);//bắt đầu tính từ 0


        //chuyển đến frame nào đó theo name/id
        //driver.switchTo().frame("dialog-frame");

        driver.findElement(By.tagName("label")).click();
        Thread.sleep(2000);

//        driver.switchTo().defaultContent();// ẩn ìframe
        driver.switchTo().parentFrame(); // trở lại trang chính
        driver.findElement(By.id("login")).click();

    }
}
