package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    HomePage homePage;

    //String username;


    @When("Enter username and password {string} and {string}")
    public void enterUsernameEPassword(String username, String password){


        inputUsernameLogin(username);

        loginPage.clickBtnUserLogin();

        inputPasswordLogin(password);


    }




    @When("input username login {string}")
    public void inputUsernameLogin(String username) {
        loginPage.setInpUserName(username);

        System.out.println("------------------------------------------------------------");
        System.out.println(username);
        System.out.println("------------------------------------------------------------");
    }

    @And("input password login {string}")
    public void inputPasswordLogin(String password) {
        loginPage.setInpPassword(password);
        System.out.println("------------------------------------------------------------");
        System.out.println(password);
        System.out.println("------------------------------------------------------------");

    }



    @Then("valid password invalid {string}")
    public void validPasswordInvalid(String msg) {

        loginPage = new LoginPage();
        loginPage.msgloginInvalid();
        Assert.assertEquals(msg, loginPage.msgloginInvalid());
        System.out.println("------------------------------------------------------------");
        System.out.println(loginPage.msgloginInvalid());
        System.out.println("------------------------------------------------------------");

    }



    @And("valid user page {string}")
    public void validUserPage(String username) {

        loginPage = new LoginPage();
        loginPage.userInfo();
        Assert.assertEquals(username, loginPage.userInfo());
        System.out.println("------------------------------------------------------------");
        System.out.println(loginPage.userInfo());
        System.out.println("------------------------------------------------------------");

    }









}
