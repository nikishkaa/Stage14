package by.itstep.goutor.javastage.stage14.task.levelb.task8.controller;

import by.itstep.goutor.javastage.stage14.task.levelb.task8.model.logic.NumLogic;
import by.itstep.goutor.javastage.stage14.task.levelb.task8.util.BiggestNumberUI;
import by.itstep.goutor.javastage.stage14.task.levelb.task8.util.RndInitArray;
import by.itstep.goutor.javastage.stage14.task.levelb.task8.util.UserInit;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;


public class Main {
    public static void main(String[] args) {

        int[] numbers = RndInitArray.getRndArray();

        int userNumber = UserInit.getUserInaccuracy();

        int count = NumLogic.getCountOfBiggestNumber(numbers, userNumber);


        PrintStringBuilder.print(BiggestNumberUI.getBiggestNumberUI(numbers, userNumber, count));
    }
}
