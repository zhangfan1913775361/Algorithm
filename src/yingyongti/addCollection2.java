package yingyongti;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 本题要注意的是hashset格式的输出，要转化为int数组，不然输出会乱码
 */

public class addCollection2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            HashSet<Integer> hs1 = new HashSet<Integer>();
            for(int i = 0; i < n; i++){
                hs1.add(in.nextInt());
            }
            for(int i = 0; i < m; i++){
                hs1.add(in.nextInt());
            }

            Object[] arr = hs1.toArray();//将该hashset类型转为object数组
            int[] array = new int[arr.length];//构造一个相同长度的int空数组
            for(int i = 0; i < array.length; i++){
                array[i] = (int) arr[i];//将Object数组强转为int数组！！！！！
            }
            Arrays.sort(array);
            for(int i = 0; i < array.length;i++){
                System.out.print(array[i]+ " ");
            }
        }


    }
}
