package String;

/**
 * 本题为动态规划经典题：最小矩阵路径和。因为路径需要相连，所以dp[i][j]=min{dp[i-1][j],dp[i][j-1]}+m[i][j];
 */

public class getMinPathSum {
    public static void main(String[] args) {
        //静态调用方式
//       int[][] a = {{1,4,5,6},{3,4,6,3},{3,4,6,3},{5,6,7,3}};
//       System.out.println(getMinPathSum(a));
        //非静态调用方式
        int [][] b = new int[][]{{1, 4, 5, 6}, {3, 4, 6, 3}, {3, 4, 6, 3}, {5, 6, 7, 3}};
        getMinPathSum a = new getMinPathSum();
        System.out.println(a.getMinPathSum(b));
        }
    public static int getMinPathSum(int nums[][]){
        if(nums == null || nums.length == 0 || nums[0] == null || nums[0].length == 0){
            return 0;
        }
        int row = nums.length;
        int col = nums[0].length;
        int [][]dp = new int[row][col];
        dp[0][0] = nums[0][0];
        for(int i = 1; i < row; i++){
            dp[i][0] = dp[i-1][0] + nums[i][0];
        }
        for(int j = 1; j < col; j++){
            dp[0][j] = dp[0][j-1] + nums[0][j];
        }
        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + nums[i][j];
            }
        }
        return dp[row-1][col-1];
    }
}
