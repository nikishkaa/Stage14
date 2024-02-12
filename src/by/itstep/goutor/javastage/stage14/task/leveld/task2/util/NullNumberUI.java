package by.itstep.goutor.javastage.stage14.task.leveld.task2.util;

import java.util.Arrays;

public class NullNumberUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getNulElementUI(int[] numbers, int sum) {

        return BUILDER.append("Start vector: ")
                .append(Arrays.toString(numbers))
                .append("\nSum element between first zero element" +
                        " and last zero element: ")
                .append(sum);
    }
}
