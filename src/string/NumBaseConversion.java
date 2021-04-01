package string;

import java.util.Scanner;

/**
 * 进制转换   输入一个十六进制的数值字符串，输出10进制
 * 输入:0xA
 * 输出：10
 *
 * 总结：输入0xAB,则反转加截取，获得BA，然后用ascii码计算11*16^0+10*16^1=171
 *
 */

public class NumBaseConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            StringBuilder sb=new StringBuilder();//单线程使用stringBuilder更快
            sb.append(sc.next());
//            string str=sc.next();
            String str=sb.reverse().substring(0,sb.length()-2);//巧用stringBuilder里的reverse方法与substring（截取方法）
            System.out.println(str);//0xABC->CBA
            char ch[]=str.toCharArray();//string类型转成char
            int sum=0;
            for(int i=0;i<ch.length;i++){
                if(ch[i]>='A'&&ch[i]<='F'){
                    sum+=(Integer.valueOf(ch[i])-55)*Math.pow(16,i);//A为65，B为66
                }else {
                    sum+=(Integer.valueOf(ch[i])-48)*Math.pow(16,i);
                }//Integer.valueOf()方法，可以返回字符的十进制ascii码
            }//pow(底数,指数)
            System.out.println(sum);
            // System.out.println(Integer.valueOf('6'));
        }
    }
}


