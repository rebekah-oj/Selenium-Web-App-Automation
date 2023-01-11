import org.example.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    static WebDriver driver = null;
    final By invalidInfo = By.className("lead text-danger");

    public static void main(String[] args) {

        validLogin();
        invalidLogin();
    }

    public static void validLogin(){
        driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");

        loginPage.enterInfo("John Doe",  "ThisIsNotAPassword");
        loginPage.submitForm();
    }

    @org.junit.Test
    public static void invalidLogin()
    {
        driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");

        loginPage.enterInfo("John Does",  "ThisIsNotAPassword");
        loginPage.submitForm();

      //  final By invalidInfo = By.className("lead text-danger");
      //  String invalidInfoMessage = driver.findElement(invalidInfo).getText();
       // Assert.assertEquals(invalidInfoMessage, "Login failed! Please ensure the username and password are valid.");
    }

   /** public LoginPage error(){

        driver.findElement(invalidInfo).getText();

        return new LoginPage(driver);
    }**/

}
