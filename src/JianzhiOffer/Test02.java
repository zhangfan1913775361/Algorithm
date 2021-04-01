package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/16 21:51
 * @Description: 替换空格
 * We Are Happy
 * We%20Are%20Happy
 */
public class Test02 {
    private static String change(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "We Are Happy";
        System.out.println(change(s));
    }
}
