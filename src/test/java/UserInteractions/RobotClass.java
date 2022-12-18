package UserInteractions;

import Initiation.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass extends Init {
    @Test
    public void InputDataSearch() throws AWTException, InterruptedException {

        driver.get("https://anhtester.com/");
        Thread.sleep(2000);
        WebElement inputCourseElement = driver.findElement(By.name("key"));
        inputCourseElement.click();

        Robot robot =new Robot();
        robot.keyPress(KeyEvent.VK_T); //nhân dạng từng phím trên bàn phím máy tính
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(2000);


    }
}
