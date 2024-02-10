package by.itstep.goutor.javastage.stage14.task.levela.task4.model.logic;

public class ZeroNumberCount {
    public static int getZeroNumberCount(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number == 0) {
                count++;
            }
        }

        return count;
    }
}
