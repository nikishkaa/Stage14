package by.itstep.goutor.javastage.stage14.task.levelb.task9.controller;

import by.itstep.goutor.javastage.stage14.task.levelb.task9.model.logic.NumLogic;
import by.itstep.goutor.javastage.stage14.task.levelb.task9.util.BiggestNumberUI;
import by.itstep.goutor.javastage.stage14.task.levelb.task9.util.RndInitArray;
import by.itstep.goutor.javastage.stage14.task.levelb.task9.util.UserInit;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;


public class Main {
    public static void main(String[] args) {

        int[] numbers = RndInitArray.getRndArray();

        int userNumber = UserInit.getUserInaccuracy();

        int count = NumLogic.getCountOfBiggestNumber(numbers, userNumber);


        PrintStringBuilder.print(BiggestNumberUI.getBiggestNumberUI(numbers, userNumber, count));
    }
}
