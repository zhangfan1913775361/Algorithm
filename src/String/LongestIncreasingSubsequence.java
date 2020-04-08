package String;

/**
 * LIS Longest Increasing Subsequence最长上升子序列
 * 这是一道动态规划的经典题
 */

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int [] a = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthofLIS(a));
    }
    public static int lengthofLIS(int[] nums){
        //1.定义长度
        int len = nums.length;
        if (len < 2)
            return len;
        //2.定义dp
        int [] dp = new int[len];
//        Array.set(dp,0,1);本句只能赋给第一个值，哎~~~
        //dp[i]统一赋初始值1，应该还有其他解法。

        //3.定义初始值
        for (int i = 0;i<dp.length;i++){
            dp[i] = 1;
        }
        //下面这个循环很关键，首先定义每个dp[i]都是1，将dp[i]与前面的dp[j]比较，
        // 如果前面dp有比自己小的，则将dp[j]+1与自己比较，取较大值、

        //4.for循环嵌套，比较获取最大值。
        for (int i = 1;i < len;i++){
            for (int j = 0;j<i;j++){
                if (nums[j] < nums[i])
                    dp[i] = Math.max(dp[j]+1,dp[i]);
            }
        }
        int res = dp[0];
        for (int i = 0;i < len;i++){
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
