package by.itstep.goutor.javastage.stage14.task.levela.task2.model.logic;

public class EvenNumberLogic {
    public static int getCountEvenNumber(int[] numbers) {

        int evenCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                evenCount++;
            }

        }

        return evenCount;
    }
}
