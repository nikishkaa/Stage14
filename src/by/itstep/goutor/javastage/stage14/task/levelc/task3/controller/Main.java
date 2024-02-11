package by.itstep.goutor.javastage.stage14.task.levelc.task3.controller;

import by.itstep.goutor.javastage.stage14.task.levelc.task3.model.logic.ArithmeticMeanNumLogic;
import by.itstep.goutor.javastage.stage14.task.levelc.task3.util.ArithmeticMeanUI;
import by.itstep.goutor.javastage.stage14.task.levelc.task3.util.RndInitArray;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {

        int[] numbers = RndInitArray.getRndArray();

        int count = ArithmeticMeanNumLogic.getCountArithmeticMeanCount(numbers);


        PrintStringBuilder.print(ArithmeticMeanUI.getArithmeticMeanUI(numbers, count));
    }
}
