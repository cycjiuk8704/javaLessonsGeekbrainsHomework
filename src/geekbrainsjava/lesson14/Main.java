package geekbrainsjava.lesson14;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.logging.*;

public class Main {

    public static final Logger logger = Logger.getLogger(ArrayUtils.class.getName());
    public static Handler handler;

    static {

        try {
            handler = new FileHandler("log.txt");
            handler.setFormatter(new Formatter() {
                @Override
                public String format(LogRecord record) {
                    return LocalDateTime.now() + " in " + record.getLoggerName() + " with message: " + record.getMessage() + System.lineSeparator();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.setUseParentHandlers(false);

        logger.addHandler(handler);
    }

    public static int[] arr = new int[]{1, 3, 7, 2, 5, 4, 2, 1, 2};
    public static int[] arr14 = new int[]{1, 1, 1, 4, 1, 1, 1};

    public static void main(String[] args) throws IOException {

        System.out.println(Arrays.toString(ArrayUtils.modifyArray(arr)));
        System.out.println(ArrayUtils.analyseArray(arr14));
    }
}
