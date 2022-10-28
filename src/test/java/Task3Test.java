import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void task3TestIntHappyPath() {
        int[] testIntArr = {1,2,3,4,5,6,7,8,9};
        int[] expectedResult = {3,6,9};

        Task3 task3 = new Task3();

        int[] actualResult = task3.task3Test(testIntArr);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    void task3TestIntZeroLength() {
        int[] testIntArr = {};
        int[] expectedResult = {};

        Task3 task3 = new Task3();

        int[] actualResult = task3.task3Test(testIntArr);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    void task3TestIntNull() {
        int[] testIntArr = null;
        int[] expectedResult = {};

        Task3 task3 = new Task3();

        int[] actualResult = task3.task3Test(testIntArr);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    void task3TestDoubleHappyPath() {
        double[] testDoubleArr = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
        double[] expectedResult = {3.0,6.0,9.0};

        Task3 task3 = new Task3();

        double[] actualResult = task3.task3Test(testDoubleArr);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    void task3TestDoubleZeroLength() {
        double[] testDoubleArr = {};
        double[] expectedResult = {};

        Task3 task3 = new Task3();

        double[] actualResult = task3.task3Test(testDoubleArr);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    void task3TestDoubleNull() {
        double[] testIntArr = null;
        double[] expectedResult = {};

        Task3 task3 = new Task3();

        double[] actualResult = task3.task3Test(testIntArr);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

}