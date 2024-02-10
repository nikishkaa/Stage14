package by.itstep.goutor.javastage.stage14.task.levela.task3.model.logic;

public class PositiveNumber {
    public static int getCountPositiveNumber(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                count++;
            }

        }


        return count;
    }
}
