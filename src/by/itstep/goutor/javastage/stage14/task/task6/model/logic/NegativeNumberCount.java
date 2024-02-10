package by.itstep.goutor.javastage.stage14.task.task6.model.logic;

public class NegativeNumberCount {
    public static int getNegativeNumberCount(int[] numbers) {
        int count = 0;

        for (int number : numbers) {

            if (number < 0) {
                count++;
            }
        }


        return count;
    }
}
