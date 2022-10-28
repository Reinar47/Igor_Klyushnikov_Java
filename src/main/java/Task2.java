public class Task2 {
//    Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет,
//    Вячеслав”, если нет, то вывести "Нет такого имени"

    public static void Task2(String name){
        if (name.equals("Вячеслав")){
            System.out.println("Привет,Вячеслав");
        }else {
            System.out.println("Нет такого имени");
        }
    }
    public String Task2Test(String name){
        if (name.equals("Вячеслав")){

            return "Привет,Вячеслав";
        }else {

            return "Нет такого имени";
        }
    }


    public static void main(String[] args) {
        Task2("Вячеслав");
        Task2("Вася");
    }


}
