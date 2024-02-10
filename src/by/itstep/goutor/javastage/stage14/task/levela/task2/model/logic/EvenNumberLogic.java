package by.itstep.goutor.javastage.stage14.task.levela.task2.model.logic;

public class EvenNumberLogic {
    public static int getCountEvenNumber(int[] numbers) {

        int evenCount = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {
                evenCount++;
            }

        }

        return evenCount;
    }
}
