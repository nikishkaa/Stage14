package by.itstep.goutor.javastage.stage14.task.levelb.task9.util;

import java.util.Arrays;

public class BiggestNumberUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getBiggestNumberUI(int[] numbers, int userNumber, int count) {

        return BUILDER.append("Start array: \n")
                .append(Arrays.toString(numbers))
                .append("\nYour equals number is: ")
                .append(userNumber)
                .append("\nCount number then equals your number is: ")
                .append(count);
    }
}
