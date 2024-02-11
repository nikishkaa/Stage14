package by.itstep.goutor.javastage.stage14.task.levelc.task3.model.logic;

public class ArithmeticMeanNumLogic {
    public static int getCountArithmeticMeanCount(int[] numbers) {

        int count = 0;

        double arithmeticMean = getArithmeticMean(numbers);

        for (int number : numbers) {
            if (number < arithmeticMean) {
                count++;
            }
        }


        return count;
    }


    private static double getArithmeticMean(int[] numbers) {

        int arithmeticMean = 0;

        for (int number : numbers) {
            arithmeticMean += number;
        }

        arithmeticMean = arithmeticMean / numbers.length;

        return arithmeticMean;
    }

}
