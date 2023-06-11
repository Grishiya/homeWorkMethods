import javax.swing.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        printCheckYear(year);

    }

    public static void printCheckYear(int year) {
        boolean checkYear=year%4==0&&year%100!=0||year%400==0;
        if (checkYear){
            System.out.println(year+" год - високосный год");
        }else{
            System.out.println(year+" год - невисокосный год");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        int clientOs = scanner.nextInt();
        int clientDeviceYear = scanner.nextInt();
        printVersionType(clientOs, clientDeviceYear);

    }

    public static void printVersionType(int clientOs, int clientDeviceYear) {
        int iOs = 0;
        int android = 1;
        int currentYear = LocalDate.now().getYear();

        if (clientOs > android && clientOs > iOs) {
            throw new RuntimeException("Такая OS не поддерживается!!!");
        }
        if (clientDeviceYear < 2010) {
            throw new RuntimeException("Купи новый телефон,твой слишком старый");
        }

        if (clientOs == iOs) {
            System.out.print("iOs - ");

            if (clientDeviceYear < currentYear) {
                System.out.println("облегченная");
            } else {
                System.out.println("обычная");
            }
        }
        if (clientOs == android) {
            System.out.print("android - ");
            if (clientDeviceYear < currentYear) {
                System.out.println("облегченная");
            } else {
                System.out.println("обычная");
            }
        }
    }
    public static void task3(){
        System.out.println("Задача 3");
        Scanner scanner=new Scanner(System.in);
        int deliveryDistance=scanner.nextInt();
        int days=checkDeliveryTime(deliveryDistance);
        if (days>0) {
            System.out.println(days);
        }else {
            System.out.println(days);
        }

    }
    public static int checkDeliveryTime(int deliveryDistance){
        int deliveryTime=1;
        if (deliveryDistance<20){
            deliveryTime=1;
        }else if (deliveryDistance<60) {
            deliveryTime=2;
        }else if (deliveryDistance<100) {
            deliveryTime=3;
        }else{
            deliveryTime=-1;
        }
return deliveryTime;
    }
}
