package String;

import java.util.Scanner;

/**
 * 斐波那契数列
 *
 */

public class Fibonacci {
    public static int Fib(int n){
        int preNum=1;
        int prePreNum=0;
        int result=0;
        if(n==0 || n == 1)
            return n;
        for(int i=2;i<=n;i++){//这里是循环，不是递归，所以是O(1)的空间复杂度。如果用递归，则计算量太大。
            result=preNum+prePreNum;
            prePreNum=preNum;
            preNum=result;
        }
        return result;
    }
    public static int Fib2(int n){//这是递归，同时也是动态规划的最简单的做法。因为它在每次计算的时候，记住了之前的值。
//        if (n < 1){               // 把总的问题分解成子问题，所以算作动态规划。
//            return 0;
//        }
        if (n == 1 || n == 2){
            return n;
        }
        return Fib2(n-1) + Fib2(n-2);

    }
    public static int Fib3(int n){
        int f = 0,g = 1;
        for (;n>0;n--){
            g = g + f;
            f = g - f;
        }
        return f;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(Fib3(i));
    }
}
