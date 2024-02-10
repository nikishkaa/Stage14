package by.itstep.goutor.javastage.stage14.task.levelc.task1.model.logic;

public class NumberLogic {
    public static int getBiggestElementCount(int[] numbers) {

        int count = 0;

        int mean = getArithmeticMean(numbers);

        for (int number : numbers) {
            if (number > mean) {
                count++;
            }

        }


        return count;
    }


    private static int getArithmeticMean(int[] numbers) {
        int mean = 0;

        for (int number : numbers) {
            mean += number;
        }

        mean = mean / numbers.length;

        return mean;
    }
}
