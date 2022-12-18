package Hanhtester.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RunTest {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();//goi phien ban bromser
        driver = new EdgeDriver(); //khởi tạo giá trị cho bromser
        driver.get("https://www.facebook.com/");
        driver.close();
    }
}
