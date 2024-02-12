package by.itstep.goutor.javastage.stage14.task.leveld.task1.model.logic;


public class NumLogic {
    public static int getCompositionNumber(int[] numbers) {

        int composition = 1;

        int max = numbers[0];
        int min = numbers[0];

        int minPosition = 0;
        int maxPosition = 0;


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
                minPosition = i;
            }

            if (numbers[i] > max) {
                max = numbers[i];
                maxPosition = i;
            }
        }


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
}
