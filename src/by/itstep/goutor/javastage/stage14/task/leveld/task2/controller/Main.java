package by.itstep.goutor.javastage.stage14.task.leveld.task2.controller;

import by.itstep.goutor.javastage.stage14.task.leveld.task2.model.logic.NumLogic;
import by.itstep.goutor.javastage.stage14.task.leveld.task2.util.NullNumberUI;
import by.itstep.goutor.javastage.stage14.task.leveld.task2.util.RndInitArray;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {

        int[] numbers = RndInitArray.getRndInitArray();

        int sum = NumLogic.getSum(numbers);

        PrintStringBuilder.print(NullNumberUI.getNulElementUI(numbers, sum));
    }
}
