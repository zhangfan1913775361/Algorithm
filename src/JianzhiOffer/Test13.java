package JianzhiOffer;

import java.util.Arrays;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/18 11:06
 * @Description: 将数组的奇数都放到偶数的前面。
 * 如果奇数和偶数的相对顺序不能变(可用StringBuilder)，
 * 如果数字可能为2位数，可用首尾指针。和快排很像
 * 输入【1,2,3,4,5,6】
 * 输出【1，3，5，2，4，6】
 */
public class Test13 {
    //双指针，从两边到中
    private static int[] change(int[] nums) {
        int left = 0, right = nums.length - 1;
        int temp;
        while (left < right) {
            if (left < right && (nums[left] & 1) != 0) {
                left++;
            }
            if (left < right && (nums[right] & 1) != 1) {
                right--;
            }
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }

    public static int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while (i < j) {
            while (i < j && (nums[i] & 1) == 1) i++;
            while (i < j && (nums[j] & 1) == 0) j--;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(exchange(arr)));
    }


}
