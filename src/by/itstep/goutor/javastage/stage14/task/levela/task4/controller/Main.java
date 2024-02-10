package by.itstep.goutor.javastage.stage14.task.levela.task4.controller;

import by.itstep.goutor.javastage.stage14.task.levela.task4.model.logic.ZeroNumberCount;
import by.itstep.goutor.javastage.stage14.task.levela.task4.util.ZeroCountUI;
import by.itstep.goutor.javastage.stage14.util.testarray.TestArray;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {

        int[] numbers = TestArray.getTestArray();

        int count = ZeroNumberCount.getZeroNumberCount(numbers);


        PrintStringBuilder.print(ZeroCountUI.getZeroCountUI(count));
    }
}
