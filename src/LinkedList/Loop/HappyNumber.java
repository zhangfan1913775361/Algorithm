package LinkedList.Loop;

/**
 * Created by zhangfan 2020/7/20
 */
public class HappyNumber {
    //本题难点在于怎么获得每位平方和
    //本方法不能停止，易造成死循环
    @Deprecated
    public static boolean isHappy(int n) {
        int ans = 0;
        while(n != 1){
            ans +=(n%10)*(n%10);
            n = n/10;
        }
        return true;

    }
    public static boolean isHappy2(int n) {
        int slow = n, fast = n;
        while (true) {
            slow = findNext(slow);
            fast = findNext(fast);
            fast = findNext(fast);
            if (slow == fast) break;
        }
        return slow == 1;
    }
    static int findNext(int n) {
        int res = 0;
        while (n > 0) {
            res += (n % 10) * (n % 10);
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(isHappy2(5));
    }
}
