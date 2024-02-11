package by.itstep.goutor.javastage.stage14.task.levelc.task4.model.logic;

public class GeometricMeanCountLogic {
    public static int getGeometricMeanCount(int[] numbers) {

        int count = 0;

        double geometricMeans = getGeometricMean(numbers);

        for (int number : numbers) {
            if (number < geometricMeans) {
                count++;
            }
        }

        return count;
    }


    private static double getGeometricMean(int[] numbers) {

        double geometricMeans = 1;

        for (int number : numbers) {
            geometricMeans *= number;
        }

        geometricMeans = Math.pow(geometricMeans, (double) 1 / numbers.length);

        return geometricMeans;
    }
}
