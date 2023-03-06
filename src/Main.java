public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1 () {
       System.out.println("Задача 1: Написать 4 строки с данными сотрудника");
       String firstName = "Ivan ";
       String middleName = "Ivanovich";
       String lastName = "Ivanov ";
       String fullName = lastName + firstName + middleName;
       System.out.println("fullName = " + fullName);
    }
    public static void task2 () {
        System.out.println("Задача 2: Изменение написания Ф.И.О. на полностью заглавные буквы");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println(fullName.toUpperCase());
    }
}