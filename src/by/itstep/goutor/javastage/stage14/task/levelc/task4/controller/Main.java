package by.itstep.goutor.javastage.stage14.task.levelc.task4.controller;

import by.itstep.goutor.javastage.stage14.task.levelc.task4.model.logic.GeometricMeanCountLogic;
import by.itstep.goutor.javastage.stage14.task.levelc.task4.util.GeometricMeanCountUI;
import by.itstep.goutor.javastage.stage14.task.levelc.task4.util.RndInitArray;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {

        int[] numbers = RndInitArray.getRndArray();

        int count = GeometricMeanCountLogic.getGeometricMeanCount(numbers);


        PrintStringBuilder.print(GeometricMeanCountUI.getGeometricMeanUI(numbers, count));
    }
}
