package by.itstep.goutor.javastage.stage14.task.levelb.task6.util;

import java.util.Random;

public class RandomArrayInit {
    public static Random RANDOM;

    static {
        RANDOM = new Random();
    }

    public static double[] getRandomArray() {

        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = RANDOM.nextInt(100) + 1;
        }

        return numbers;
    }

}
