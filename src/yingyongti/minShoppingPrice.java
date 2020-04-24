package yingyongti;

import java.util.*;

/**
 * 小明去购物，买的时候价标和商品没对上，付款的时候才发现价标，求最小与最大价格。
 *
 * 样例输入
 * 5 3
 * 4 2 1 10 5
 * apple
 * orange
 * mango
 * 6 5
 * 3 5 1 6 8 1
 * peach
 * grapefruit
 * banana
 * orange
 * orange
 *
 * 样例输出
 * 7 19
 * 11 30
 *
 */

public class minShoppingPrice {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            ArrayList<Integer> price = new ArrayList<>();
            int goodsNum = 0, buyNum = 0;//定义两个数字分别为输入的2中值的数量
            HashMap<String, Integer> buyList = new HashMap<>();
            goodsNum = sc.nextInt();
            buyNum = sc.nextInt();
            for (int i = 0; i < goodsNum; i++)
            {
                price.add(sc.nextInt());
            }
            for (int i = 0; i < buyNum; i++)
            {
                String good = sc.next();
                if (buyList.containsKey(good))
                {
                    int count = buyList.get(good);
                    buyList.put(good, ++count);
                }
                else
                    buyList.put(good, 1);
            }
            int maxValue = 0;
            int minValue = 0;
            Collection collection = buyList.values();
            ArrayList<Integer> list = new ArrayList<>(collection);
            Collections.sort(list);
            Collections.sort(price);
            for (int i = 0; i < list.size(); i++)
            {
                minValue += list.get(list.size() - i - 1) * price.get(i);
                maxValue += list.get(list.size() - i - 1) * price.get(price.size() - i - 1);
            }
            System.out.printf(minValue + " " + maxValue + "\n");
        }
    }
}
