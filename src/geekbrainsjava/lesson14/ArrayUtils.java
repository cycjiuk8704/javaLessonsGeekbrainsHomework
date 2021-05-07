package geekbrainsjava.lesson14;

//import java.io.IOException;
//import java.time.LocalDateTime;

import java.util.logging.Level;

public class ArrayUtils {
//    public static final Logger logger = Logger.getLogger(ArrayUtils.class.getName());
//    public static Handler handler;
//
//    static {
//
//        try {
//            handler = new FileHandler("log.txt");
//            handler.setFormatter(new Formatter() {
//                @Override
//                public String format(LogRecord record) {
//                    return LocalDateTime.now() + " in " + record.getLoggerName() + " with message: " + record.getMessage() + System.lineSeparator();
//                }
//            });
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        logger.setUseParentHandlers(false);
//
//        logger.addHandler(handler);
//    }


    public static int[] modifyArray(int[] arr) {

        int numberTrigger = 4;

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
        Main.logger.log(Level.SEVERE, "в массиве отсутствуют элементы " + "'" + numberTrigger + "" +
                "'");
        throw new RuntimeException();
    }

    public static boolean analyseArray(int[] arr) {

        final int num1 = 1;
        final int num2 = 4;
        int num1Count = 0;
        int num2Count = 0;
        for (int i : arr) {
            if (i != num1 && i != num2) {
                Main.logger.log(Level.SEVERE, "в массиве отсутствуют элементы " + "'" + num1 + "', " + "'" + num2 + "'");
                throw new RuntimeException();
            }
        }
        for (int j : arr) {
            if (j == num1) {
                num1Count++;
            } else if (j == num2) {
                num2Count++;
            }
        }
        return num1Count != 0 && num2Count != 0;
    }


}
