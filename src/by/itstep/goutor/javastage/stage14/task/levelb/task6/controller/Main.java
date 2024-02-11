package by.itstep.goutor.javastage.stage14.task.levelb.task6.controller;

import by.itstep.goutor.javastage.stage14.task.levelb.task6.model.logic.NumLogic;
import by.itstep.goutor.javastage.stage14.task.levelb.task6.util.RandomArrayInit;
import by.itstep.goutor.javastage.stage14.task.levelb.task6.util.UserInit;
import by.itstep.goutor.javastage.stage14.task.levelb.task6.util.UserUI;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {
        double[] numbers = RandomArrayInit.getRandomArray();

        int userNumber = UserInit.getUserNumber();

        int count = NumLogic.getNumLogic(numbers, userNumber);


        PrintStringBuilder.print(UserUI.getUserUI(numbers, userNumber, count));
    }
}
