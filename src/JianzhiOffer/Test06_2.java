package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/17 11:34
 * @Description: 有重复数字升序数组，旋转后，找出最小值
 * 如 [2,3,4,5,6,7,1,2]  输出1
 * 【2,2,2,2,2,2,0,1】 输出0
 */
public class Test06_2 {
    private static int find(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int low = 0, high = arr.length - 1;
        while (low < high) {
            if (arr[low] < arr[high]) {
                return arr[low];
            }
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[0]) {
                low = mid + 1;
            } else if (arr[mid] < arr[0]) {
                high = mid;
            } else {
                low += 1;
            }
        }
        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 1, 2};
        int[] arr1 = {1, 1, 1, 1, 1, 1, 0, 1};
        int[] arr2 = {10, 1, 10, 10, 10};
        System.out.println(find(arr2));
    }
}
