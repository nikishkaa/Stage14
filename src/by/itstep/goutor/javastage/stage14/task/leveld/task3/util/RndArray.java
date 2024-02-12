package by.itstep.goutor.javastage.stage14.task.leveld.task3.util;

import java.util.Random;

public class RndArray {
    public static Random RANDOM;

    static {
        RANDOM = new Random();
    }

    public static int[] getRndArray() {

        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = RANDOM.nextInt(101) - 50;
        }

        return numbers;
    }
}
