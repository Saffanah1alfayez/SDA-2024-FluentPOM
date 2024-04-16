package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaTestRegAcc {
    WebDriver ldriver;

    By firstNameId = By.id("input-firstname");
    By lastNameId = By.id("input-lastname");
    By emailId = By.id("input-email");
    By telephoneId = By.id("input-telephone");
    By passwordId = By.id("input-password");
    By confirmPasswordId = By.id("input-confirm");
    //By subscribeId = By.id("input-newsletter-yes");

    By checkBoxId = By.xpath("//label[@for='input-agree'] ");

    By contenButton = By.xpath("//input[@value='Continue']");

    public LambdaTestRegAcc(WebDriver gdriver) {
        ldriver = gdriver;
    }

    public LambdaTestRegAcc enterfirstname (String firstName) {
        ldriver.findElement(firstNameId).sendKeys(firstName);
        return this;
    }

    public LambdaTestRegAcc enterlastname (String lastName) {
        ldriver.findElement(lastNameId).sendKeys(lastName);
        return this;
    }
    public LambdaTestRegAcc enteremail (String email) {
        ldriver.findElement(emailId).sendKeys(email);
        return this;
    }

    public LambdaTestRegAcc entertelephone (String telephone) {
        ldriver.findElement(telephoneId).sendKeys(telephone);
        return this;
    }

    public LambdaTestRegAcc enterpassword (String password) {
        ldriver.findElement(passwordId).sendKeys(password);
        return this;
    }
    public LambdaTestRegAcc confiemPassword (String conPassword) {
        ldriver.findElement(confirmPasswordId).sendKeys(conPassword);
        return this;
    }

//    public LambdaTestRegAcc subscribeRad () {
//        ldriver.findElement(subscribeId).click();
//        return this;
//    }

    public  LambdaTestRegAcc clickChickBox() {
        ldriver.findElement(checkBoxId).click();
        return this;
    }

    public LambdaTestHomePage clickBotton(){
        ldriver.findElement(contenButton).click();
        return new LambdaTestHomePage(ldriver);
    }

}
