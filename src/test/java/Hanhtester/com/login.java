package Hanhtester.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class login extends testNG01{
    @Test
    public void Login(){
        driver.findElement(By.xpath("//a[@class='skip-link skip-account']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hanhruby2511@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("5e8KRqXJf9tp2yg");
        driver.findElement(By.xpath("//button[@id='send2']")).click();
    }
}
