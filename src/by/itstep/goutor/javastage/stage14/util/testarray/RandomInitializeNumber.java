package by.itstep.goutor.javastage.stage14.util.testarray;

import java.util.Random;

public class RandomInitializeNumber {

    private static final Random RANDOM;

    static {
        RANDOM = new Random();
    }

    public static int[] getRandomArrayNumber() {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = RANDOM.nextInt(100) + 1;
        }

        return numbers;
    }
}
