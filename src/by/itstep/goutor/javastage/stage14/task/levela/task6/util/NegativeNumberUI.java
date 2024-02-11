package by.itstep.goutor.javastage.stage14.task.levela.task6.util;

public class NegativeNumberUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getNegativeNumberUI(int count) {

        return BUILDER.append("Negative number in your vector — ").append(count);
    }
}
