package by.itstep.goutor.javastage.stage14.task.levelc.task1.controller;

import by.itstep.goutor.javastage.stage14.task.levelc.task1.model.logic.NumberLogic;
import by.itstep.goutor.javastage.stage14.task.levelc.task1.util.BiggestElementCountUI;
import by.itstep.goutor.javastage.stage14.task.levelc.task1.util.RandomInitializeNumber;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {

        int[] numbers = RandomInitializeNumber.getRandomArrayNumber();

        int count = NumberLogic.getBiggestElementCount(numbers);


        PrintStringBuilder.print(BiggestElementCountUI.getBiggestElementUI(numbers, count));
    }
}
