package by.itstep.goutor.javastage.stage14.task.levela.task1.model.logic;

public class NonZeroVectorLogic {
    public static int getNumberNonZero(int[] numbers) {

        int nonZeroElements = 0;

        for (int number : numbers) {

            if (number != 0) {
                nonZeroElements++;
            }

        }


        return nonZeroElements;
    }
}
