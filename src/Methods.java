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

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1.");
        checkYears();
        }
    }
