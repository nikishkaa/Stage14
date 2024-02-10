package by.itstep.goutor.javastage.stage14.task.task7.controller;

import by.itstep.goutor.javastage.stage14.task.task7.model.logic.NumberLogic;
import by.itstep.goutor.javastage.stage14.task.task7.util.NumberUI;
import by.itstep.goutor.javastage.stage14.task.task7.util.UserInit;
import by.itstep.goutor.javastage.stage14.task.task7.util.RandomInitializeNumber;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {
        int[] numbers = RandomInitializeNumber.getRandomArrayNumber();

        int userNumber = UserInit.getUserDigit();

        int count = NumberLogic.getNumberLogic(numbers, userNumber);


        PrintStringBuilder.print(NumberUI.getNumberUI(numbers, count, userNumber));
    }
}
