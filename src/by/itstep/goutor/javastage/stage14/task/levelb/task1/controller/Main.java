package by.itstep.goutor.javastage.stage14.task.levelb.task1.controller;

import by.itstep.goutor.javastage.stage14.task.levelb.task1.model.logic.NumberLogic;
import by.itstep.goutor.javastage.stage14.task.levelb.task1.util.NumberUI;
import by.itstep.goutor.javastage.stage14.task.levelb.task1.util.UserInit;
import by.itstep.goutor.javastage.stage14.task.levelb.task1.util.RandomInitializeNumber;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {
        int[] numbers = RandomInitializeNumber.getRandomArrayNumber();

        int userNumber = UserInit.getUserDigit();

        int count = NumberLogic.getNumberLogic(numbers, userNumber);


        PrintStringBuilder.print(NumberUI.getNumberUI(numbers, count, userNumber));
    }
}
