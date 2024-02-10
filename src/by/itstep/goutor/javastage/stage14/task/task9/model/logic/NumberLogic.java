package by.itstep.goutor.javastage.stage14.task.task9.model.logic;

public class NumberLogic {
    public static int getEqualCountNumber(int[] numbers, int userNumber) {

        int count = 0;

        for (int number : numbers) {
            if (number == userNumber) {
                count++;
            }
        }

        return count;
    }

}
