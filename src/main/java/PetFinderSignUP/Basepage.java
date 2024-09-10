package PetFinderSignUP;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage {
    WebDriver driver;
    public Basepage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void Scroll_dwon(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }
}
