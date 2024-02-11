package by.itstep.goutor.javastage.stage14.task.levela.task2.util;

public class EvenNumberUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getEvenUI(int evenCount) {


        return BUILDER.append("Even number in your vector ").append(evenCount);
    }
}
