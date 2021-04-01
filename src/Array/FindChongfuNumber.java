//package Array;
//
//import java.util.Hashtable;
//
///**
// * Created by zhangfan 2020/6/13
// * 查找链表里重复数字
// */
//public class FindChongfuNumber {
//    public static void main(string[] args) {
//        int [] num = {4,3,2,7,8,5,1};
//        System.out.println(duplicate(num,num.length,num));
//
//    }
//
//    public static boolean duplicate(int numbers[],int length,int[] duplication){
//        if (numbers == null ||length <= 0)
//            return null;
//        Hashtable<Integer,Integer> table = new Hashtable<Integer, Integer>();
//        for (int i = 0;i<length;i++){
//            if (table.containsKey(numbers[i])){
//                duplication[0] = numbers[i];
//                return true;
//            }else {
//                table.put(numbers[i],1);
//            }
//        }
//        return false;
//    }
//}
