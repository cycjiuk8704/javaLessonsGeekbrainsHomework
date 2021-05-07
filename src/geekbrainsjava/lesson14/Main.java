package geekbrainsjava.lesson14;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.logging.*;

public class Main {

    public static void main(String[] args) throws IOException {
        onPreRun();

        final int[] arr = new int[]{1, 3, 7, 2, 5, 4, 2, 1, 2};
        final int[] arr14 = new int[]{1, 1, 1, 4, 1, 1, 1};

        System.out.println(Arrays.toString(ArrayUtils.modifyArray(arr)));
        System.out.println(ArrayUtils.analyseArray(arr14));
    }

    private static void onPreRun() throws IOException {
        final Handler handler = new FileHandler("log.txt");
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return LocalDateTime.now() + " in " + record.getLoggerName() + " with message: " + record.getMessage() + System.lineSeparator();
            }
        });

        final Logger rootLogger = Logger.getLogger("");
        rootLogger.addHandler(handler);

    }
}
