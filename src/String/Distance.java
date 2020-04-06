package String;

import java.util.Scanner;
/**
 * 本题为动态规划的经典题：两单词的距离。
 */
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dic = new String[]{"surprise","happy","ctrip","travel","wellcome","student","system","program","editor"};
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(convert(str, dic));
        }
    }
    private static String convert(String str, String[] dic) {
        for (String word : dic) {//dic是要遍历的list，word是赋值的变量。
            if (distance(str, word) <= 2) return word;
        }
        return "null";
    }


    /**
     * 左程云版标准答案
     * @param word1
     * @param word2
     * @return 修改次数
     */
    public static int distance(String word1,String word2){
        int len1 = word1.length(),len2 = word2.length();
        int[][] dp = new int [len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) dp[i][0] = i;//第一列都是插入，代价为插入的次数i
        for (int j = 0; j <= len2; j++) dp[0][j] = j;//第一行都是插入，代价也是j

        for (int i = 1;i <=len1;i++){
            for (int j = 1;j <= len2;j++){
                if (word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
                }

            }
        }
        return dp[len1][len2];
    }


}
