package by.itstep.goutor.javastage.stage14.task.levelb.task5.controller;

import by.itstep.goutor.javastage.stage14.task.levelb.task5.model.logic.NumLogic;
import by.itstep.goutor.javastage.stage14.task.levelb.task5.util.NumUI;
import by.itstep.goutor.javastage.stage14.task.levelb.task5.util.RandomInitArray;
import by.itstep.goutor.javastage.stage14.task.levelb.task5.util.UserInitNumber;
import by.itstep.goutor.javastage.stage14.util.view.PrintStringBuilder;

public class Main {
    public static void main(String[] args) {

        double[] numbers = RandomInitArray.getRandomInitArray();

        int userNumber = UserInitNumber.getUserNumber();

        double count = NumLogic.getCountNumber(numbers, userNumber);


        PrintStringBuilder.print(NumUI.getNumUI(numbers, userNumber, count));
    }
}
