package testcases;

import com.orangeHRM.pages.BaseClass;
import com.orangeHRM.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRM extends BaseClass {
    LoginPage loginPage;

   public OrangeHRM() {
       super();
   }

   @BeforeMethod
   public void setUp(){
       initialize();
       loginPage = new LoginPage();
   }

 @AfterMethod
 public void tearDown(){
      closeBrowser();
  }

   @Test
   public void verifyLogoTest(){
       Assert.assertTrue(loginPage.validateLogo());
   }

    @Test
    public void loginPageTest(){
    // HomePage homePage;
      loginPage.loginTest();
    // homePage = loginPage.loginTest();

   }
   @Test
    public void forgotpassword(){
       Assert.assertTrue(loginPage.forgotPassword());
   }
}
