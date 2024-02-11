package by.itstep.goutor.javastage.stage14.task.levelb.task8.util;

import java.util.Arrays;

public class BiggestNumberUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getBiggestNumberUI(int[] numbers, int userNumber, int count) {

        return BUILDER.append("Start array: \n")
                .append(Arrays.toString(numbers))
                .append("\nYour biggest number is: ")
                .append(userNumber)
                .append("\nCount number then smaller your number is: ")
                .append(count);
    }
}
