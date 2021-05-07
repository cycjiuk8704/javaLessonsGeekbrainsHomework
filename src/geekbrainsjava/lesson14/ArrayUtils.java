package geekbrainsjava.lesson14;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.*;

public class ArrayUtils {
    private static final Logger logger = Logger.getLogger(ArrayUtils.class.getName());

    public static int[] arrModifier(int arr[]) throws IOException {

        int numberTrigger = 4;
        logger.setUseParentHandlers(false);
        Handler handler = new FileHandler("log.txt");
        logger.addHandler(handler);
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return LocalDateTime.now() + " in " + record.getLoggerName() + "with message: " + record.getMessage() + System.lineSeparator();
            }
        });
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == numberTrigger && i == arr.length - 1) {
                System.out.println(numberTrigger + " - последний элемент массива");
                return new int[]{0};
            }

            if (arr[i] == numberTrigger) {
                int[] modifiedArray = new int[arr.length - i - 1];
                System.arraycopy(arr, i + 1, modifiedArray, 0, modifiedArray.length);
                return modifiedArray;
            }
        }
        logger.log(Level.SEVERE, "в массиве отсутствуют элементы " + "'" + numberTrigger + "" +
                "'");
        throw new RuntimeException();
    }


}
