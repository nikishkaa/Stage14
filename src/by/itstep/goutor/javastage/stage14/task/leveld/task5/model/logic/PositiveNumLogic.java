package by.itstep.goutor.javastage.stage14.task.leveld.task5.model.logic;

public class PositiveNumLogic {
    public static int getSumBetweenPositiveElement(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return -1;
        }

        int sum = 0;

        int firstPositivePosition = -1;
        int secondPositivePosition = -1;
        int positionCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                positionCount++;
                if (positionCount == 1) {
                    firstPositivePosition = i;
                } else {

                    secondPositivePosition = i;
                    break;
                }
            }
        }


        for (int i = firstPositivePosition + 1; i < secondPositivePosition; i++) {
            sum += numbers[i];
        }


        return sum;
    }
}
