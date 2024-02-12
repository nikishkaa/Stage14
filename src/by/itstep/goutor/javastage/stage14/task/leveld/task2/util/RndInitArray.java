package by.itstep.goutor.javastage.stage14.task.leveld.task2.util;

import java.util.Random;

public class RndInitArray {
    public static Random RANDOM;

    static {
        RANDOM = new Random();
    }

    public static int[] getRndInitArray() {

        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = RANDOM.nextInt(5);
        }


        return numbers;
    }
}
