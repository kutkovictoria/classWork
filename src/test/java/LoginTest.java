import org.testng.annotations.*;

import static org.testng.Assert.*;

public class LoginTest extends TestBase {


    @BeforeMethod
    public void methodSetup(){
        System.out.println("======BEFORE method");

    }

    @AfterMethod
    public void methodTeardown(){
        System.out.println("======AFTER method");

    }

    @Override
    public void startApplication() {  //переопределение метода
        System.out.println("Staring browser");
        System.out.println("Opening application");
    }

    @Test
    public void loginWithValidCredentials() throws InterruptedException {
        startApplication();
        System.out.println("Enter correct credentials");
        System.out.println("Validate that user is signed in");
        boolean userIsLoggedIn = false;
        assertTrue(userIsLoggedIn, "User has not logged in");
        Thread.sleep(5000);
    }
    @Test
    @Parameters({"login", "password"})
    public void loginTest(String login, String password) {
        System.out.println("using Login: " + login);
        System.out.println("using Password: " + password);
    }
}
