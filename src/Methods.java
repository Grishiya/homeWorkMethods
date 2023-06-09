import java.time.LocalDate;
import java.util.Scanner;

public class Methods {
    public static void checkYears() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean checkYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (checkYear) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год- невисокосный год");
        }
    }

    public static void checkDevice() {
        int clientOs = 1;
        int android = 1;
        int iOS = 0;
        int currentYear = LocalDate.now().getYear();
        Scanner scanner = new Scanner(System.in);
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
    public static void checkDelivery(){
        Scanner scanner=new Scanner(System.in);
        int deliveryDistance = scanner.nextInt();
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays + ".");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1) + ".");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2) + ".");
        }else{
            System.out.println("Доставки нет.");
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1.");
        //     checkYears();
    }

    public static void task2() {
        System.out.println("Задача 2.");
        //checkDevice();
    }
    public static void task3(){
        System.out.println("Задача 3.");
checkDelivery();
    }
}
