package by.itstep.goutor.javastage.stage14.task.leveld.task1.util;

import java.util.Arrays;

public class NumUI {
    public static StringBuilder BUILDER;
static{
BUILDER = new StringBuilder();
}

    public static StringBuilder getNumUI(int[] numbers, int composition) {

        return BUILDER.append("Start vector: \n")
                .append(Arrays.toString(numbers))
                .append("\ncomposition in min-max: ")
                .append(composition);
    }
}
