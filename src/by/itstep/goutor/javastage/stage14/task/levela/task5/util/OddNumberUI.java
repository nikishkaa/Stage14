package by.itstep.goutor.javastage.stage14.task.levela.task5.util;

public class OddNumberUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getOddNumberUI(int count) {

        return BUILDER.append("Odd number in your vector — ").append(count);
    }
}
