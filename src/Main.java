public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
       System.out.println("Задача 1: Написать 4 строки с данными сотрудника");
       String firstName = "Ivan";
       String middleName = "Ivanovich";
       String lastName = "Ivanov";
       String fullName = lastName + ' ' + firstName + ' ' + middleName;
       System.out.println("ФИО сотрудника: " + fullName);
    }
    public static void task2 () {
        System.out.println("Задача 2: Изменение написания Ф.И.О. на полностью заглавные буквы");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println(fullName.toUpperCase());
    }
    public static void task3 () {
        System.out.println("Задача 3: Замена в строке символа 'ё' на символ 'е'");
        String fullName = "Горбунков Семён Семёнович";
        System.out.println("ФИО сотрудника с буквами 'ё': " + fullName);
        System.out.println("Данные ФИО сотрудника после исправления: " + fullName.replace("ё", "e"));
    }
}