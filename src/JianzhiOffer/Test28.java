package JianzhiOffer;

import java.util.Arrays;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/25 18:37
 * @Description:
 */
public class Test28 {
    public static int MoreThanHalfNum_Solution(int[] array) {
        if (array == null) {
            return 0;
        }
        int length = array.length;
        Arrays.sort(array);
        int res = array[length / 2];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == res) {
                count++;
            }
        }
        if (count > length / 2) {
            return res;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(MoreThanHalfNum_Solution(ints));

    }

}