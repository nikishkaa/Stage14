package by.itstep.goutor.javastage.stage14.task.levelc.task5.util;

import java.util.Random;

public class RndInitArray {
    public static Random RANDOM;

    static {
        RANDOM = new Random();
    }

    public static int[] getRndArray() {

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = RANDOM.nextInt(100) + 1;
        }

        return numbers;
    }
}
