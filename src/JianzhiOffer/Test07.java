package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/17 13:57
 * @Description: 斐波那契数列
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * 输入4，输出3
 */
public class Test07 {
    private static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
}
