package Utilities;

import org.apache.logging.log4j.LogManager;

public class UtilityLogs {

public static final String log_path="test-outputs/LOGS";

    public static void info(String msg)
    {
        LogManager.getLogger(Thread.currentThread().getStackTrace()[2].toString()).info(msg);
    }

    public static void trace(String msg)
    {
        LogManager.getLogger(Thread.currentThread().getStackTrace()[2].toString()).trace(msg);
    }

    public static void error(String msg)
    {
        LogManager.getLogger(Thread.currentThread().getStackTrace()[2].toString()).error(msg);
    }
}
