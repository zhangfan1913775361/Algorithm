package yingyongti;


import java.util.HashMap;
import java.util.Map;

public class ReturnMultipleValues {
    public static void main(String[] args) {
//        int[] result = calclute(10,20,30);
//        System.out.println(result);//乱码因为获取的是地址值
//        System.out.println(result[0]);
        ReturnMultipleValues t = new ReturnMultipleValues();
        int [] arr = {1,2,3,4,5,6};
        Map<String,Integer> map = t.test2(arr);
        System.out.println("max:"+map.get("max"));
        System.out.println("min:"+map.get("min"));



    }
    /**
     * 一个方法可以有0,1或者多个参数，但是返回值只能有0或者1个返回值，不能有多个返回值
     * 但是如果希望有多个返回值，应该怎么办？
     * 答：使用数组作为返回值类型即可
     * 任何数据类型都可以作为方法的参数类型，或者返回值类型
     * 数组作为方法的参数，传递进去的其实就是数组的地址值
     * 数组作为方法的返回值，返回的其实也是数组的地址值
     */
    public static int[] calclute(int a,int b,int c){//法一：用数组作为返回值
        int sum = a+b+c;
        int ave = sum/3;
        //用静态数组
//        int [] array = new int [] {sum,ave};
        //用动态数组
        int [] array = new int[2];
        array[0] = sum;
        array[1] = ave;
        System.out.println("Calclute方法内部数组的是："+array+"它乱码因为获取的是地址值");
        return array;
    }

    /**
     * 法二：用数组
     */
    public Map<String,Integer> test2(int[] arr){
        Map<String,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        map.put("max",max);
        map.put("min",min);
        return map;
    }

}
