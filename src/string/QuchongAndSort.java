package string;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * 输入N个1到N内的随机整数(N<=1000),对这些随机数进行“去重并排序”输出。
 * 输入N+1行，最后一个是随机数的个数。
 * 输出排序后，数目可以小于N
 * 如：3
 * 2
 * 2
 * 1
 * 11
 * 10
 * 20
 * 40
 * 32
 * 67
 * 40
 * 20
 * 89
 * 300
 * 400
 * 15
 *
 * 输出：1
 * 2
 * 10
 * 15
 * 20
 * 32
 * 40
 * 67
 * 89
 * 300
 * 400
 *
 */


public class QuchongAndSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            TreeSet<Integer> set = new TreeSet<>();
            int n = scanner.nextInt();
            /**
             * 本地利用了TreeSet的特性，不能重复，按实际大小排序
             * 输入的次数i递增，只要与n相同，则判断输入完毕。但本题仅适用于给的示例，自测时常常失败
             */
            if (n>0){
                for (int i = 0;i<n;i++){
                    set.add(scanner.nextInt());
                }
            }
            for (Integer i :set){
                System.out.println(i);

            }
        }
    }

}
