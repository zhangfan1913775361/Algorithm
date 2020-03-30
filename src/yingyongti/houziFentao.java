package yingyongti;
//海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子平均分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。
//第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？


/**
 * i 桃子的个数
 * j 猴子的只数
 *
 */

public class houziFentao {
    public static void main(String[] args) {
//        System.out.println(peach(10000, 5).get(0));
        int count = 5;
        for (int i = 0;i<10000;i++){
            int result = fentao(count,i);
            if (result == 1){
                System.out.println(i);
            }
        }
    }

    /**
     * 本方法把猴子分桃简化了，只要猴子分完即可。本题可以不用巧妙的数据结构，只要逻辑即可。
     * @param count
     * @param num
     * @return
     */
    private static int fentao(int count,int num){
        if (count == 0){//以猴子都分完为时间点，才算结束
            return 1;
        }
        if ((num-1)%5 != 0){
            return -1;
        }
        num = (num - 1)*4/5;
        return fentao(count-1,num);
    }
}

