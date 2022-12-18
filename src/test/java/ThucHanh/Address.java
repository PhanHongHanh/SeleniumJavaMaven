package ThucHanh;

import Initiation.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Address extends Init {
    public void loginPage(){
        driver.get("https://mediamart.vn/");
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
        driver.findElement(By.id("Email")).sendKeys("hanhruby2511@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("m7EBhYrxTnUgJ@i");
        driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
    }

    @Test
    public void AddAddress(){
        loginPage();
        //Open Tài khoản
        driver.findElement(By.xpath("//a[normalize-space()='Xin chào!']")).click();
        String headerManageAddress = driver.findElement(By.xpath("//h2[contains(text(),'Tổng quan tài khoản')]")).getText();
        Assert.assertEquals(headerManageAddress,"Tổng quan tài khoản");
        String headerDefaultShippingAddress = driver.findElement(By.xpath("//body/div[@class='body-content bg-page']/div[@class='container']/div[@class='bstrap-df']/div[@class='row']/div[@class='col-md-9']/div[@class='row mt-4']/div[2]/div[1]/div[1]")).getText();
        Assert.assertEquals(headerDefaultShippingAddress,"Địa chỉ giao hàng mặc định");
        driver.findElement(By.xpath("//a[contains(text(),'Quản lý địa chỉ')]")).click();

        //Open Address book
        String headerAddressBook = driver.findElement(By.xpath("//h2[contains(text(),'Sổ địa chỉ')]")).getText();
        Assert.assertEquals(headerAddressBook,"Sổ địa chỉ");
        driver.findElement(By.xpath("//a[contains(text(),'Thêm địa chỉ')]")).click();
        String headerCreateAddress = driver.findElement(By.xpath("//h2[contains(text(),'Tạo địa chỉ')]")).getText();
        Assert.assertEquals(headerCreateAddress,"Tạo địa chỉ");
        // add address
        driver.findElement(By.xpath("//select[@id='StateOrProvinceId']")).click();
        boolean buttonLuu = driver.findElement(By.xpath("//button[contains(text(),'Lưu lại')]")).isDisplayed();
        Assert.assertTrue(buttonLuu,"bnt không hiện");

        WebElement option = driver.findElement(By.xpath("(//select[@id='StateOrProvinceId'])[1]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",new Object[]{option});
        driver.findElement(By.xpath("(//select[@id='StateOrProvinceId'])[1]")).sendKeys(new CharSequence[]{"Hà Nội"});

        driver.findElement(By.xpath("//input[@id='City']")).sendKeys("Hà Nội");
        driver.findElement(By.xpath("//input[@id='ZipCode']")).sendKeys("1234abc");
        driver.findElement(By.xpath("//input[@id='AddressLine1']")).sendKeys("Dịch Vọng, Cầu Giấy");
        driver.findElement(By.xpath("//input[@id='ContactName']")).sendKeys("hạnh");
        driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys("091234578");
        driver.findElement(By.xpath("//button[contains(text(),'Lưu lại')]")).click();

    }
}
