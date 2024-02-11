package by.itstep.goutor.javastage.stage14.task.levelb.task9.model.logic;

public class NumLogic {
    public static int getCountOfBiggestNumber(int[] numbers, int userNumber) {

        int count = 0;

        numbers = getPositiveArrayNumber(numbers);

        for (int number : numbers) {
            if (number == userNumber) {
                count++;
            }
        }

        return count;
    }


    private static int[] getPositiveArrayNumber(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] < 0) ? -numbers[i] : numbers[i];

        }

        return numbers;
    }
}
