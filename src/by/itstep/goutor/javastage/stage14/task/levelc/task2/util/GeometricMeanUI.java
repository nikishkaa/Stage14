package by.itstep.goutor.javastage.stage14.task.levelc.task2.util;

import java.util.Arrays;

public class GeometricMeanUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getGeometricMeanUI(int[] numbers, int count) {

        return BUILDER.append("Start vector: \n").
                append(Arrays.toString(numbers))
                .append("\nNumber that biggest then geometric mean all numbers: ")
                .append(count);
    }
}
