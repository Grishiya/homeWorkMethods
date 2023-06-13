import javax.swing.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        Person john = new Person("John", 13);
        System.out.println("john.name = " + john.getName());
        System.out.println("john.age = " + john.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
    }

}
