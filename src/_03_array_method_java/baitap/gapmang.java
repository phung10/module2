package _03_array_method_java.baitap;

import java.util.Arrays;

public class gapmang {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {55, 32, 88, 55};
        int length1 = arr1.length;
        int length2 = arr2.length;

        int[] result = new int[length1 + length2];

        for (int i = 0; i < length1; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < length2; i++) {
            result[length1 + i] = arr2[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
