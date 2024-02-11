package by.itstep.goutor.javastage.stage14.task.levelb.task6.model.logic;

public class NumLogic {
    public static int getNumLogic(double[] numbers, int userNumber) {

        int count = numbers.length;

        for (double number : numbers) {
            if (number / userNumber == 1) {
                count--;
            }
        }
        return count;
    }
}
