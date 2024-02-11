package by.itstep.goutor.javastage.stage14.task.levelb.task5.util;

import java.util.Random;

public class RandomInitArray {
    public static final Random RANDOM;

    static {
        RANDOM = new Random();
    }

    public static double[] getRandomInitArray() {

        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = RANDOM.nextInt(100) + 1;
        }


        return numbers;
    }
}
