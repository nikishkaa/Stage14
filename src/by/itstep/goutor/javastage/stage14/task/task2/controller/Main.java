package by.itstep.goutor.javastage.stage14.task.task2.controller;

import by.itstep.goutor.javastage.stage14.task.task2.model.logic.EvenNumberLogic;
import by.itstep.goutor.javastage.stage14.task.task2.util.EvenNumberUI;
import by.itstep.goutor.javastage.stage14.util.testarray.TestArray;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;


public class Main {
    public static void main(String[] args) {

        int[] numbers = TestArray.getTestArray();

        int evenCount = EvenNumberLogic.getCountEvenNumber(numbers);

        PrintStringBuilder.print(EvenNumberUI.getEvenUI(evenCount));
    }
}
