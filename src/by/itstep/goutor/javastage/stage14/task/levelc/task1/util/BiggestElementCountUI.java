package by.itstep.goutor.javastage.stage14.task.levelc.task1.util;

import java.util.Arrays;

public class BiggestElementCountUI {
    public static StringBuilder getBiggestElementUI(int[] numbers, int count) {

        StringBuilder builder = new StringBuilder();


        return builder.append("Start vector ").append(Arrays.toString(numbers))
                .append("\nElements biggest then arithmetic mean – ")
                .append(count);
    }
}
