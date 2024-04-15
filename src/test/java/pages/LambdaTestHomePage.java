package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LambdaTestHomePage {
    WebDriver ldriver;

    //By contenButton = By.xpath("//input[@value='Continue']");
    By newBage = By.xpath("//*[.=' Your Account Has Been Created!']");

    public LambdaTestHomePage(WebDriver gdriver) {
        ldriver = gdriver;
    }

    public void  LambdaTestHomePage (){
        Assert.assertTrue(ldriver.findElement(newBage).isDisplayed());
    }



}
