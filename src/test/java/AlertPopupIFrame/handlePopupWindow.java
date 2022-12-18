package AlertPopupIFrame;

import Initiation.Init;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class handlePopupWindow extends Init {
    @Test
    public void PopupWindowDemo() throws InterruptedException {

        driver.findElement(By.xpath("//img[@title='Additional Options']")).click();
        String MainWindow = driver.getWindowHandle();//lưu lại lới window đầu tiên
        System.out.println("window chính đầu tiên"+MainWindow);

        //ArrayList<String> arr = new ArrayList<String>(); //giá trị được trùng

        Set<String> windows =driver.getWindowHandles();// hiển thị tất cả các popup window (Set là một dạng Collection k chứa các phần tử trùng lặp)
        //duyệt các phần tử không trùng lặp trong Collection (Set)
        for (String window : windows){ //duyệt từ window đầu tiên cho đến hết
            System.out.println(window);

            if(!MainWindow.equalsIgnoreCase(window)){
                //so sánh nếu window khác window chính (đầu tiên) thì chuyển hướng qua popup window mới
                //thao tác được
                //chuyển hướng sang popup window tiếp theo
                driver.switchTo().window(window);
                Thread.sleep(2000);
                System.out.println("đã chuyển đến lớp window con");
                System.out.println(driver.getTitle());
                driver.close();


            }

        }
    }

}
