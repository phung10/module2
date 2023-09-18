package _02_loop_java.baitap;

public class hienthisntduoi100 {
    public static void main(String[] args) {
        for (int number = 0; number <= 100; number++) {
            if (number < 2) {
                // System.out.println(number + " is not a prime");
                number = 1;
            } else {
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check)
                    System.out.println(number);

            }
        }
    }
}

