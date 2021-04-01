package string;

public class LeftReverse {
    public static void main(String[] args) {
        String str = "abcdefg";
        String str2 = "I am a Student.";
        System.out.println(LeftReverse(str,2));
        System.out.println(ReverseSentence(str2));

    }

    //左旋字符串
    public static String LeftReverse(String str, int n) {
        char[] chars = str.toCharArray();
        if(chars.length < n) return "";
        reverse(chars, 0, n-1);
        reverse(chars, n, chars.length-1);
        reverse(chars, 0, chars.length-1);
        StringBuilder sb = new StringBuilder(chars.length);
        for(char c:chars){
            sb.append(c);
        }
        return sb.toString();
    }

    //反转句子，以空格为间隔
    public static String ReverseSentence(String str) {
        char[] chars = str.toCharArray();
        reverse(chars,0,chars.length - 1);
        int blank = -1;
        for(int i = 0;i < chars.length;i++){
            if(chars[i] == ' '){
                int nextBlank = i;
                reverse(chars,blank + 1,nextBlank - 1);
                blank = nextBlank;
            }
        }
        reverse(chars,blank + 1,chars.length - 1);//最后一个单词单独进行反转
        return new String(chars);

    }


    public static void reverse(char[] chars,int low,int high){
        char temp;
        while(low<high){
            temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;
            low++;
            high--;
        }
    }
}
