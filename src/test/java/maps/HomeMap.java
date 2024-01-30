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





    @FindBy(xpath = "//a[@href='print_all_bug_page.php']")
    public WebElement printTasks;

    @FindBy(xpath = "//a[@href='excel_xml_export.php']")
    public WebElement exportExcel;

    @FindBy(xpath = "(//span[contains(@class,'lbl')])[1]")
    public WebElement selectTask;

    @FindBy(xpath = "//*[@id='buglist']/tbody[2]/tr[15]/td/input[2]")
    public WebElement btnshowselecteds;

    @FindBy(xpath = "//a[@href='/view.php?id=203']")
    public WebElement numberTask;


    @FindBy(xpath = "//p[@class='lead']p")
    public WebElement msgTextoRejistroMudança;



    @FindBy(xpath = "//p[@class='lead']")
    public WebElement msgTextoPlanejamento;



    @FindBy(xpath = "//*[@id='reported']/div[1]/div[2]]")
    public WebElement btnVerTarefas;
    @FindBy(xpath = "//input[contains(@name,'bug_id')]")
    public WebElement inputNumTaskSearch;

    @FindBy(xpath = "//*[@id='main-container']/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[1]")
    public WebElement validNumTaskSearch;


    @FindBy(xpath = "//*[@id='main-container']/div[2]/div/div[2]/div/a")
    public WebElement acessNegadoProceedBtn;
    @FindBy(xpath = "//*[@id='main-container']/div[2]/div/div[2]/p")
    public WebElement acessNegadoRseultSurch;


    @FindBy(xpath = "//p[@class='bold bigger-110'][contains(.,'Access Denied.')]")
    public WebElement msgAccessDenied;

    @FindBy(xpath = "//a[@href='my_view_page.php']")
    public WebElement btnProceed;


}
