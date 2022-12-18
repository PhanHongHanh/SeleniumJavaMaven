package Wait;

import Initiation.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitClass extends Init {
    @Test
    public void ExplicitWaitDemo(){
        driver.get("https://anhtester.com/");
        WebDriverWait wait =new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Website Testing']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[normalize-space()='Website Testing']")));
        driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']")).click();

    }
}
