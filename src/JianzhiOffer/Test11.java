package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/17 15:17
 * @Description: 给一个十进制，它的二进制上有几个1？
 * 用n&(n-1),可以把n的二进制中，最右边的1变为0，做多少轮，就有多少个1
 */
public class Test11 {
    private static int one(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(one(10));
    }
}
