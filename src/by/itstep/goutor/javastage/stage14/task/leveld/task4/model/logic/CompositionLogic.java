package by.itstep.goutor.javastage.stage14.task.leveld.task4.model.logic;


public class CompositionLogic {
    public static final int IMPOSSIBLE_ELEMENT = -1;

    public static int getCompositionBetweenZeroElement(int[] numbers) {

        int composition = 1;

        int[] positions = getFirstAndSecondPosition(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (i > positions[0] && i < positions[1]) {
                composition *= numbers[i];
            }

        }


        return composition;
    }


    private static int[] getFirstAndSecondPosition(int[] numbers) {

        int zeroCount = 0;

        int[] positions = new int[]{IMPOSSIBLE_ELEMENT, IMPOSSIBLE_ELEMENT};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zeroCount++;
                if (zeroCount == 1) {
                    positions[0] = i;
                } else {
                    positions[1] = i;
                    break;
                }

            }

        }

        return positions;
    }
}
