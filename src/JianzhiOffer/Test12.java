package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/17 15:21
 * @Description: 求数值的整数次方
 * base为double类型，exp为int类型。求base的exp次方
 * 而且base和exp不能同时为0
 * 2，3  -> 8.00000
 */
public class Test12 {
    private static double ming(double base, int exp) {
        /**
         * n =0 ,返回 1
         * n < 0,返回 1/x的(-n)次方
         */
        if (exp == 0) {
            return 1;
        }
        if (exp < 0) {
            return 1 / (base * ming(base, -exp - 1));
        }
        //指数为奇数
        if (exp > 0 && exp % 2 == 1) {
            return base * ming(base, exp - 1);
            //指数为偶数
        } else if (exp > 0 && exp % 2 == 0) {
            return ming(base * base, exp / 2);
        }
        return -1;


    }

    public static void main(String[] args) {
        System.out.println(ming(0.00001, 2147483647));

    }
}
