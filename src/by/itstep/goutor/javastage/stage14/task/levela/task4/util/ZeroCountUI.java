package by.itstep.goutor.javastage.stage14.task.levela.task4.util;

public class ZeroCountUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getZeroCountUI(int count) {

        return BUILDER.append("Zero number in your array — ").append(count);
    }
}
