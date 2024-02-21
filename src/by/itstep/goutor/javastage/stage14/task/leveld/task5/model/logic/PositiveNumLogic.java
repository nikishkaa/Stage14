package by.itstep.goutor.javastage.stage14.task.leveld.task5.model.logic;

public class PositiveNumLogic {
    public static final int IMPOSSIBLE_ELEMENT = -1;

    public static int getSumBetweenPositiveElement(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return -1;
        }

        int sum = 0;

        int[] positions = getPosition(numbers);


        for (int i = positions[0] + 1; i < positions[1]; i++) {
            sum += numbers[i];
        }


        return sum;
    }


    private static int[] getPosition(int[] numbers) {

        int[] positions = new int[]{IMPOSSIBLE_ELEMENT, IMPOSSIBLE_ELEMENT};

        int positionCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                positionCount++;
                if (positionCount == 1) {
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
