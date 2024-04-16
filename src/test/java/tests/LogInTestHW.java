package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LambdaTestHomePage;
import pages.LambdaTestRegAcc;

import java.time.Duration;

public class LogInTestHW {


    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");

        LambdaTestRegAcc regAcc = new LambdaTestRegAcc(driver);
        regAcc.enterfirstname("Sara")
                .enterlastname("ali")
                .enteremail("sara@hotmail.com")
                .entertelephone("0589468744")
                .enterpassword("12345")
                .confiemPassword("12345")
                .clickChickBox()
                .clickBotton();

        LambdaTestHomePage homePage = new LambdaTestHomePage(driver);
        homePage.LambdaTestHomePage();
    }
}
