package by.itstep.goutor.javastage.stage14.task.levelb.task4.util;

import java.util.Arrays;

public class UserUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getUserUI(int[] numbers, int count) {

        return BUILDER.append("Start vector").append(Arrays.toString(numbers))
                .append("\nCount digit don,t equal your number is – ")
                .append(count);
    }
}
