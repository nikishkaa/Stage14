package by.itstep.goutor.javastage.stage14.task.leveld.task3.model;


public class LastPositiveNumLogic {
    public static int getSumBeforeLastPositNum(int[] numbers) {

        int sum = 0;

        int lastPositPosition = -1;

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] > 0) {
                lastPositPosition = i;
                break;
            }
        }

        for (int i = 0; i < numbers[lastPositPosition]; i++) {

            if (i < lastPositPosition) {
                sum += numbers[i];
            }

        }


        return sum;
    }
}
