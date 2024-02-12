package by.itstep.goutor.javastage.stage14.task.leveld.task1.model.logic;

public class NumLogic {
    public static int getCompositionNumber(int[] numbers) {

        int composition = 1;

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        int minPosition = 0;
        int maxPosition = 0;


//        for (int number : numbers) {
//            if (number > min) {
//                min = number;
//            }
//            if (number < max) {
//                max = number;
//            }
//        }


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > min) {
                min = numbers[i];
                minPosition = i + 1;
            }

            if (numbers[i] < max) {
                max = numbers[i];
                maxPosition = i + 1;
            }
        }


        System.out.println("max " + min + "-max");
        System.out.println("min " + max + "-min");
        System.out.println("max Position " + minPosition + "-max");
        System.out.println("min Position  " + maxPosition + "-min");


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > maxPosition && numbers[i] < minPosition) {
                composition *= numbers[i];
            }

        }

        return composition;
    }
}
