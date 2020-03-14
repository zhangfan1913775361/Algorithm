package String;

import java.util.Scanner;

/**
 * 统计字母在字符串中的数目
 * 要求:第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。输出出现的次数
 * 输入：ABCDEF
 * A
 * 输出：1
 */

public class ChaNumInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String all = "";
        String one = "";
        char[] ac;
//        char temp;
        int num = 0;

        while (sc.hasNext()){
            all = sc.nextLine();
            one = sc.nextLine();
            ac = all.toCharArray();//字符串转化为数组
//            temp存储需要的字符
//            temp = one.charAt(0);
            for (int i = 0;i<ac.length;i++){
                if (one.equalsIgnoreCase(String.valueOf(ac[i]))){
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
