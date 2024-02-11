package by.itstep.goutor.javastage.stage14.task.levelc.task6.controller;

import by.itstep.goutor.javastage.stage14.task.levelc.task6.model.logic.GeometricMeanInaccuracyCountLogic;
import by.itstep.goutor.javastage.stage14.task.levelc.task6.util.GeometricMeanInaccuracyCountUI;
import by.itstep.goutor.javastage.stage14.task.levelc.task6.util.RndInitArray;
import by.itstep.goutor.javastage.stage14.task.levelc.task6.util.UserInit;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {

        int[] numbers = RndInitArray.getRndArray();

        int userNumber = UserInit.getUserInaccuracy();

        int count = GeometricMeanInaccuracyCountLogic.getGeometricMeanCount(numbers, userNumber);

        PrintStringBuilder.print(GeometricMeanInaccuracyCountUI.getGeometricMeanUI(numbers, userNumber, count));
    }
}
