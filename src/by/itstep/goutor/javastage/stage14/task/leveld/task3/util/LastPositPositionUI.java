package by.itstep.goutor.javastage.stage14.task.leveld.task3.util;

import java.util.Arrays;

public class LastPositPositionUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getSumBeforeLastPositPosition(int[] numbers, int sum) {

        return BUILDER.append("Start vector: ")
                .append(Arrays.toString(numbers))
                .append("\nSum element before last positive number: ")
                .append(sum);

    }
}
