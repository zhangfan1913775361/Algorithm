package yingyongti;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 笔试题，集合相加  给你两个集合，要求 {A} + {B}。注：同一个集合中不会有两个相同的元素。
 *
 * 输入:多组（不超过 5 组）数据。每组输入数据分为三行，第一行有两个数字 n,m($0＜n,m\leq10000$)，
 * 分别表示集合 A 和集合 B 的元素个数。后两行分别表示集合 A 和集合 B。每个元素为不超出 int 范围的整数，每个元素之间有一个空格隔开。
 *
 * 输出:针对每组数据输出一行数据，表示合并后的集合，要求从小到大输出，每个元素之间有一个空格隔开。
 *
 * 样例输入
 * 1 2
 * 1
 * 2 3
 * 1 2
 * 1
 * 1 2
 *
 * 样例输出
 * 1 2 3
 * 1 2
 */

public class addCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();//a b是两个几个的元素个数。
            Set<Integer> setA = new HashSet<>();
            for (int i = 0; i < a; i++) {
                setA.add(sc.nextInt());//将第一组加入setA中
            }
            for (int j = 0; j < b; j++) {//加入同一个setA中
                setA.add(sc.nextInt());
            }
            for (Integer i : setA) {//这个非常巧妙，将set类型转为int输出
                System.out.print(i + " ");
            }
        }
    }
}
