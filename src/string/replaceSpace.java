package string;

public class replaceSpace {

    //最简单的做法,定义一个新的StringBuilder，之前的sb如果有空格，则加上“%20”，否则加上之前的str即可。
    private static String replaceSpace3(String str){
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i) == ' '){
                sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String replaceSpace(StringBuilder str){//我的算法题都是单线程，所以无脑用StringBuilder
        int spacenum = 0;//计算字符串的空格数
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i) == ' ')
                spacenum++;
        }

        int indexold = str.length()-1;//这个是末尾的地址，所以用长度减一
        int newlength = str.length()+spacenum*2;
        int indexnew = newlength-1;

        str.setLength(newlength);
        for (;indexold>=0 && indexold < newlength;--indexold){
            if (str.charAt(indexold) == ' '){
                str.setCharAt(indexnew--,'0');
                str.setCharAt(indexnew--,'2');
                str.setCharAt(indexnew--,'%');
            }else {
                str.setCharAt(indexnew--,str.charAt(indexold));
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("I am a Student.");
//        System.out.println(replaceSpace(sb));
//        StringBuilder sb1 = new StringBuilder("I am a Student");
        String s = "I am a Student";
        System.out.println(replaceSpace3(s));
//        replaceSpace3(s);
    }


    //定义一个stringBuilder变量，先变成string，再变成char[]。
    // 每次判断该字符数组的空格，则在新StringBuilder变量上append("%20")
    public static String replaceSpace2(StringBuilder str){
        String sti = str.toString();
        char[] strChar = sti.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<strChar.length;i++){
            if (strChar[i] == ' '){
                sb.append("%20");
            }else {
                sb.append(strChar[i]);
            }
        }
    return sb.toString();
    }
}
