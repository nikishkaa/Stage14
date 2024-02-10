package by.itstep.goutor.javastage.stage14.task.levelb.task4.util;

import by.itstep.goutor.javastage.stage14.util.view.StringPrint;

import java.util.Scanner;

public class UserInitNumber {
    public static Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getUserNumber() {
        StringPrint.print("Enter your digit: ");

        return SCANNER.nextInt();
    }
}
