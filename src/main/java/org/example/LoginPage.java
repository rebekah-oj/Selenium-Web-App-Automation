package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    //declare driver
    private final WebDriver driver;

    //create page objects
    private final By username = By.name("username");
    private final By password = By.name("password");
    private final By login = By.id("btn-login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //perform actions on created objects
    public void enterInfo(String name, String passWord){

        driver.findElement(username).sendKeys(name);
        driver.findElement(password).sendKeys(passWord);
    }

    public void submitForm(){

        driver.findElement(login).click();
    }
}
