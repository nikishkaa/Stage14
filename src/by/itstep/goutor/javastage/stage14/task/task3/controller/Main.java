package by.itstep.goutor.javastage.stage14.task.task3.controller;

import by.itstep.goutor.javastage.stage14.task.task3.model.logic.PositiveNumber;
import by.itstep.goutor.javastage.stage14.task.task3.util.PositiveNumberUI;
import by.itstep.goutor.javastage.stage14.util.testarray.TestArray;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {

        int[] numbers = TestArray.getTestArray();

        int count = PositiveNumber.getCountPositiveNumber(numbers);

        PrintStringBuilder.print(PositiveNumberUI.getPositiveNumberUI(count));
    }
}
