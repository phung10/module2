package _13_TimKiem.baitap;
import java.util.LinkedList;
import java.util.Scanner;
public class FindString {
    public static String findString(String str){
        LinkedList<Character> maxList = new LinkedList<>();
        for (int i = 0; i < str.length(); i++){
            LinkedList<Character> childList = new LinkedList<>();
            childList.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++){
                if (str.charAt(j) > childList.getLast()){
                    childList.add(str.charAt(j));
                }
            }
            if(childList.size() > maxList.size()){
                maxList.clear();
                maxList.addAll(childList);
            }
            childList.clear();
        }
        StringBuilder strBuilder = new StringBuilder();
        for (Character c: maxList){
            strBuilder.append(c);
        }
        return str = strBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = sc.nextLine();
        String findHeight = findString(str);
        System.out.println(findHeight);
    }
}
