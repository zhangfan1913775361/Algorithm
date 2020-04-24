package yingyongti;

import java.util.Scanner;


/**
 * 输入第一行包括一个整数n，代表序列a的长度
 *
 * 接下来一行n个数，空格隔开，代表序列a
 *
 * 1<=n<=100000,1<=ai<=106
 *
 * 输出n个数。
 *
 * 如果对于i个数，存在j∈[1,n]，使得ai,aj不相似，输出1,否则输出-1
 * 4
 * 3 5 6 1
 *
 * -1 -1 1 1
 * 样例解释：
 * 唯一一对不相似的数是6和1,故6和1的答案为1,其余为-1。
 * 大部分都是位与不为0，则相似，则输出1。也就是说，位与不为0，输出1，为0则输出-1。
 */

public class Like {
    //未全部通过，超时。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int [] b = new int [a];
            int [] c = new  int [a];
            for (int i = 0;i<a;i++){
                c[i] = -1;
            }
            for (int i = 0;i<a;i++){
                b[i] = sc.nextInt();
            }
            for (int i = 0;i< a;i++){
                for (int j = i+1;j<a;j++){
                    if (Integer.valueOf(b[i]&b[j]) == 0){
                        c[i] = 1;
                        c[j] = 1;
                    }

                }
                System.out.println(c[i]);
            }
        }
    }
}
