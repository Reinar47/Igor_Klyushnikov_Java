import java.util.Arrays;

public class Task3 {

//    Составить алгоритм: на входе есть числовой массив,
//    необходимо вывести элементы массива кратные 3
    public static void task3(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void task3(double[] arr){
        for (double number : arr) {
            if (number % 3 == 0){
                System.out.print(number + " ");
            }
        }

    }
    public int[] task3Test(int[] arr){
        if (arr == null || arr.length == 0) {
            return new int[]{};
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0){
                index++;
            }
        }
        int[] result = new int[index];
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0){
                result[index] = arr[i];
                index++;
            }
        }

        return result;

    }
    public double[] task3Test(double[] arr){
        if (arr == null || arr.length == 0) {

            return new double[]{};
        }
        int index = 0;
        double[] result = new double[arr.length];
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0){
                result[index] = arr[i];
                index++;
            }
        }

        return  Arrays.copyOf(result,index);
    }

    public static void main(String[] args) {
        int[] testIntArr = {1,2,3,4,5,6,7,8,9};
        double[] testDoubleArr = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
        task3(testIntArr);
        System.out.println();
        task3(testDoubleArr);

    }

}
