package by.itstep.goutor.javastage.stage14.task.levelb.task5.model.logic;

public class NumLogic {
    public static double getCountNumber(double[] numbers, int userNumber) {
        double count = 0;


        for (double number : numbers) {
            if (number / userNumber == 1) {
                count++;
            }

        }

        return count;
    }
}
