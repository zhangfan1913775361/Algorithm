package Array;

import java.awt.font.NumericShaper;
import java.util.ArrayList;

/**
 * Created by zhangfan 2020/7/24
 * 一个无序数组，找出最小的第k个数
 * 1.集合，用有序数组。
 * 2.局部冒泡排序
 * 3.快排partition方法
 * 4.堆排序
 */
public class KthNum {
    public static void KthNumbyCollect(int[] num){
        ArrayList list = new ArrayList();
        for (int i = 0;i<num.length;i++) {
            list.add(num[i]);
        }
//        list.sort(num,0,num.length,);

    }}
