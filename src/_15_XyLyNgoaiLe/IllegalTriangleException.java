package _15_XyLyNgoaiLe;


import java.util.Scanner;

public class IllegalTriangleException extends Throwable {

    static Scanner scanner = new Scanner(System.in);

    public static void innput() throws IllegalTriangleException  {

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException();
        } else if (a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalTriangleException();
        }
        System.out.print("hop le");
    }
    public static void main(String[] args) {
        try {
           innput();
        }catch (IllegalTriangleException e){
            System.out.print("loi");
        }
    }
}
