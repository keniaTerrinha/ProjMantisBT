package pages;

import core.Driver;
import maps.HomeMap;
import maps.LoginMap;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    HomeMap homeMap;

    public HomePage() {
        homeMap = new HomeMap();
        PageFactory.initElements(Driver.getDriver(), homeMap);
    }


    public String getTextTitlePage(){
        Driver.visibilityOf(homeMap.titleAplication);
        return homeMap.titleAplication.getText();
    }



    public HomePage clickBtnLogin() {
        Driver.visibilityOf(homeMap.btnLogin);
       // Driver.printScreen("click on button login");
        homeMap.btnLogin.click();
        return this;
    }



    public HomePage clickselectlistOpcionProject() {
        Driver.visibilityOf(homeMap.clicklistOpcionProject);
        homeMap.clicklistOpcionProject.click();
        return this;
    }

    public HomePage clickopcionProjectKenia() {
        Driver.waitMillisSeconds(1000);
        Driver.visibilityOf(homeMap.opcionProjectKenia);
        homeMap.opcionProjectKenia.click();
        return this;
    }


    public HomePage clickSelectlistOpcionUser(){
        Driver.waitMillisSeconds(1000);
        Driver.visibilityOf(homeMap.selectlistOpcion);
        homeMap.selectlistOpcion.click();
        return this;
    }
    public HomePage selectOpcionMyAccount(){

        Driver.visibilityOf(homeMap.opcionMyAccount);
        homeMap.opcionMyAccount.click();
        return this;
    }

    public HomePage selectOpcionExitUser(){

        Driver.visibilityOf(homeMap.exitUser);
        homeMap.exitUser.click();
        return this;
    }



    public HomePage clickMenuCreateTasks() {

        Driver.visibilityOf(homeMap.createTasksMenu);
        homeMap.createTasksMenu.click();
        return this;
    }

    public HomePage clickBtnCreateTask() {

        Driver.visibilityOf(homeMap.btncreatTasks);
        homeMap.btncreatTasks.click();
        return this;
    }

    public HomePage clickBtnCreateNewTask() {

        Driver.visibilityOf(homeMap.createNewTask);
        homeMap.createNewTask.click();
        return this;
    }



    public void setInpRealName(String realNameCurrent) {
        Driver.visibilityOf(homeMap.inpCampoRealnName);
        homeMap.inpCampoRealnName.clear();
        homeMap.inpCampoRealnName.sendKeys(realNameCurrent);
    }

    public void setInputsummary(String descsummary) {
        Driver.visibilityOf(homeMap.inputsummary);
        homeMap.inputsummary.sendKeys(descsummary);
    }

    public void setInputdescription(String descDescription ) {
        Driver.visibilityOf(homeMap.inputdescription);
        homeMap.inputdescription.sendKeys(descDescription);
    }

    public HomePage getTexRealName( ) {

        Driver.visibilityOf(homeMap.inpCampoRealnName);
         homeMap.inpCampoRealnName.getText();

        return this;

    }





    public HomePage clickBtnUpdateUser() {

        Driver.visibilityOf(homeMap.btnUpdateUser);
        homeMap.btnUpdateUser.click();
        return this;
    }

    public boolean existstAuthenticate() {
        try {
            Driver.scrollPageDown();
            Driver.visibilityOf(homeMap.authenticate);
            homeMap.authenticate.isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }


    }
    public void
    checkAuthenticationRequest(String realNameCurrent) {

        if (existstAuthenticate() == true) {
            clickBtnLogin();
            System.out.println("Passwoard Authenticate with successfully ");


        } else {

            getTexRealName();

            Driver.waitMillisSeconds(1000);
            setInpRealName(realNameCurrent);
            clickBtnUpdateUser();
            System.out.println("Edit acount with successfully");
        }

    }
    public boolean  valueRealNameboolean() {

        try {
            Driver.visibilityOf(homeMap.inpCampoRealnName);
            homeMap.inpCampoRealnName.getText();
            return true;
        } catch (Exception e) {
            return false;
        }

    }


    @FindBy(xpath = "//i[contains(@class,'menu-icon fa fa-dashboard')]")
    public WebElement myView;

    public HomePage clickMenuMyView() {

        Driver.visibilityOf(homeMap.myView);
        homeMap.myView.click();
        return this;
    }



    public HomePage clickViewTasks() {

        Driver.visibilityOf(homeMap.ViewTasks);
        homeMap.ViewTasks.click();
        return this;
    }



    public HomePage clickMenuMchangeLog() {

        Driver.visibilityOf(homeMap.changeLog);
        homeMap.changeLog.click();
        return this;
    }




    public HomePage clickMenuPlanning() {

        Driver.visibilityOf(homeMap.planning);
        homeMap.planning.click();
        return this;
    }

}







