package Array;

public class FindTwoArrayValue {
    public static boolean find(int[][] matrix,int number){
        //输入条件判断
        if (matrix == null || matrix.length < 1||matrix[0].length<=1){
            return false;
        }
        int rows = matrix.length;//总行数
        int cols = matrix[0].length;//总列数
        int row = 0;//开始的行数
        int col = cols - 1;
        //开始查找
        while (col>=0 && col <= cols && row >= 0 && row <= rows){
            if (number == matrix[row][col]){
                return true;
            }else if (matrix[row][col] < number){
                row++;
            }else if (matrix[row][col] > number){
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(find(matrix,5));
        System.out.println(find(matrix, 10));    // 要查找的数不在数组中//
//        System.out.println(find(matrix, 1));    // 要查找的数是数组中最小的数字
//        System.out.println(find(matrix, 9));   // 要查找的数是数组中最大的数字
//        System.out.println(find(matrix, 0));    // 要查找的数比数组中最小的数字还小
//        System.out.println(find(matrix, 11));   // 要查找的数比数组中最大的数字还大
//        System.out.println(find(null, 16));     // 健壮性测试，输入空指针
    }
}
