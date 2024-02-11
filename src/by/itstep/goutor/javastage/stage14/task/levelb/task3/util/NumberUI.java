package by.itstep.goutor.javastage.stage14.task.levelb.task3.util;

import java.util.Arrays;

public class NumberUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getNumberUI(int[] numbers, int userNumber, int count) {

        return BUILDER.append("Start array:\n")
                .append(Arrays.toString(numbers))
                .append("\nNumbers in array = ").append(userNumber)
                .append("\nis — ").append(count);
    }
}
