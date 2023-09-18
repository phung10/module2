package _01_introduction_java.baitap;
import java.util.Scanner;
public class quydoitien {
    public static void main(String[] args) {

        long usd ;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền usd để đổi sang vnd");
        usd = sc.nextLong();
        long rate = usd * 23000;
        System.out.println("="+rate+"vnđ");
    }
}
