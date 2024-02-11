package by.itstep.goutor.javastage.stage14.task.levelc.task5.util;

import java.util.Arrays;

public class InaccuracyArUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getUserUI(int[] numbers, int userDigit, int count) {

        return BUILDER.append("Start vector: \n")
                .append(Arrays.toString(numbers))
                .append("\nYour inaccuracy: ").append(userDigit)
                .append("\nCount of number then lying in the interval: ")
                .append(count);
    }
}
