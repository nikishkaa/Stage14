package by.itstep.goutor.javastage.stage14.task.leveld.task4.util;


import java.util.Arrays;

public class CompositionUI {

    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getUserUI(int[] numbers, int composition) {

        return BUILDER.append("Start vector: ")
                .append(Arrays.toString(numbers))
                .append("\nComposition number between first zero element" +
                        "and second zero element: ")
                .append(composition);
    }
}
