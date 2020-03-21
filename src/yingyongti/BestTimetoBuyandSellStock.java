package yingyongti;
/*
股票买卖
输入描述：一个浮点数数组，长度为N，都是增长率。  [-1.2 1.4 1.5 -1 1.3 1.3 -1.3 -1.2]
输出描述：索引值表示时间。分别为买入索引（算在收益中），卖出索引（不算在收益中），以及收益值 [1,6,XX]

 */

/**
以下版本是输入是交易值，不等同于上面的增长率。
 */

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        double [] n = new double[]{-1.2,1.4,1.5,-1,1.3,1.3,-1.3,-1.2};//定义一个浮点型数组
        System.out.println(BestTimetoBuyandSellStock.maxProfit(n));//用"类.方法名"，直接调用方法。
    }
    public static double maxProfit(double[] prices){
        double min = prices[0];
        double profit = 0;
        for (int i = 1;i<prices.length;i++){
            if (min > prices[i]){
                min = prices[i];
            }else {
                if (profit < prices[i] - min){
                    profit = prices[i] - min;
                }
            }
        }
        return profit;
    }
}
