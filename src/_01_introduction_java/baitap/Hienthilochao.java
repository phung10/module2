package _01_introduction_java.baitap;

import java.util.Scanner;

public class Hienthilochao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String  name = sc.nextLine();
        System.out.println("Hello: " + name);
    }
}
