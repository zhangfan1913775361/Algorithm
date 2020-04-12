package String;

import java.util.Stack;

/**
 * 快手笔试题，“括号配对！！”统计括号出现的对数，输入一个数字字幕括号字符串“1*2+(3+3)))(((”
 * 输出 1 3 2 即1对配对括号，3个未配对左括号，2个未配对由括号
 */

public class KuoHaoPeidui {
    public static void main(String[] args) {
        String str = "1*2+(3+3)))(((";
        int x = 0,y=0,count = 0;
        Stack<String> stack1 = new Stack<String>();
        for (int i = 0;i<str.length();i++){
            String getstr = str.substring(i,i+1);
            if (getstr.equals("(")){
                stack1.push("(");
            }else if (getstr.equals(")")){
                if (stack1.isEmpty()){
                    y++;
                }else {
                    stack1.pop();
                    count++;
                }
            }
            x=stack1.size();
        }
        System.out.println(count+" "+x+" "+y);
    }
}


