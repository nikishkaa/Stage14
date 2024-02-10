package by.itstep.goutor.javastage.stage14.task.levela.task5.model.logic;

public class OddNumberLogic {
    public static int getOddNumberCount(int[] numbers) {
        int count = 0;

        for (int number : numbers) {

            if (number % 2 != 0) {
                count++;
            }
        }

        return count;
    }
}
