package _03_array_method_java.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class xoaptkhoimang {
    public static void main(String[] args) {
        int[] dayso = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.print("Mảng bang đầu " + Arrays.toString(dayso));
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập giá trị cần xoá:");
        int soCanXoa = scanner.nextInt();
        int index = -1;// để lưu phần tử trong mảng
        for (int i = 0; i < dayso.length; i++) {
            if (dayso[i] == soCanXoa) {
                index = i;
            }
        }
        if (index >= 0) {
            for (int i = index; i < dayso.length - 1; i++) {
                dayso[i] = dayso[ i + 1];// di chuyển các phần tử phía sau của mảng lên một vị trí để lấp đầy vị trí của phần tử bị xóa
            }
            System.out.println("Mảng sau khi xóa: " + Arrays.toString(dayso));
        }else {
            System.out.println("Không tìm thấy giá trị phù hợp cần xóa trong mảng");
        }
    }
}
