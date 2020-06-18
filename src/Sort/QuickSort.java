package Sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {8,3,2,5,4,7,6,1};
        int low = 0;
        int high = arr.length - 1;
        System.out.println(qsort(arr,low,high));
    }
    private static String qsort(int[] arr,int low,int high){
        if(low < high){
            int pivot = partition(arr, low, high);
            qsort(arr,low,pivot-1);
            qsort(arr,pivot+1,high);
        }
        return Arrays.toString(arr);//数组转化为string。
//        return arr.toString();//只把arr地址给string化了。
    }
    //这个方法是计算基准值pivot的，其实就是个index值
    private static int partition(int[] arr,int low,int high){
        int baseVal = arr[high];
        while (low < high){
            while (low < high && arr[low] < baseVal){
                low++;
            }
            arr[high] = arr[low];//如果此时arr[low]>=baseVal,就要把arr[low]挖走，赋到当前的index上，即arr[high]
            while (low < high && arr[high] > baseVal){
                high--;
            }
            arr[low] = arr[high];
        }
        arr[low] = baseVal;//被选取的基准值放在中间。
        return low;

    }
}
