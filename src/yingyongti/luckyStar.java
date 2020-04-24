package yingyongti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 幸运星
 * 每个星星都有坐标，如果它的正上下左右都有星星，则它就是幸运星，现在给出n组星星的坐标，求幸运星的个数
 * 输入：（第一行n即星星的个数，其余n行为坐标）
 * 8
 * 0 0
 * 0 1
 * 0 2
 * 0 3
 * 1 1
 * 1 2
 * -1 1
 * -1 2
 *
 * 输出：（幸运星的个数）
 * 2
 */

public class luckyStar {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (sc.hasNext()){
            int a =sc.nextInt();
            int [][]nums = new int [a][2];
            for (int i = 0;i<a;i++){
                for (int j = 0;j<2;j++){
                    nums[i][j] = sc.nextInt();
                }
            }
            List<int[]> list = new ArrayList<int[]>();

        for (int i = 0; i < a; i++) {
            int x = nums[i][0];
            int y = nums[i][1];
            boolean xFlag1 = false;
            boolean xFlag2 = false;
            boolean yFlag1 = false;
            boolean yFlag2 = false;

            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if (nums[j][0] == x) {
                        if (nums[j][1] > y) {
                            yFlag1 = true;
                        } else if (nums[j][1] < y) {
                            yFlag2 = true;
                        }
                    }

                    if (nums[j][1] == y) {
                        if (nums[j][0] > x) {
                            xFlag1 = true;
                        } else if (nums[j][0] < x) {
                            xFlag2 = true;
                        }
                    }
                }
            }

            if (xFlag1 && xFlag2 && yFlag1 && yFlag2) {
                list.add(nums[i]);
            }

        }
            System.out.println(list.size());
    }
}
}
