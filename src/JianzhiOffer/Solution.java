package JianzhiOffer;

import java.util.*;


public class Solution {
    /**
     *
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public static int[] twoSum (int[] numbers, int target) {
        // write code here
        if(numbers == null || numbers.length == 0){
            return null;
        }
        int [] res = new int[2];

        for(int i = 0;i<numbers.length;i++){
            for(int j = i+1;j<numbers.length;j++){
                if(numbers[i] + numbers[j] == target){
                    res[0] = i+1;
                    res[1] = j+1;
                    return res;
                }
            }
        }
        return null;

    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
}