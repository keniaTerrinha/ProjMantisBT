package steps;

import core.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Dado;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;



public class HomeSteps {
    HomePage homePage;

    @Given("that it the user are home page")
    public void ThatItTheUserAreHomePage() {
        thatItIsOnTheIndexPage();

    }

    @Given("that it is on the index page")
    public void thatItIsOnTheIndexPage() {

        Driver.getDriver().get("http://mantis-prova.base2.com.br");
        homePage = new HomePage();

    }

    @And("valid page title {string}")
    public void validPageTitle(String titlePage) {
        Assert.assertEquals(titlePage, homePage.getTextTitlePage());
        System.out.println("------------------------------------------------------------");
        System.out.println(homePage.getTextTitlePage());
        System.out.println("------------------------------------------------------------");


    }

    @And("click on button login")
    public void clickOnButtonLogin() {

        homePage.clickBtnLogin();
    }


    @Then("select the project")
    public void selectTheProject() {

         homePage.clickselectlistOpcionProject();
         homePage.clickopcionProjectKenia();




    }


    @And("click on my account")
    public void clickOnMyAccount() {
        homePage.clickSelectlistOpcionUser();
        homePage.selectOpcionMyAccount();

    }

    @And("click on exit")
    public void clickOnExit() {
        homePage.clickSelectlistOpcionUser();
        homePage.selectOpcionExitUser();

    }


    @Then("validate edition account {string}")
    public void thenValidateEditionAccount(String realNameCurrent) {
        homePage.checkAuthenticationRequest(realNameCurrent);
        Assert.assertFalse(homePage.valueRealNameboolean());

        System.out.println("------------------------------------------------------------");
        System.out.println("name after editing:"+ realNameCurrent);
        System.out.println("------------------------------------------------------------");


    }

    @Then("click in menu opcion create tasks {string} and {string}")
    public void clickInMenuOpcionCreateTasks(String descsummary,String descDescription) {


        homePage.clickMenuCreateTasks();

        Driver.selecFrequencyCreateTask();
        Driver.selectSeverityCreateTask();
        Driver.selectPriorityCreateTask();

       homePage.setInputsummary(descsummary);
       homePage.setInputdescription(descDescription );
       Driver.scrollPageDown();
        homePage.clickBtnCreateNewTask();
        System.out.println("------------------------------------------------------------");
        System.out.println("Created Task successfully");
        System.out.println("------------------------------------------------------------");

    }


    @Then("click button create tasks {string} and {string}")
    public void clickButtonCreateTasks(String descsummary,String descDescription) {


        homePage.clickBtnCreateTask();

        Driver.selecFrequencyCreateTask();
        Driver.selectSeverityCreateTask();
        Driver.selectPriorityCreateTask();

        homePage.setInputsummary(descsummary);
        homePage.setInputdescription(descDescription );
        Driver.scrollPageDown();
        homePage.clickBtnCreateNewTask();
        System.out.println("------------------------------------------------------------");
        System.out.println("Created Task successfully");
        System.out.println("------------------------------------------------------------");

    }


    @Then("click in menu opcion my view")
    public void clickInMenuOpcionMyView() {


        homePage.clickMenuMyView();



    }


    @Then("click in menu opcion view tasks")
    public void clickInMenuOpcionViewTasks() {


        homePage.clickViewTasks();



    }


    @Then("click in menu opcion change log")
    public void clickInMenuOpcionChangeLog() {


        homePage.clickMenuMchangeLog();



    }



    @Then("click in menu opcion planning")
    public void clickInMenuOpcionPlanning() {

        homePage.clickMenuPlanning();


    }









}
