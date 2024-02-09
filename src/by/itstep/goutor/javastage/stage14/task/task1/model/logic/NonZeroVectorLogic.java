package by.itstep.goutor.javastage.stage14.task.task1.model.logic;

public class NonZeroVectorLogic {
    public static int getNumberNonZero(int[] numbers) {

        int nonZeroElements = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != 0) {
                nonZeroElements++;
            }

        }


        return nonZeroElements;
    }
}
