package AssertLibrary;

import Initiation.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample extends Init {
    @Test
    public void login() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='label'][normalize-space()='Account']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hanhruby2511@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("5e8KRqXJf9tp2yg");
        driver.findElement(By.xpath("//button[@id='send2']")).click();

        driver.findElement(By.xpath("//a[@href='http://live.techpanda.org/index.php/customer/account/edit/'][normalize-space()='Edit']")).click();

        WebElement headerEditAccountInformation = driver.findElement(By.xpath("//h1[normalize-space()='Edit Account Information']"));
        //Assert.assertEquals(headerEditAccountInformation.getText(),"EDIT ACCOUNT INFORMATION");
        Assert.assertTrue(headerEditAccountInformation.getText().contains("ACCOUNT INFORMATION")); //với contains() tìm chứa

        driver.findElement(By.xpath("//input[@id='firstname']")).clear();
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Phan");

    }
}
