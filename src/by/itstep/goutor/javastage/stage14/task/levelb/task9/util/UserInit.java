package by.itstep.goutor.javastage.stage14.task.levelb.task9.util;

import by.itstep.goutor.javastage.stage14.util.view.StringPrint;

import java.util.Scanner;

public class UserInit {
    public static Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getUserInaccuracy() {

        StringPrint.print("Enter equals number in vector: ");

        return SCANNER.nextInt();
    }
}
