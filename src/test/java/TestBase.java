import org.testng.annotations.Test;

public class TestBase {

    @Test
    public void startApplication() {
        System.out.println("Staring browser");
        System.out.println("Opening application");
        System.out.println("Logging with valid data");
    }
}
