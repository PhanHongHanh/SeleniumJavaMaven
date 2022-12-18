package ThucHanh2;

import org.openqa.selenium.By;

public class ObjectRepositoryHRM {

    public String URL = "https://mediamart.vn/login";
    By usernameInput = By.id("Email");
    By passwordInput = By.id("Password");
    By loginButton = By.xpath("//button[contains(text(),'Đăng nhập')]");
    By menuButton = By.xpath("//b[contains(text(),'Danh Mục')]");
    By menuTiViLoudspeakerButton = By.xpath("//span[@aria-expanded='false']");
    By menuAirConditionerButton = By.xpath("(//span[@class='nav-link dropdown-toggle'])[2]");
    By inputTimKiem = By.xpath("//input[@id='Key']");
    By buttonTimKiem = By.xpath("//button[@class='search-btn']");
//    By  = By.xpath("");
//    By  = By.xpath("");
//    By  = By.xpath("");


}
