package string;

import java.util.Scanner;

/**
 * 输入一行数字，每三个用逗号隔开
 */
public class ThreeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            while (s.length()>=3){
                System.out.println(s.substring(0,3)+",");
                s = s.substring(3);
            }
        }
    }
}
