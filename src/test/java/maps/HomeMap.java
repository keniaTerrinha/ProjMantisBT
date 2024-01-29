package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeMap {


    @FindBy(xpath = "//input[contains(@class,'width-40 pull-right btn btn-success btn-inverse bigger-110')]")
    public WebElement btnLogin;



    @FindBy(xpath = "//*[@id='navbar-container']/div[1]/a/span")
    public WebElement titleAplication;

    @FindBy(xpath = "//div[2]/ul/li[3]/a/i[2][@class='ace-icon fa fa-angle-down']")
    public WebElement selectlistOpcion;



    @FindBy(xpath = "//a[@href='/account_page.php'][contains(.,'My Account')]")
    public WebElement opcionMyAccount;

    @FindBy(xpath = "//*[@id='navbar-container']/div[2]/ul/li[3]/ul/li[4]/a")
    public WebElement exitUser;

    @FindBy(css = "#realname")
    public WebElement inpCampoRealnName;
    @FindBy(css = "#dropdown_projects_menu")
    public WebElement clicklistOpcionProject;

    @FindBy(xpath = "//*[@id='projects-list']/li[3]/div/ul/li[3]/a")
    public WebElement opcionProjectJoice;

    @FindBy(xpath = "//*[@id='projects-list']/li[3]/div/ul/li[4]/a")
    public WebElement opcionProjectKenia;

    @FindBy(xpath = "//*[@id=1projects-list']/li[3]/div/ul/li[5]/a")
    public WebElement opcionMyProjectTeste;




    @FindBy(xpath = "//a[@href='bug_report_page.php']")
    public WebElement btncreatTasks;


    @FindBy(xpath = "//*[@id='sidebar']/ul/li[1]/a/i")
    public WebElement myView;

    @FindBy(xpath = "//*[@id='sidebar']/ul/li[2]/a/i")
   public WebElement ViewTasks;

    @FindBy(xpath= "//*[@id='sidebar']/ul/li[3]/a/i")
    public WebElement createTasksMenu;

    @FindBy(xpath = "//*[@id='sidebar']/ul/li[4]/a/i")
   public WebElement changeLog;


    @FindBy(xpath = "//*[@id='sidebar']/ul/li[5]/a/i")
   public WebElement planning;

    @FindBy(xpath = "//input[contains(@type,'submit')]")
    public WebElement btnUpdateUser;


    @FindBy(xpath = "//h4[contains(@class,'header lighter bigger')]")
    public WebElement  authenticate;



    @FindBy(xpath = "//select[contains(@id,'reproducibility')]")
    public WebElement  selecfrequency;

    @FindBy(xpath = "//select[contains(@id,'severity')]")
    public WebElement  selectseverity;

    @FindBy(xpath = "//select[contains(@id,'priority')]")
    public WebElement  selectpriority;


    @FindBy(xpath = "//input[contains(@id,'summary')]")
    public WebElement  inputsummary;


    @FindBy(xpath = "//textarea[contains(@id,'description')]")
    public WebElement  inputdescription;

    @FindBy(xpath = "//input[contains(@class,'btn btn-primary btn-white btn-round')]")
    public WebElement createNewTask;



















}
