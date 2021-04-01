package JianzhiOffer;

/**
 * Demo class
 *
 * @author 张凡
 * @date 2021/3/17
 * 剪绳子 长度为n的绳子，剪成m段，每段的长度乘积最大值是多少？
 */
public class Test67 {
    public static int cutRope(int target) {
        int[] dp = new int[target + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= target; i++) {
            // 下列循环是为了求 dp[i] 多大 所以每次得出一次 tempMAXJ 都得和dp[i] 比较一次，直到找到 dp[i] 最大值
            for (int j = 2; j < i; j++) {
                int tempMAXJ = Math.max((i - j) * j, j * dp[i - j]); // 当前 剪了 j 的时候较大值 j 可以去2 、3 、4。。。每剪一次就有一种乘积的可能
                dp[i] = Math.max(tempMAXJ, dp[i]);
            }
        }
        return dp[target];

    }

    public static void main(String[] args) {
        System.out.println(cutRope(3));
    }
}
