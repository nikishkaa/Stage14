package by.itstep.goutor.javastage.stage14.task.levelb.task3.controller;

import by.itstep.goutor.javastage.stage14.task.levelb.task3.model.logic.NumberLogic;
import by.itstep.goutor.javastage.stage14.task.levelb.task3.util.NumberUI;
import by.itstep.goutor.javastage.stage14.task.levelb.task3.util.RandomInitializeNumber;
import by.itstep.goutor.javastage.stage14.task.levelb.task3.util.UserNumber;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {

        int[] numbers = RandomInitializeNumber.getRandomArrayNumber();

        int userNumber = UserNumber.getUserNumber();

        int count = NumberLogic.getEqualCountNumber(numbers, userNumber);


        PrintStringBuilder.print(NumberUI.getNumberUI(numbers, userNumber, count));
    }
}
