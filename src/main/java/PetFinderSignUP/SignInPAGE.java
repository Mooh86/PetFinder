package PetFinderSignUP;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPAGE extends Basepage {
    public SignInPAGE(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class=' ptw-ml-2 ptw-hidden md:ptw-inline ']")
    WebElement SigninBtn;

    public void PressSignin() {
        SigninBtn.click();
    }

    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement CreateAccount;

    public void PressCreateAccount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(CreateAccount));
        CreateAccount.click();

    }

    @FindBy(id = "emailAddress")
    WebElement EmailID;

    public void PutEmail(String Email1) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(EmailID));
        EmailID.sendKeys(Email1);

    }

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement ContinueBtn;

    public void PressContinue() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ContinueBtn));
        ContinueBtn.click();

    }

    @FindBy(id = "firstName")
    WebElement First_Name;

    public void InsertF_Name(String FName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(First_Name));
        First_Name.sendKeys(FName);

    }

    @FindBy(id = "lastName")
    WebElement Last_Name;

    public void InsertL_Name(String LName) {
        Last_Name.sendKeys(LName);
    }

    @FindBy(id = "postalCode")
    WebElement postal_Code;

    public void Insert_postalCode(String PC) {
        postal_Code.sendKeys(PC);
    }

    @FindBy(name = "dogCount")
    WebElement NumberOfDogs;

    public void SelectNumberOfDogs(String number1) {
        Select ObjSelect = new Select(NumberOfDogs);
        ObjSelect.selectByValue(number1);
    }

    @FindBy(name = "catCount")
    WebElement NumberOfCats;

    public void SelectNumberOfCats(String number2) {
        Select ObjSelect = new Select(NumberOfCats);
        ObjSelect.selectByValue(number2);
    }

    @FindBy(xpath = "//*[@id=\"onetrust-close-btn-container\"]/button")
    WebElement Cookies;

    public void Close_Cookies() {
        Cookies.click();
    }

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement ContinueBtn1;

    public void PressContinue1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ContinueBtn1));
        ContinueBtn1.click();
    }

    @FindBy(id = "password")
    WebElement password;

    public void PutPassword(String Pass1) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys(Pass1);
    }

    @FindBy(id = "confirmPassword")
    WebElement confirmPassword;

    public void confirmPassWord(String Pass2) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(confirmPassword));
        confirmPassword.sendKeys(Pass2);
    }

    @FindBy(id = "terms")
    WebElement AcceptTerms;

    public void Accept_Terms() {
        AcceptTerms.click();
    }

    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement CreateAccount1;

    public void Create_Account() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(CreateAccount1));
        CreateAccount1.click();
    }
    @FindBy(xpath = "//p[@class='pds-text-surface-textSubdued']")
    WebElement Verify_Message;
    public String getSuccessMessage() {
        return Verify_Message.getText();
}
}



