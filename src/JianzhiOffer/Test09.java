package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/17 14:49
 * @Description: 变态跳台阶，一次可跳1，2，甚至n级，请问它跳到n级台阶，有多少种跳法？可用贪心做
 * 0:1,1:1,2:2,3:4,4:8.
 * 有数学公式，f(n) =f(n-1)+f(n-2)+...+f(2)+f(1)+f(0);
 * f(n-1) = f(n-2)+...+f(2)+f(1);
 * 所以，f(n) = 2f(n-1)
 */
public class Test09 {
    private static int jump(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 1 || n == 0) {
            return 1;
        } else {
            return 2 * jump(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(jump(5));
    }
}
