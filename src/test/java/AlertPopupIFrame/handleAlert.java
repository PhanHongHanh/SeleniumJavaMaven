package AlertPopupIFrame;

import Initiation.Init;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class handleAlert extends Init {
    @Test
    public void AlertDemo() throws InterruptedException, AWTException {
        driver.get("https://demo.automationtesting.in/Alerts.html");

//        driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
//        driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();

        //khai báo chuyển hướng đến Alert vói đối tượng
        Alert alert = driver.switchTo().alert();
        //hiển thị msg trên alert
        String alertMessage = alert.getText();
        //
        System.out.println(alertMessage);
        Thread.sleep(2000);
        alert.sendKeys("test");

        Thread.sleep(2000);
        //click ok button
        alert.accept();
        Thread.sleep(2000);

    }
}
