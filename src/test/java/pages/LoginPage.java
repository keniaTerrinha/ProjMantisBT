package pages;

import core.Driver;
import maps.HomeMap;
import maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;
public LoginPage(){
    loginMap = new LoginMap();
    PageFactory.initElements(Driver.getDriver(),loginMap);
}
    public void setInpUserName(String username) {

        Driver.visibilityOf(loginMap.inpUserName);
        loginMap.inpUserName.sendKeys(username);
    }

    public void setInpPassword(String password) {
        Driver.visibilityOf(loginMap.inpPassword);
        loginMap.inpPassword.sendKeys(password);
    }

    public String msgloginInvalid() {
        Driver.waitMillisSeconds(1000);
        Driver.visibilityOf(loginMap.logininvalid);
        return loginMap.logininvalid.getText();
    }

    public String userInfo() {
        Driver.waitMillisSeconds(3000);
        Driver.visibilityOf(loginMap.userInfo);
        return loginMap.userInfo.getText();
    }

    public LoginPage clickBtnUserLogin() {
        Driver.visibilityOf(loginMap.btnLogin);
        // Driver.printScreen("click on button login");
        loginMap.btnLogin.click();
        return this;
    }






}


