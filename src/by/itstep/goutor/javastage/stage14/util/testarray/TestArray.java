package by.itstep.goutor.javastage.stage14.util.testarray;

import by.itstep.goutor.javastage.stage14.util.view.StringPrint;

import java.util.Scanner;

public class TestArray {
    public static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int[] getTestArray() {
        int[] numbers = new int[5];


        for (int i = 0; i < numbers.length; i++) {

            StringPrint.print("Enter " + (i + 1) + " array number: ");
            numbers[i] = SCANNER.nextInt();

        }

        return numbers;


    }
}
