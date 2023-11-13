package _13_TimKiem.baitap;
import java.util.LinkedList;
import java.util.Scanner;
public class MaxSubstring {
    public static String maxSubstring(String string){
        LinkedList<Character> maxList = new LinkedList<>();
        LinkedList<Character> childList = new LinkedList<>();

        for (int i = 0; i < string.length(); i++){
            if (childList.size() > 1 && string.charAt(i) <= childList.getLast()
                    && childList.contains(string.charAt(i))){
                childList.clear();
            }
            childList.add(string.charAt(i));
            if (childList.size() > maxList.size()){
                maxList.clear();
                maxList.addAll(childList);
            }
        }
        StringBuilder strBuilder = new StringBuilder();
        for (Character c: maxList){
            strBuilder.append(c);
        }
        return string = strBuilder.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println(maxSubstring(str));
    }
}
