package _03_array_method_java.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class themvaomang {
    public static void main(String[] args) {
        int index;
        int x;
        int[] array = {1,2,3,4,5,6,0,0,};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vị trí cần chèn vào mảng: ");
        index = scanner.nextInt();
        System.out.print("Nhập giả trị cần chèn:");
        x = scanner.nextInt();
// Tạo mảng mới có kích thước lớn hơn
        int[] Newarray = new int[array.length + 1];
// Sao chép phần tử từ mảng ban đầu đến trước vị trí cần chèn
        for (int i =0; i <index; i++){
            Newarray[i]=array[i];
        }
// Chèn phần tử mới vào vị trí mong muốn
        Newarray[index] = x;
// Sao chép các phần tử còn lại từ mảng ban đầu
        for (int i = index + 1;i<Newarray.length; i++){
            Newarray[i] = array[i -1];
        }
        System.out.print("Mảng sau khi chèn "+ Arrays.toString(Newarray));
    }
}
