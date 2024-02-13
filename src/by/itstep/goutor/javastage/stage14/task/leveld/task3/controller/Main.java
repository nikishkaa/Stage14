package by.itstep.goutor.javastage.stage14.task.leveld.task3.controller;

import by.itstep.goutor.javastage.stage14.task.leveld.task3.model.logic.LastPositiveNumLogic;
import by.itstep.goutor.javastage.stage14.task.leveld.task3.util.LastPositPositionUI;
import by.itstep.goutor.javastage.stage14.task.leveld.task3.util.RndArray;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {

        int[] numbers = RndArray.getRndArray();

        int sum = LastPositiveNumLogic.getSumBeforeLastPositNum(numbers);


        PrintStringBuilder.print(LastPositPositionUI.getSumBeforeLastPositPosition(numbers, sum));
    }
}
