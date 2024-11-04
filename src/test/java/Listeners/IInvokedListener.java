package Listeners;

import Utilities.UtilityClasses;
import Utilities.UtilityLogs;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

import java.text.SimpleDateFormat;
import java.util.Date;

import static DriverFactory.DriverFactory.getDriver;

public class IInvokedListener implements IInvokedMethodListener {


    public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
        UtilityLogs.info( new SimpleDateFormat("yyyy-MM-dd h-m-ssa").format(new Date()));
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
        UtilityLogs.info(testResult.getName()+"TC executed..");
        if(testResult.getStatus() == ITestResult.FAILURE)
        {
            UtilityLogs.error(testResult.getName()+"fail.......");
            UtilityClasses.takeScreenShot(getDriver() ,testResult.getName());

    }
}





}
