package ThucHanh2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {
    WebDriver driver;
    public Helpers(WebDriver _driver){
        this.driver = _driver;
    }
    public void clickElement(By by){
        //Set thời gian cho webDriver
        WebDriverWait wait = new WebDriverWait(driver,10);
        //chờ để click
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).click();
    }
    public void setText(By by, String value){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).sendKeys(value);
    }
    public void delay(int second){
        try {
            Thread.sleep(second *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
