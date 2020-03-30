package String;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class QuchongString {
    public static void main(String[] args) {
        System.out.println(getUniqueStrCount("ABCABCA"));
//        Quchong1();
    }
    public static void Quchong1(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character,Integer> map = new HashMap<>();//本题用的是hashmap的自带函数，每次用containsMap去验证指定位置的值
        for (int i = 0;i<str.length();i++){// 指定位置使用str的charAt(i)方法。
            if (!map.containsKey(str.charAt(i))){//map里不存在这个字符，就隔行输出，并加入map中。
                System.out.println(str.charAt(i));
                map.put(str.charAt(i),1);
            }
        }
    }
    /**
     * 字符串去重后的个数
     * @param str
     * @return
     */
    public static int getUniqueStrCount(String str) {
        char[] chars = str.toCharArray();
        HashSet<String> set = new HashSet<String>();
        for(char ch : chars) {
            set.add(String.valueOf(ch));//用valueof把数组放进set中，hashset自动去重。返回size即可。
        }
        return set.size();
    }
}
