package by.itstep.goutor.javastage.stage14.task.task8.util;

import by.itstep.goutor.javastage.stage14.util.view.StringPrint;

import java.util.Scanner;

public class UserInit {
    public static Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getUserDigit() {
        StringPrint.print("Enter your digit: ");

        return SCANNER.nextInt();
    }
}
