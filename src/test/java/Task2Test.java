import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void task2TestHappyPath() {
        String name = "Вячеслав";
        String expectedResult = "Привет,Вячеслав";

        Task2 task2 = new Task2();

        String actualresult = task2.Task2Test(name);

        Assertions.assertEquals(expectedResult,actualresult);

    }
    @Test
    void task2TestNegative() {
        String name = "Вася";
        String expectedResult = "Нет такого имени";

        Task2 task2 = new Task2();

        String actualResult = task2.Task2Test(name);

        Assertions.assertEquals(expectedResult,actualResult);

    }
}