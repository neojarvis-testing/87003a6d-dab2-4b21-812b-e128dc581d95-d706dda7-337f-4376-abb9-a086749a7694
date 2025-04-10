package utils;
 
import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;
 
public class LoggerHandler {
 
    private static final Logger logger = Logger.getLogger(LoggerHandler.class);
 
    static {
        setupLoggers();
    }
 
    /**
     * Description: Configures loggers using log4j properties file.
 
     */
    private static void setupLoggers() {
        try {
            // Load the log4j properties file
            PropertyConfigurator.configure("src/main/resources/log4j.properties");
 
            // Set the log file name with a timestamp
            String timestamp = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            String logFileName = "logs/logfile_" + timestamp + ".log";
 
            // Create a file appender with the timestamped log file name
            PatternLayout layout = new PatternLayout("%d{ISO8601} %-5p %c - %m%n");
            FileAppender fileAppender = new FileAppender(layout, logFileName, true);
 
            // Remove existing appenders and add the new appender to the logger
            logger.removeAllAppenders();
            logger.addAppender(fileAppender);
        } catch (Exception e) {
            logger.error("Failed to initialize logger file appender", e);
        }
    }
 
    /**
     * Description: Logs a trace-level message.
 
     * @param message The message to be logged at TRACE level.
     */
    public static void trace(String message) {
        logger.trace(message);
    }
 
    /**
     * Description: Logs a debug-level message.
 
     * @param message The message to be logged at DEBUG level.
     */
    public static void debug(String message) {
        logger.debug(message);
    }
 
    /**
     * Description: Logs an info-level message.
 
     * @param message The message to be logged at INFO level.
     */
    public static void info(String message) {
        logger.info(message);
    }
 
    /**
     * Description: Logs a warn-level message.
 
     * @param message The message to be logged at WARN level.
     */
    public static void warn(String message) {
        logger.warn(message);
    }
 
    /**
     * Description: Logs an error-level message.
 
     * @param message The message to be logged at ERROR level.
     */
    public static void error(String message) {
        logger.error(message);
    }
 
    /**
     * Description: Logs a fatal-level message.
 
     * @param message The message to be logged at FATAL level.
     */
    public static void fatal(String message) {
        logger.fatal(message);
    }
}
 