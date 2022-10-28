import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    public void task1TestHappyPath(){
        int number = 8;
        String expectedResult = "Привет";

        Task1 task1 = new Task1();

        String actualResult = task1.task1Test(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void task1TestNegative(){
        int number = 7;
        String expectedResult = "Веедённое число меньше или равно 7";

        Task1 task1 = new Task1();

        String actualresult = task1.task1Test(number);

        Assertions.assertEquals(expectedResult,actualresult);

    }
}