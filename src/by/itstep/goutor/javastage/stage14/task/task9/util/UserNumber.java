package by.itstep.goutor.javastage.stage14.task.task9.util;

import by.itstep.goutor.javastage.stage14.util.view.StringPrint;

import java.util.Scanner;

public class UserNumber {
    public static Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getUserNumber() {
        StringPrint.print("Enter your number: ");

        return SCANNER.nextInt();
    }
}
