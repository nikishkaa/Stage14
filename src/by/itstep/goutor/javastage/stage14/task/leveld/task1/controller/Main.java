package by.itstep.goutor.javastage.stage14.task.leveld.task1.controller;

import by.itstep.goutor.javastage.stage14.task.leveld.task1.model.logic.NumLogic;
import by.itstep.goutor.javastage.stage14.task.leveld.task1.util.NumUI;
import by.itstep.goutor.javastage.stage14.task.leveld.task1.util.RndInitArray;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;


public class Main {
    public static void main(String[] args) {

        int[] numbers = RndInitArray.getRndInitArray();

        int composition = NumLogic.getCompositionNumber(numbers);


        PrintStringBuilder.print(NumUI.getNumUI(numbers, composition));
    }
}
