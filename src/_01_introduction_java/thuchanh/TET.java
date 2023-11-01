package _01_introduction_java.thuchanh;

public class TET {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("123a");
        a.append("sda");
        a.append("\ndasda");
        System.out.println(a);
        a.insert(2, "   dsada");
        int c = a.length();
        System.out.println(c);
    }
}
