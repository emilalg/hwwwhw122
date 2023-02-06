import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger loggerInstance;
    private File logFile;
    private SimpleDateFormat dateFormat;

    private Logger() {
        logFile = new File("log.txt");
        dateFormat = new SimpleDateFormat("HH:mm:ss");
    }

    public static Logger getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public void log(String msg) {
        try (FileWriter writer = new FileWriter(logFile, true)) {
            writer.write(dateFormat.format(new Date()) + ": " + msg + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }
}