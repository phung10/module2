package _03_array_method_java.thuchanh;

import java.util.Scanner;

public class thuchanh {
    public static void main(String[] args) {
        int[] students  ;
        int nhap;
        int index =  0;
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap so luong mang :");
        nhap = sc.nextInt();
        students = new int[nhap];
        for (int i = 0;i<nhap;i++) {
            System.out.printf("nhap so thu " + (i + 1)+":");
            students[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] > max) {
                max = students[i];
                index = i;
            }
        }
        System.out.printf("so lon nhat la :"+max+"tai vi tri :"+index);
    }}
// 10 4 2 3