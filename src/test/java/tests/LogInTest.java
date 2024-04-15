package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactListHomePage;
import pages.ContactListLogInPage;

import java.time.Duration;

public class LogInTest {
    @Test
    public void tset(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

        ContactListLogInPage logInPage = new ContactListLogInPage(driver);
        //logInPage.enterEmail("sdatest@tester.com");
        //logInPage.enterpassword("tester.123");
        //logInPage.clickSubmit();

        ContactListHomePage homePage = logInPage
                .enterEmail("sdatest@tester.com")
                .enterpassword("tester.123")
                .clickSubmit();
               // .clickLogOut(); 1st way without write ContactListHomePage homePage

        homePage.clickLogOut();
    }



}
