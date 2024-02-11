package by.itstep.goutor.javastage.stage14.task.levela.task3.util;

public class PositiveNumberUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getPositiveNumberUI(int count) {

        return BUILDER.append(count).append(" — Positive digit in your vector");
    }
}
