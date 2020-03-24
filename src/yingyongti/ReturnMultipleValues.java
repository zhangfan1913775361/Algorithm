package yingyongti;
/**
 * 总结:动态数组，集合，封装对象，引用传递
 * 参考文献:https://www.cnblogs.com/zj0208/p/6207077.html
 */

import java.util.HashMap;
import java.util.Map;

public class ReturnMultipleValues {
    public static void main(String[] args) {
        int[] result = calclute(10,20,30);//这一步让方法初始化了，其实也就是调用了。

        System.out.println(result.toString());//与上一句效果相同,这里是数组类型，输出要转换为string
        System.out.println("result为"+result[0]);//返回该地址真正的值。

        ReturnMultipleValues t = new ReturnMultipleValues();
        int [] arr = {1,2,3,4,5,6};
        Map<String,Integer> map = t.test2(arr);

        System.out.println(t.test2(arr));//输出集合形式(格式像数学上的集合)
        System.out.println("min:"+map.get("min"));//逐个输出
        System.out.println("max:"+map.get("max"));



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
        //用动态数组   就是new一个数组，逐个初始化！！！相加几个参数就加几个！！！所以是动态的。最后return array;
        int [] array = new int[2];
        array[0] = sum;
        array[1] = ave;
        System.out.println("Calclute方法内部数组的是："+array.toString()+"它乱码因为获取的是地址值");
        return array;
    }

    /**
     * 法二：用集合
     */
    public Map<String,Integer> test2(int[] arr){
        Map<String,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;//即-2^31
        int min = Integer.MAX_VALUE;//即2^31-1
        for (int anArr : arr) { //该格式是新的for循环模式，anArr就是arr[i]
            if (anArr > max) {
                max = anArr;
            }
            if (anArr < min) {
                min = anArr;
            }
        }
        map.put("max",max);
        map.put("min",min);
        return map;
    }


}
