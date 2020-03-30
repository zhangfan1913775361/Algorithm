package String;

import java.util.Scanner;

/**
 * 字符串分组，每8个字符分一组，不足8位补0。
 * 输入两组：abc
 * 123456789
 * 输出
 * abc00000
 * 12345678
 * 90000000
 */

public class StringToGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
//            String s = new String(sc.nextLine());  这种转化为string，测试也可以通过。是另一张new对象的方法
        String s = sc.nextLine();
            if (s.length()%8 !=0)
                s= s + "00000000";
            while (s.length()>=8){
                System.out.println(s.substring(0,8));
                s=s.substring(8);
            }
        }
    }
}
/**
 * 如果题目改为，字符串每三位用逗号分隔，如 123544523->123,544,523,该怎么做呢？
 * 答：那就更简单了，三行代码：
 * while（s.length(）>=3){
 *     System.out.println(s.substring（0.3）+“，”)；
 *     s = s.substring（3）;
 * }
 *
 */
