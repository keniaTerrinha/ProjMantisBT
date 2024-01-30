package core;

import enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Driver {

    private static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;
    private static String nomeCenario;
    private static File diretorio;
    private static int numPrint;

    public static File getDiretorio() {
        return diretorio;
    }

    public static String getNomeCenario() {
        return nomeCenario;
    }

    public static void setNomeCenario(String nomeCenario) {
        Driver.nomeCenario = nomeCenario;
    }

    public static void criaDiretorio() {
        String caminho = "target/reports/cucumber-html-reports/images";
        diretorio = new File(caminho + "/" + nomeCenario);
        diretorio.mkdir();
        numPrint = 0;
    }




    public static void printScreen(String passo) {
        numPrint++;
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String caminho = diretorio.getPath() + "/" + numPrint + " - " + passo + ".png";
        try {
            FileUtils.copyFile(file, new File(caminho));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public static String printScreen() {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        int _numberPrint = numPrint + 1;

        try {
            FileUtils.copyFile(srcFile, new File("imgs\\screenshot_" + _numberPrint + ".png"));
            numPrint = _numberPrint;

        } catch (Exception e) {
            System.err.println(e);
        }
        return "imgs\\screenshot_" + _numberPrint + ".png";
    }


    public Driver(Browser navegador) {

        switch (navegador) {
            case CHROME:
                startChrome();
                break;
            case FIREFOX:
                startFirefox();
                break;
            case EDGE:
                startEdge();
                break;
            case IE:
                startIE();
                break;
        }
        //Duration time = Duration.ofSeconds(30);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait = new WebDriverWait(driver, 30);
        action = new Actions(driver);
        driver.manage().window().maximize();
    }

    private void startIE() {
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
    }

    private void startEdge() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    private void startFirefox() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        //firefoxOptions.setHeadless(true);
       // firefoxOptions.addArguments("--headless");
        driver = new FirefoxDriver(firefoxOptions);
        //WebDriver driver = new FirefoxDriver(firefoxOptions);

    }

    private void startChrome() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();


        boolean headless = Boolean.parseBoolean(System.getProperty("headless"));
        chromeOptions.addArguments("--no-sandbox");
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--lang=en-US");
       //chromeOptions.addArguments("--lang=pt-PT");
        System.setProperty("webdriver.chrome.whitelistedIps", "");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().setSize(new Dimension(1280, 720));


//        WebDriverManager.chromedriver().setup();
//        ChromeOptions chromeOptions = new ChromeOptions();
//
//        boolean headless = Boolean.parseBoolean(System.getProperty("headless"));
//        chromeOptions.setHeadless(headless);
//        //chromeOptions.addArguments("--headless");
//
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().setSize(new Dimension(1280, 720));



}

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebElement visibilityOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;

    }

    public static void invisibilityOf(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }


    public static void closeAlert() {

        for (int i = 0; i < 10; i++) {
            try {
                driver.switchTo().alert().accept();
                break;
            } catch (Exception e) {
                waitMillisSeconds(500);
            }

        }


    }

    public static String getAlertMsg() {
        String msg = "";
        for (int i = 0; i < 10; i++) {
            try {
                msg = driver.switchTo().alert().getText();
                break;
            } catch (Exception e) {
                waitMillisSeconds(500);
            }


        }
        return msg;
    }

    public static void waitMillisSeconds(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static Object executarJS(String cmd, Object... param) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript(cmd, param);
    }




        public static void ajusteZoomChrome() {
//           WebDriver driver = new ChromeDriver();
//           Driver.getDriver().get("https://emergency-s3-qua-spms.min-saude.pt");
           JavascriptExecutor js =(JavascriptExecutor)driver;
           js.executeScript("document.body.style.zoom='80%'");
    }


    public static void scrollPageDownSreenPrint() {
        Driver.waitMillisSeconds(3000);
        String elemento = "//input[@type='submit']";
        Driver.visibilityOf(driver.findElement(By.xpath(elemento)));
        WebElement el = driver.findElement(By.xpath(elemento));
        executarJS("window.scrollBy(0, arguments[100])", el.getLocation().y);
    }
    public static void scrollPageDown() {
        Driver.waitMillisSeconds(3000);
        String elemento = "//*[@id='main-container']/div[2]";
        Driver.visibilityOf(driver.findElement(By.xpath(elemento)));
        WebElement el = driver.findElement(By.xpath(elemento));
        executarJS("window.scrollBy(0, arguments[100])", el.getLocation().y);
    }







     public static void MouseHouverYellowSignage() {
        //Instantiate Action Class
        Actions actions = new Actions(driver);
        WebElement avisoSlinaleticaAmarela = driver.findElement(By.xpath(".//span[@class='text-[15px] rounded-full p-[3px] unidentified-badge material-symbols-outlined'][contains(.,'warning')]"));
        actions.moveToElement(avisoSlinaleticaAmarela).perform();
        System.out.println("Done Mouse hover on yellow signage ");
     }





    public static void selctProject() {
        WebElement categoria = driver.findElement(By.xpath("//select[contains(@id,'reproducibility')]"));
        Select categoriaComboBox = new Select(categoria);
        categoriaComboBox.selectByIndex(3);
    }

    public static void selecFrequencyCreateTask() {
        WebElement categoria = driver.findElement(By.xpath("//select[contains(@id,'reproducibility')]"));
        Select categoriaComboBox = new Select(categoria);
       // categoriaComboBox.selectByVisibleText("always");
        categoriaComboBox.selectByIndex(0);
    }

    public static void selectSeverityCreateTask() {
        WebElement categoria = driver.findElement(By.xpath("//select[contains(@id,'severity')]"));
        Select categoriaComboBox = new Select(categoria);

        categoriaComboBox.selectByIndex(5);
    }
    public static void selectPriorityCreateTask() {
        WebElement categoria = driver.findElement(By.xpath("//select[contains(@id,'priority')]"));
        Select categoriaComboBox = new Select(categoria);

        categoriaComboBox.selectByIndex(3);
    }





    public boolean ifExists(String xpath) {
        try {
            //WebElement el = this.getElement(xpath);
            WebElement el = driver.findElement(By.xpath(xpath));
            return el != null && el.getSize().getWidth() > 0;
        } catch (Exception e) {
            return false;
        }
    }









}
