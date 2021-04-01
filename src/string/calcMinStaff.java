package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class calcMinStaff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[2][res];

        // 用set存下所有的前后临界时间点
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < res; i++) {
            String str = sc.nextLine();
            String[] strings = str.split(",");
            arr[0][i] = Integer.parseInt(strings[0]);
            arr[1][i] = Integer.parseInt(strings[1]);
            set.add(arr[0][i]);
            set.add(arr[1][i]);
        }
        System.out.println(calcMinStaff(arr, set));
    }
    private static int calcMinStaff(int[][] arr, Set<Integer> set) {
        int count = 0, tmp = 0;
        // 计算每个临界时间点分别需要多少人，存下最大人数需求
        for (Integer i : set) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i >= arr[0][j] && i < arr[1][j]) tmp++;
            }
            count = Math.max(count, tmp);
            tmp = 0;
        }
        return count;
    }
}
