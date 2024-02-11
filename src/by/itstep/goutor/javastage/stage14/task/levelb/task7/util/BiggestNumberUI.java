package by.itstep.goutor.javastage.stage14.task.levelb.task7.util;

import java.util.Arrays;

public class BiggestNumberUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getBiggestNumberUI(int[] numbers, int userNumber, int count) {

        return BUILDER.append("Start array: \n")
                .append(Arrays.toString(numbers))
                .append("\nYour smaller number is: ")
                .append(userNumber)
                .append("\nCount number then biggest your number is: ")
                .append(count);
    }
}
