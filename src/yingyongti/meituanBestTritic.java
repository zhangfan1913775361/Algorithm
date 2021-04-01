package yingyongti;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 商品分为A类和B类，如果买东西里有A类，则最买的便宜的一件打半折，如果没有A类只有B类，则不打折
 *  第一行  n k，表示个商品，k个人。
 *  剩下每行前面为价格，后面为1或2，即A类或B类商品
 *  输入：
 * 5 2
 * 10 1
 * 2 2
 * 5 2
 * 8 1
 * 9 1
 *
 * 输出：
 * 28.00
 * 样例解释：
 * 第一个人只买第一个物品，第二个人买剩下的物品。
 * 第一个人由于买了A类物品，最便宜的物品半价，付款5元
 * 第二个人由于也买了A类物品，最便宜的物品半价，付款23元（物品二半价）
 * （买法不唯一）
 */

public class meituanBestTritic {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        int a = sc.nextInt();
        int b = sc.nextInt();//a b是两个几个的元素个数。
        Set<Integer> setA = new HashSet<>();
        for (int i = 0; i < a; i++) {
            setA.add(sc.nextInt());//将第一组加入setA中
        }
        for (int j = 0; j < b; j++) {//加入同一个setA中
            setA.add(sc.nextInt());
        }

    }
}

}
