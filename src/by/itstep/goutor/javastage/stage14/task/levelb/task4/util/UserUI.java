package by.itstep.goutor.javastage.stage14.task.levelb.task4.util;

import java.util.Arrays;

public class UserUI {
    public static StringBuilder getUserUI(int[] numbers, int count) {
        StringBuilder builder = new StringBuilder();

        return builder.append("Start vector").append(Arrays.toString(numbers))
                .append("\nCount digit don,t equal your number is – ")
                .append(count);
    }
}
