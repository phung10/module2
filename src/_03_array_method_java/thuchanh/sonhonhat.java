package _03_array_method_java.thuchanh;

import java.util.Scanner;

public class sonhonhat {
    public static void main(String[] args) {
        int[] arr  ;
        int nhap;
        int index =  0;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong mang :");
        nhap = sc.nextInt();
        arr = new int[nhap];
        for (int i = 0;i<nhap;i++) {
            System.out.printf("nhap so thu " + (i + 1)+":");
            arr[i] = sc.nextInt();
        }
        //int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        System.out.println("The smallest element in the array is: " + arr[index]);
    }


}