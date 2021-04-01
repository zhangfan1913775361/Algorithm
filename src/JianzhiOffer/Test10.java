package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/17 15:01
 * @Description: 矩形覆盖问题。也就是贴瓷砖问题，2*n的地区，贴2*1的瓷砖，有几种贴法,其实还是斐波那契数列
 * n=1时，1种
 * n=2，2，
 * n=3时，f(1)+f(2) =3
 * n=4时，f(2)+f(3)=5
 * n =5时,f(3)+f(4)=8
 */
public class Test10 {
    private static int ciZhuan(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        if (n > 2) {
            return ciZhuan(n - 1) + ciZhuan(n - 2);
        }
        return 0;
    }
}
