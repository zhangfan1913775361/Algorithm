package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/16 21:07
 * @Description: 二维数组的查找
 */
public class Test01 {
    private static Boolean find(int target, int[][] array) {
        if (array == null || target == ' ' || array.length == 0 || (array.length != 0 && array[0].length == 0)) {
            return false;
        }
        //m行,n列
        int m = array.length;
        int n = array[0].length;
        //从第0行，第n-1列开始扫描
        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(find(16, arr));
    }
}
