package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/17 14:05
 * @Description: 青蛙跳台阶，第n级有多少种跳法
 * 0，1级，都是1种，2级有2种，3级有3种，n级有f(n-1)+f(n-2)种
 * 0:1
 * 1:1
 * 2:2
 * 3:3
 * 4:5
 * 5:8
 * 6:13
 */
public class Test08 {
    public static int jumpFloor(int target) {
        if (target == 0 || target == 1) {
            return 1;
        }
        if (target > 1) {
            return (jumpFloor(target - 1) + jumpFloor(target - 2));
        }
        return 0;
    }

    public static int jumpFloor2(int target) {
        if (target == 0 || target == 1) {
            return 1;
        }
        int p = 1, q = 1, res = 0;
        for (int i = 2; i <= target; i++) {
            res = p + q;
            p = q;
            q = res;
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(jumpFloor(6));
        System.out.println(jumpFloor2(6));

    }
}
