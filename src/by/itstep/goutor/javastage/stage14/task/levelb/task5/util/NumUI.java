package by.itstep.goutor.javastage.stage14.task.levelb.task5.util;

import java.util.Arrays;

public class NumUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getNumUI(double[] numbers, int userNumber, double count) {

        return BUILDER.append("Start vector is: \n")
                .append(Arrays.toString(numbers))
                .append("\nYour number: ").append(userNumber)
                .append("\nCount numbers multiples your number – ")
                .append(count);
    }
}
