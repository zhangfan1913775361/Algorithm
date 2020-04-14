package yingyongti;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 完美世界笔试题，多人坐船问题。一群人去坐船，每人的体重是weight[i]
 * 每艘船载重为limit，每艘船最多载2人，问最少需要几艘船（每个人都要被船载）
 * 输入：第一行是每个人的体重，第二行是船的最大负载limit。输出：船只数
 * 输入：
 * 80 90
 * 100
 * 输出：
 * 2
 */

/**
 * 思路，先排序，最次让最重的一名先上船，要不他一个人一艘船，要不和最轻的人一艘船。有贪心算法的思想。
 *
 * 在牛客网上，每次都是数组越界的问题！！！！因为这个才提交失败。
 */

public class countLeastBoat {
    public static int countLeastBoat(int[] weights,int maxLoad){
        Arrays.sort(weights);
        int i = 0,j = weights.length - 1;
        int ans = 0;
        while (i <= j){
            ans++;
            if (weights[i] + weights[j] <= maxLoad)
                i++;
            j--;
        }
        return ans;
    }

    public static void main(String[] args)  {
        Scanner br = new Scanner(System.in);
        String s = br.nextLine();
        String[] str1 = s.split(" ");
        int[] weights = new int[str1.length];
        for (int i = 0;i<str1.length;i++){
            weights[i] = Integer.parseInt(str1[i]);
        }
        int maxLoad = Integer.parseInt(br.nextLine());
        System.out.println(countLeastBoat(weights,maxLoad));
    }
}
