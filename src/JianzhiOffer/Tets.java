package JianzhiOffer;

import java.util.Arrays;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/22 15:15
 * @Description:
 */
public class Tets {
    public static void main(String[] args) {
        int arr[] = {8, 7, 6, 5, 4, 3, 2, 1};
        int low = 0;
        int high = arr.length - 1;
        qsort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    private static void qsort(int[] arr, int low, int high) {
        if (low < high) {
            int position = partion(arr, low, high);
            qsort(arr, low, position - 1);
            qsort(arr, position + 1, high);
        }
    }

    private static int partion(int[] arr, int low, int high) {
        int baseVal = arr[high];
        while (low < high) {
            while (low < high && arr[low] < baseVal) {
                low++;
            }
            arr[high] = arr[low];//arr[low]比基准值小，则不管它，比基准值大，则赋给此时的arr[high]
            while (low < high && arr[high] >= baseVal) {
                high--;
            }
            arr[low] = arr[high];
        }
        arr[low] = baseVal;
        return low;
    }
}
