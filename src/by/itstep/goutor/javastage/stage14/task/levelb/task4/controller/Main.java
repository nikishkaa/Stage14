package by.itstep.goutor.javastage.stage14.task.levelb.task4.controller;

import by.itstep.goutor.javastage.stage14.task.levelb.task4.model.logic.NumberLogic;
import by.itstep.goutor.javastage.stage14.task.levelb.task4.util.RandomInitializeNumber;
import by.itstep.goutor.javastage.stage14.task.levelb.task4.util.UserInitNumber;
import by.itstep.goutor.javastage.stage14.task.levelb.task4.util.UserUI;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {
        int[] numbers = RandomInitializeNumber.getRandomArrayNumber();

        int userNumber = UserInitNumber.getUserNumber();

        int count = NumberLogic.getCountOtherNumber(numbers, userNumber);


        PrintStringBuilder.print(UserUI.getUserUI(numbers, count));
    }
}
