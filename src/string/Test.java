package string;

import java.security.interfaces.RSAKey;
import java.sql.SQLOutput;
import java.util.HashSet;

/**
 * Created by zhangfan 2020/10/11
 * 例如 waabc，最后输出3
 */
public class Test {
    //滑动窗口法：比如字符串aabbcddq，最后最长为bcd，结果输出为3
    //主要原因是不能重复，比如先从a开始，aa重复，遂舍弃，从第二个a开始。

    /*
    从第二个a开始后，ab，未重复，然后abb，不行，所以目前长度为2，暂存。
    从第二个b开始。bc，可以，暂存2；bcd，可以，暂存3；bcdd，不行。遂舍弃，从第二个d开始，dq，结束了
   最终返回最大长度3。所以每次在集合中要删除之前的所有字符，并且暂存当前已有的最大长度。
     */

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet();
        int n = s.length();
        int ans = 0;
        for (int i = 0;i<n;i++){
            for (int rt = i+1;rt < n; rt++){
                if(!set.contains(s.charAt(rt))){
                    set.add(s.charAt(i));
                    ++ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aabbcddq"));
    }
}
