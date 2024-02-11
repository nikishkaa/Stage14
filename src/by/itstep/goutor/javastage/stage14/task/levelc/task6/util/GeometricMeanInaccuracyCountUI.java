package by.itstep.goutor.javastage.stage14.task.levelc.task6.util;

import java.util.Arrays;

public class GeometricMeanInaccuracyCountUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getGeometricMeanUI(int[] numbers, int userNumber, int count) {

        return BUILDER.append("Start vector: \n")
                .append(Arrays.toString(numbers))
                .append("\nYour inaccuracy: ").append(userNumber)
                .append("\nNumber count then lying in the interval" +
                        " geometric mean and your inaccuracy: ")
                .append(count);
    }
}
