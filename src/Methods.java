import java.time.LocalDate;
import java.util.Scanner;

public class Methods {
    public static void checkYears() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean checkYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (checkYear) {
            System.out.println(year + " год - високосный год");
        }else {
            System.out.println(year+ " год- невисокосный год");
        }
    }
    public static void checkDevice(){
        int clientOs = 1;
        int android = 1;
        int iOS = 0;
        int currentYear= LocalDate.now().getYear();
        Scanner scanner=new Scanner(System.in);
        int clientDeviceYear = scanner.nextInt();
        if (clientOs == iOS && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == iOS && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientOs == android && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOs == android && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            //Проверенно всеми 4 вариантами
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1.");
   //     checkYears();
        }
        public static void task2(){
        checkDevice();
        }
    }
