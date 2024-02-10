package by.itstep.goutor.javastage.stage14.task.task9.controller;

import by.itstep.goutor.javastage.stage14.task.task9.model.logic.NumberLogic;
import by.itstep.goutor.javastage.stage14.task.task9.util.NumberUI;
import by.itstep.goutor.javastage.stage14.task.task9.util.RandomInitializeNumber;
import by.itstep.goutor.javastage.stage14.task.task9.util.UserNumber;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {

        int[] numbers = RandomInitializeNumber.getRandomArrayNumber();

        int userNumber = UserNumber.getUserNumber();

        int count = NumberLogic.getEqualCountNumber(numbers, userNumber);


        PrintStringBuilder.print(NumberUI.getNumberUI(numbers, userNumber, count));
    }
}
