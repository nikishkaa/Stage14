package by.itstep.goutor.javastage.stage14.task.leveld.task3.model.logic;


public class LastPositiveNumLogic {
    public static final int IMPOSSIBLE_ELEMENT = -1;

    public static int getSumBeforeLastPositNum(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return -1;
        }

        int sum = 0;

        int lastPositPosition = initLastPosElement(numbers);


        System.out.println(lastPositPosition);


        for (int i = 0; i < lastPositPosition; i++) {
            sum += numbers[i];
        }


        return sum;
    }


    private static int initLastPosElement(int[] numbers) {

        int lastPositPosition = IMPOSSIBLE_ELEMENT;

        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i] > 0) {
                lastPositPosition = i;
                break;
            }
        }


        return lastPositPosition;
    }

}
