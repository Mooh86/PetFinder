package TestPetfinder;

import PetFinderSignUP.SignInPAGE;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignIn extends BaseTest{
SignInPAGE SignIn_Object;
    @Test(priority = 1)
    public void UserCanSign() {
      SignIn_Object = new SignInPAGE(driver);
      SignIn_Object.PressSignin();
      SignIn_Object.PressCreateAccount();
    }
  @Test(priority = 2)
  public void UserPutMail() {
    SignIn_Object = new SignInPAGE(driver);
    SignIn_Object.PutEmail("Mooh19@mailsac.com");
    SignIn_Object.PressContinue();
    SignIn_Object.InsertF_Name("Mohamed");
    SignIn_Object.InsertL_Name("Ahmed");
    SignIn_Object.Insert_postalCode("55555");
    SignIn_Object.SelectNumberOfDogs("0");
    SignIn_Object.SelectNumberOfCats("0");
    SignIn_Object.Close_Cookies();
    SignIn_Object.PressContinue1();
    SignIn_Object.PutPassword("Nana@1234");
    SignIn_Object.confirmPassWord("Nana@1234");
    SignIn_Object.Accept_Terms();
    SignIn_Object.Create_Account();
  }
    @Test(priority = 3)
    public void Userseemessage(){
      SignIn_Object = new SignInPAGE(driver);
      String successMessage = SignIn_Object.getSuccessMessage();
      Assert.assertTrue(successMessage.contains("One more step! A verification link has been sent to your email. Please check your inbox, including your spam folder, to finish creating your account."));
    }
    }

