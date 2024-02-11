package by.itstep.goutor.javastage.stage14.task.levelc.task4.util;

import java.util.Arrays;

public class GeometricMeanCountUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getGeometricMeanUI(int[] numbers, int count) {

        return BUILDER.append("Start vector: \n")
                .append(Arrays.toString(numbers))
                .append("\nNumber then < that geometric mean all numbers: ")
                .append(count);
    }
}
