package string;

public class longestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence2("1234","234"));
    }

    /**
     * 自己写的答案，数组越界导致错误，不能使用。
     * @param text1
     * @param text2
     * @return
     */
    public static int longestCommonSubsequence(String text1, String text2) {

        //1.先定义长度
        int len1 = text1.length(), len2 = text2.length();
        int result = 0;

        //2.定义dp，(len1+1)*(len2+1)
        int[][] dp = new int[len1 + 1][len2 + 1];

        //3.给第一列或第一行赋初始值
        for (int i = 0; i < len1; i++) {
            if (text1.charAt(i)==text2.charAt(0)){
                dp[i][0] = 1;
                //该for循环可优化
                for (;i<len1+1;i++){
                    dp[i][0] = 1;
                }
            }
        }
        for (int j = 0; j < len2; j++){
            if (text1.charAt(0) == text2.charAt(j)){
                dp[0][j] = 1;
                for (;j<len2+1;j++){
                    dp[0][j] = 1;
                }
            }
        }

        for (int i = 0;i<len1+1;i++){
            for(int j = 0;j < i;j++){
                if (text1.charAt(i) == text2.charAt(j)){
                     result = dp[i-1][j-1]+1;
                }else {
                    result =  Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return result;
    }

    /**
     * 该解法省去了第一行和第一列的初始化。为什么要做成（len+1）*(len2+1)的矩阵，现在还不清楚。
     * @param text1
     * @param text2
     * @return
     */
    public static int longestCommonSubsequence2(String text1,String text2){
        //定义长度和dp
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];//
        //
        for (int i = 1; i <= text1.length(); i++) {

            for (int j = 1; j <= text2.length(); j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[text1.length()][text2.length()];

    }
}