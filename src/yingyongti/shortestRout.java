package yingyongti;

import java.util.Scanner;

/**
 * 单向图最短路径问题，解法：地接特斯拉，或弗洛伊德算法
 * 输入：
 0 1 12 -1 -1
 -1 0 9 3 -1
 -1 -1 0 -1 5
 -1 -1 4 0 13
 -1 -1 -1 -1 0

 输出
 1
 8
 4
 13
 */

public class shortestRout {

    public static void method (int[][] weightArray,String[] strArray){//第一个参数是权重，第二个参数是
        //空函数，还不知道怎么写
        //暂时的想法是地接特斯拉。不想写了，commit了。
        }

    public static void main(String[] args){
        int[][] weight = new int[6][];
        String[] pointsStr = {"V1","V2","V3","V4","V5"};
        Scanner input = new Scanner(System.in);
        for (int i = 0;i < pointsStr.length;i++){
            String[] valueStr = input.nextLine().split(" ");
            int[] values = new int[valueStr.length];
            for (int j = 0;j < valueStr.length;j++){
                values[j] = Integer.parseInt(valueStr[j]);
            }
            weight[i] = values;
        }
        input.close();
        method(weight,pointsStr);
    }

}
