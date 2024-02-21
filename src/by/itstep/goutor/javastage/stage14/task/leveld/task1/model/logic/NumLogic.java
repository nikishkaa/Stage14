package by.itstep.goutor.javastage.stage14.task.leveld.task1.model.logic;


public class NumLogic {
    public static int getCompositionNumber(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return -1;
        }


        int composition = 1;


        int minPosition = initMinPosition(numbers);
        int maxPosition = initMaxPosition(numbers);


        if (minPosition > maxPosition) {
            int t = minPosition;
            minPosition = maxPosition;
            maxPosition = t;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i > minPosition && i < maxPosition) {
                composition *= numbers[i];
            }
        }


        return composition;
    }

    private static int initMinPosition(int[] numbers) {

        int min = numbers[0];

        int minPosition = 0;


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
                minPosition = i;
            }
        }

        return minPosition;
    }


    private static int initMaxPosition(int[] numbers) {

        int max = numbers[0];

        int maxPosition = 0;


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
                maxPosition = i;
            }
        }

        return maxPosition;
    }

}
