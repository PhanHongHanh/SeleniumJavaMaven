package ThucHanh2;

import Initiation.Init;
import org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyPairGeneratorSpi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.event.KeyEvent;

public class Project extends Init {

    @Test
    public void LoginToHRMSystem(){
        driver.get(objectRepositoryHRM.URL);

        helpers.setText(objectRepositoryHRM.usernameInput,"Hanhruby2511@gmail.com");
        helpers.setText(objectRepositoryHRM.passwordInput, "m7EBhYrxTnUgJ@i");
        helpers.clickElement(objectRepositoryHRM.loginButton);
        //wait and click menu
        helpers.clickElement(objectRepositoryHRM.menuButton);
        //wait and sendKeys tìm kiếm
        helpers.setText(objectRepositoryHRM.inputTimKiem,"Laptop");
//        click button tìm kiếm
//        helpers.clickElement(objectRepositoryHRM.buttonTimKiem);
        //nhập thông tin tìm kiếm ấn enter từ bàn phím
        driver.findElement(objectRepositoryHRM.inputTimKiem).sendKeys(Keys.ENTER);

        driver.quit();
    }
}
