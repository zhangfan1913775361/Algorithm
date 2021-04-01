package string;

import java.util.Scanner;

/**
 * 另一种的大数加法
 * 牛客网上因为编译环境的问题，所以要特别注意输入的写法
 * 试题链接：https://www.nowcoder.com/questionTerminal/1ac1af77536b4917aedaac4746eeb808
 *
 *
 *
 */

public class LargeNumberCalculate2 {//笔试的时候，类名改为Main
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String a = sc.nextLine();
                String b = sc.nextLine();
                String res ="\""+ (Integer.parseInt(a.substring(1,a.length()-1))+Integer.parseInt(b.substring(1,b.length()-1)))+"\"";
                System.out.println(res);
            }
        }
}
