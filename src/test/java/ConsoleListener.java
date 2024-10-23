import org.testng.ITestListener;
import org.testng.ITestResult;

public class ConsoleListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test failed! Capturing screenshot " + result.getMethod().getMethodName() + ".png");
        System.out.println(result.getEndMillis() - result.getStartMillis());
    }


    public void onTestSuccess(ITestResult result){
        System.out.println("Test passed! " + result.getMethod().getMethodName() + ".png");
        System.out.println(result.getEndMillis() - result.getStartMillis());
    }
}
