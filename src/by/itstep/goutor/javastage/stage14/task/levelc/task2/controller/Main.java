package by.itstep.goutor.javastage.stage14.task.levelc.task2.controller;

import by.itstep.goutor.javastage.stage14.task.levelc.task2.model.logic.GeometricMeanLogic;
import by.itstep.goutor.javastage.stage14.task.levelc.task2.util.GeometricMeanUI;
import by.itstep.goutor.javastage.stage14.task.levelc.task2.util.RndInitArray;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {

        int[] numbers = RndInitArray.getRndArray();

        int count = GeometricMeanLogic.getCountGeometricMean(numbers);


        PrintStringBuilder.print(GeometricMeanUI.getGeometricMeanUI(numbers, count));
    }
}
