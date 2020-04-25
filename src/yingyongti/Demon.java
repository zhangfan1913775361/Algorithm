package yingyongti;

/**
 * 雷劈数。与水仙花数正好是相反的。水仙花数是“立方和等于自己”，雷劈数是“和的平方等于自己”
 * 印度数学家卡普列加（1905 - 1986）在一次旅行中，遇到猛烈的暴风雨，他看到路边一块牌子被劈成了两半，
 * 一半上写着30，另一半写着25。这时，他忽然发现30+25=55，55^2=3025
 *
 */

public class Demon {
    public boolean isDemon(long num) {

        //num1、num2是分出来的数
        long num1,num2,t_num;

        String ts = String.valueOf(num);//long转String，这样才能获取String的length值
        int length = ts.length();

        //负数
        if(ts.startsWith("-")) {
            return false;
        }

        //位数小于两位
        if(ts.length() < 2) {
            return false;
        }

        //奇数位
        if(length % 2 != 0) {
            return false;
        }

        num1 = Long.parseLong(ts.substring(0,length/2));
        num2 = Long.parseLong(ts.substring(length/2,length));

        t_num = num1 + num2;

        if(t_num * t_num == num) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        Demon d = new Demon();
        for(long i = 10; i < 999999999; i++) {
            if(d.isDemon(i)) {
                System.out.print(i+"  ");
            }
        }
    }
}
