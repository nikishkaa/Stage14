package by.itstep.goutor.javastage.stage14.task.levela.task1.util;

public class NonZeroElementsUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getNonZeroUI(int nonZeroElements) {

        return BUILDER.append("Non zero elements in your vector ")
                .append(nonZeroElements);
    }
}
