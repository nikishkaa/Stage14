package by.itstep.goutor.javastage.stage14.task.levelc.task2.model.logic;

public class GeometricMeanLogic {
    public static int getCountGeometricMean(int[] numbers) {

        int count = 0;

        double geometricMean = getGeometricMean(numbers);

        for (int number : numbers) {
            if (number > geometricMean) {
                count++;
            }
        }


        return count;
    }


    private static double getGeometricMean(int[] numbers) {

        double geometricMean = 1;

        for (int number : numbers) {

            geometricMean *= number;

        }

        geometricMean = Math.pow(geometricMean, (double) 1 / numbers.length);

        return geometricMean;
    }
}
