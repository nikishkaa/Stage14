package by.itstep.goutor.javastage.stage14.task.levelc.task3.util;

import java.util.Arrays;

public class ArithmeticMeanUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getArithmeticMeanUI(int[] numbers, int count) {

        return BUILDER.append("Start array: \n")
                .append(Arrays.toString(numbers))
                .append("\nnumber then < that arithmetic mean: ").append(count);
    }
}
