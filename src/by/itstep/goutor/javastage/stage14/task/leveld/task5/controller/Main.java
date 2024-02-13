package by.itstep.goutor.javastage.stage14.task.leveld.task5.controller;

import by.itstep.goutor.javastage.stage14.task.leveld.task5.model.logic.PositiveNumLogic;
import by.itstep.goutor.javastage.stage14.task.leveld.task5.util.PositiveNumUI;
import by.itstep.goutor.javastage.stage14.task.leveld.task5.util.RndArray;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;


public class Main {
    public static void main(String[] args) {

        int[] numbers = RndArray.getRndArray();

        int sum = PositiveNumLogic.getSumBetweenPositiveElement(numbers);


        PrintStringBuilder.print(PositiveNumUI.getUserUI(numbers, sum));
    }
}
