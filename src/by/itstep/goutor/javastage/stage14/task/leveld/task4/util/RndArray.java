package by.itstep.goutor.javastage.stage14.task.leveld.task4.util;

import java.util.Random;

public class RndArray {
    public static Random RANDOM;

    static {
        RANDOM = new Random();
    }

    public static int[] getRandomArray() {

        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = RANDOM.nextInt(10);

        }

        return numbers;
    }

}
