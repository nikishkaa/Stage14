package by.itstep.goutor.javastage.stage14.task.task5.controller;

import by.itstep.goutor.javastage.stage14.task.task5.model.logic.OddNumberLogic;
import by.itstep.goutor.javastage.stage14.task.task5.util.OddNumberUI;
import by.itstep.goutor.javastage.stage14.util.testarray.TestArray;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {
        int[] numbers = TestArray.getTestArray();

        int count = OddNumberLogic.getOddNumberCount(numbers);


        PrintStringBuilder.print(OddNumberUI.getOddNumberUI(count));
    }
}
