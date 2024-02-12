package by.itstep.goutor.javastage.stage14.task.leveld.task4.model.logic;


public class CompositionLogic {
    public static int getCompositionBetweenZeroElement(int[] numbers) {

        int composition = 1;

        int firstPosition = -1;
        int secondPosition = -1;
        int zeroCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zeroCount++;
                if (zeroCount == 1) {
                    firstPosition = i;
                } else {
                    secondPosition = i;
                    break;
                }

            }

        }

        for (int i = 0; i < numbers.length; i++) {
            if (i > firstPosition && i < secondPosition) {
                composition *= numbers[i];
            }

        }


        return composition;
    }
}
