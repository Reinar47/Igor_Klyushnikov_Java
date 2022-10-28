public class Task1 {
//    Составить алгоритм: если введенное число больше 7, то вывести “Привет”
    public static void task1(int number){
        if (number > 7){
            System.out.println("Привет");
        }
    }
    public String task1Test(int number){
        if (number > 7){

            return "Привет";
        }else {

            return "Веедённое число меньше или равно 7";
        }
    }


    public static void main(String[] args) {
        task1(8);
    }

}
