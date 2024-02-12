package by.itstep.goutor.javastage.stage14.task.leveld.task2.model.logic;

public class NumLogic {
    public static int getSum(int[] numbers) {

        int sum = 0;

        int positionOne = -1;
        int positionTwo = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                if (positionOne == -1) {
                    positionOne = i;
                }
                positionTwo = i;
            }

        }


        for (int i = 0; i < numbers.length; i++) {
            if (i > positionOne && i < positionTwo) {
                sum += numbers[i];
            }
        }


        return sum;
    }
}
