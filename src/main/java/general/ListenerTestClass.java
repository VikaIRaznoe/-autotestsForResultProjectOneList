package general;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestClass extends ScreenShotClass implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test class started:  " + result.getName() + " " + "Thread Current ID : " + Thread.currentThread().getId());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test SUCCESS: " + result.getName() + " " + "Thread Current ID : " + Thread.currentThread().getId());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        captureScreenshot();
        System.out.println(result.getTestClass() + " " + result.getMethod() + " " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
