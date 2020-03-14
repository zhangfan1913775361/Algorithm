package String;

import java.util.Scanner;

/**
 * 字符串最后一个单词的长度，单词以空格隔开
 * 输入：hello world
 * 输出 5
 */

public class LastWordLength {
    public static int lengthOgLast(String str){
        String [] s = str.split(" ");
        return s[s.length-1].length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println(lengthOgLast(str));
        }

    }
}
