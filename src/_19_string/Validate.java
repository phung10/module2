package _19_string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean isValidClassName(String className) {
        String regex = "^[CAP][0-9]{4}[GHIKLM]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(className);

        return matcher.matches();
    }

    public static void main(String[] args) {
        // Kiểm tra ví dụ tên lớp hợp lệ và không hợp lệ
        String invalidClassName3 = "C0318G";    
        String invalidClassName1 = "M0318G";
        String invalidClassName2 = "P0323A";

        System.out.println(invalidClassName3 + " is valid: " + isValidClassName(invalidClassName3));
        System.out.println(invalidClassName1 + " is valid: " + isValidClassName(invalidClassName1));
        System.out.println(invalidClassName2 + " is valid: " + isValidClassName(invalidClassName2));
    }
}
