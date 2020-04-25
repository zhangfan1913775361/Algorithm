package yingyongti;

import java.util.Scanner;

/**
 * 纳西索斯数（希腊神话的自恋狂），又名水仙花数。是自幂数的一种，n位数字每位的n次幂之和恰好等于它本身，叫做自幂数。
 * 其中，n=3时，又称作水仙花数，n=4时，叫做四叶玫瑰数……
 */
public class narcissus {
    public static void main(String[] agrs) {
        System.out.print("指定最大位数N:");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();
        for (int i = 3; i <= N; i++) {
            int a[] = new int[i];
            int num = (int) Math.pow(10, i - 1) + 1;
            System.out.print(i + "位的水仙花数有：\t");
            while (num <= Math.pow(10, i)) {
                int sum = 0;
                for (int j = 0; j < i; j++)
                    a[j] = (int) (num / Math.pow(10, j) % 10);
                for (int j = 0; j < i; j++)
                    sum = sum + (int) Math.pow(a[j], i);
                if (num == sum)
                    System.out.print(num + "\t");
                num++;
            }
            System.out.print("\n");
        }
    }
}
