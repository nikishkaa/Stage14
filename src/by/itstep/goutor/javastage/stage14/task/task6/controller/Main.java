package by.itstep.goutor.javastage.stage14.task.task6.controller;

import by.itstep.goutor.javastage.stage14.task.task6.model.logic.NegativeNumberCount;
import by.itstep.goutor.javastage.stage14.task.task6.util.NegativeNumberUI;
import by.itstep.goutor.javastage.stage14.util.testarray.TestArray;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {

        int[] numbers = TestArray.getTestArray();

        int count = NegativeNumberCount.getNegativeNumberCount(numbers);


        PrintStringBuilder.print(NegativeNumberUI.getNegativeNumberUI(count));
    }
}
