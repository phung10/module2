package _02_loop_java.baitap;

public class hienthi20sntdau {
    public static void main(String[] args) {
        int dem = 1;
        int number = 2;
        while (dem < 21) {
//            if (number < 2) {
//                number = 1;
//            } else {
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check) {
                    System.out.println(+dem+":" +number);
                    dem++;
                }
                number++;
            }
        }
    }



