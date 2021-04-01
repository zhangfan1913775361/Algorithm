package yingyongti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zhangfan 2020/6/26
 * 给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
 * 输入：[3,30,34,5,9]
 * 输出："9534330"
 */
public class SomeNumToMaxVal {
    public static void main(String[] args) {
        int [] num  = {9,50,6,2,10};
//        System.out.println(largestNumber(num));
        System.out.println(method(num));
    }

    public static String method(int nums[]){
        String temp;
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0;i<nums.length;i++){
            list.add(nums[i]);
        }
        System.out.println(list);

        //集合中进行排序，自定义比较器，（转换为字符串，较大的放后面）
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ((o1.toString()+o2.toString()).compareTo(o2.toString()+o1.toString())>0)
                    return 1;
                else return -1;
            }
        }
        );
        if(list.get(list.size()-1) == 0){
            return "0";
        }
        temp = "";
        //因为大的在后面，所以反向相加
        while(!list.isEmpty()){
            temp = temp + list.remove(list.size()-1) ;
        }
        return temp;
    }

    public static String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i< nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        });



        if (strNums[0].equals("0")) {
            return "0";
        }

        String str = "";
        for (int i = 0; i<strNums.length;i++) {
            str += strNums[i];
        }

        return str;
    }

}

