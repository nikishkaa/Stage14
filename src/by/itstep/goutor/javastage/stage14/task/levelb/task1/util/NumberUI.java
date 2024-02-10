package by.itstep.goutor.javastage.stage14.task.levelb.task1.util;

import java.util.Arrays;

public class NumberUI {
    public static StringBuilder getNumberUI(int[] numbers, int count, int userNumber) {
        StringBuilder builder = new StringBuilder();

        return builder.append("Start array:\n")
                .append(Arrays.toString(numbers))
                .append("\nNumbers in array > ").append(userNumber)
                .append("\nis — ").append(count);
    }
}
