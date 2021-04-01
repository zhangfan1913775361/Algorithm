package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/17 10:43
 * @Description: 某个升序的数组(元素各不相同)，在某个点上进行的旋转，请找出这个数组的最小值
 * 输入：nums = [3,4,5,1,2]
 * 输出 1
 */
public class Test06 {
    private static int find(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int low = 0, high = nums.length - 1;
        if (nums[high] > nums[0]) {
            return nums[0];
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            //下面是2个终止条件
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            //用第一个值考虑，如果中间值大于第一个值，则变化点在中间值右边
//            如果中间值小于第一个值，那么变化点在中间值左边

            if (nums[mid] > nums[0]) {
                low = mid + 1;
            } else if (nums[mid] < nums[0]) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 1, 2};
        System.out.println(find(arr));
    }
}
