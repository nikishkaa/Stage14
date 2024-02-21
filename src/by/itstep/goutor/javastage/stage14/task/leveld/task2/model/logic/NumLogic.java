package by.itstep.goutor.javastage.stage14.task.leveld.task2.model.logic;

public class NumLogic {
    public static int getSum(int[] numbers) {

        int positionOne = getFirstPosition(numbers);
        int positionTwo = getSecondPosition(numbers, positionOne);


        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i > positionOne && i < positionTwo) {
                sum += numbers[i];
            }
        }


        return sum;
    }


    private static int getFirstPosition(int[] numbers) {

        int positionOne = -1;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 0) {
                if (positionOne == -1) {
                    positionOne = i;
                }
            }

        }

        return positionOne;
    }


    private static int getSecondPosition(int[] numbers, int positionOne) {

        int positionTwo = -1;

        for (int i = numbers.length - 1; i > 0; i--) {

            if (numbers[i] == 0) {

                if (positionOne < i) {

                    positionTwo = i;

                }
            }

        }

        return positionTwo;
    }

}
