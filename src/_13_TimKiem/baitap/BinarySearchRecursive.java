package _13_TimKiem.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    private static int binarySearch(int[] array, int left, int right, int value) {
        if (left < right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            } else {
                return binarySearch(array, left, middle - 1, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        //int[] a={2,8,10,25,57,60,75,90,100};

        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap so luong mang ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu so " + i);
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("mang khi duoc sap xep la" + Arrays.toString(arr));
        System.out.printf("nhap gia tri can tim ");
        int value = sc.nextInt();
        int index = binarySearch(arr, 0, arr.length - 1, value);

        if (index != -1) {
            System.out.printf("gia tri duoc tim thay tai vi tri " + index);
        } else {
            while (index == -1) {
                System.out.printf("khong co gia tri hay nhap lai");
                Scanner ss = new Scanner(System.in);
               int value1 = ss.nextInt();
                index = binarySearch(arr, 0, arr.length - 1, value1);
                if (index != -1) {
                    System.out.printf("gia tri duoc ti  m thay bkjadbmcavi tri " + index);
                }
            }

        }
    }
}
