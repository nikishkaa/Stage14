package by.itstep.goutor.javastage.stage14.task.leveld.task4.controller;

import by.itstep.goutor.javastage.stage14.task.leveld.task4.model.logic.CompositionLogic;
import by.itstep.goutor.javastage.stage14.task.leveld.task4.util.CompositionUI;
import by.itstep.goutor.javastage.stage14.task.leveld.task4.util.RndArray;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {
        int[] numbers = RndArray.getRandomArray();

        int composition = CompositionLogic.getCompositionBetweenZeroElement(numbers);


        PrintStringBuilder.print(CompositionUI.getUserUI(numbers, composition));
    }
}
