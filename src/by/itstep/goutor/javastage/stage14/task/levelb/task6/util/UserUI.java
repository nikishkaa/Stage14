package by.itstep.goutor.javastage.stage14.task.levelb.task6.util;

import java.util.Arrays;

public class UserUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getUserUI(double[] numbers, int userNumber, int count) {

        return BUILDER.append("Start array: \n")
                .append(Arrays.toString(numbers))
                .append("\nYour digit: ").append(userNumber)
                .append("\nNumber in array don,t equals your number: ")
                .append(count);
    }
}
