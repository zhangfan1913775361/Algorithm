package string;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhangfan 2020/10/11
 * 无重复字符的最长连续子串
 * 如:"abcabcbb"，输出3，因为最长为“abc”，
 * 如:"bbbbb"，输出1，因为最长为"b"
 * 如:"pwwkew"输出3，最长为"wke",不是"pwke",因为这是子序列，可以不连续。而子串都是连续的。
 */
/**
 * Demo class
 *
 * @author 张凡
 * @date 2016/10/31
 */
public class LengthOfLongestSubstring {
    /**
     * 滑动窗口法
     */
    public static int lengthOfLongestSubstring(String s){
        Set<Character> occ = new HashSet<>();
        int n = s.length();
        //定义右指针rt
        int rk = -1,ans = 0;
        //i就是左指针,一共有n轮
        for (int i = 0;i < n;++i){
            //左指针每右移一次，则删除之前的字符
            if (i != 0){
                occ.remove(s.charAt(i-1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))){
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            ans = Math.max(ans, rk-i+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
