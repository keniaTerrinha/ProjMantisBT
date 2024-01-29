package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#username")
    public WebElement inpUserName;

    @FindBy(css = "#password")
    public WebElement inpPassword;


    @FindBy(xpath = "//*[@id='main-container']/div/div/div/div/div[4]")
    public WebElement logininvalid;


    @FindBy(xpath = "//span[contains(@class,'user-info')]")
    public WebElement userInfo;

    @FindBy(xpath = "//input[contains(@class,'width-40 pull-right btn btn-success btn-inverse bigger-110')]")
    public WebElement btnLogin;





}