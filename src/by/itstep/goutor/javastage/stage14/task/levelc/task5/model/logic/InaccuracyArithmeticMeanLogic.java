package by.itstep.goutor.javastage.stage14.task.levelc.task5.model.logic;

public class InaccuracyArithmeticMeanLogic {
    public static int getBiggestElementCount(int[] numbers, int userNumber) {

        if (numbers == null || numbers.length == 0) {
            return -1;
        }

        int count = 0;

        int mean = getArithmeticMean(numbers);

        for (int number : numbers) {
            if (number < (mean + userNumber) && number > (mean - userNumber)) {
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
