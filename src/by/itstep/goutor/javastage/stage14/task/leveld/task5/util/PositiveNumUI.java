package by.itstep.goutor.javastage.stage14.task.leveld.task5.util;

import java.util.Arrays;

public class PositiveNumUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getUserUI(int[] numbers, int sum) {

        return BUILDER.append("Start vector: ")
                .append(Arrays.toString(numbers))
                .append("\nSum elements between first and second positive" +
                        "elements in vector: ")
                .append(sum);
    }
}
