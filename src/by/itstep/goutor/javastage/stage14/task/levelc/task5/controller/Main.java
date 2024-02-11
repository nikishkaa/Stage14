package by.itstep.goutor.javastage.stage14.task.levelc.task5.controller;

import by.itstep.goutor.javastage.stage14.task.levelc.task5.model.logic.InaccuracyArithmeticMeanLogic;
import by.itstep.goutor.javastage.stage14.task.levelc.task5.util.InaccuracyArUI;
import by.itstep.goutor.javastage.stage14.task.levelc.task5.util.RndInitArray;
import by.itstep.goutor.javastage.stage14.task.levelc.task5.util.UserInit;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {

        int[] numbers = RndInitArray.getRndArray();

        int userNumber = UserInit.getUserInaccuracy();

        int count = InaccuracyArithmeticMeanLogic.getBiggestElementCount(numbers, userNumber);


        PrintStringBuilder.print(InaccuracyArUI.getUserUI(numbers, userNumber, count));
    }
}
