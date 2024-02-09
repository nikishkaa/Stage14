package by.itstep.goutor.javastage.stage14.task.task1.controller;

import by.itstep.goutor.javastage.stage14.task.task1.model.logic.NonZeroVectorLogic;
import by.itstep.goutor.javastage.stage14.task.task1.util.NonZeroElementsUI;
import by.itstep.goutor.javastage.stage14.util.testarray.TestArray;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;


public class Main {
    public static void main(String[] args) {

        int[] numbers = TestArray.getTestArray();

        int nonZeroElements = NonZeroVectorLogic.getNumberNonZero(numbers);

        PrintStringBuilder.print(NonZeroElementsUI.getNonZeroUI(nonZeroElements));

    }
}
