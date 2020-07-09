package yingyongti;

/**
 * Created by zhangfan 2020/7/9
 */
public class Nfactorial {
    //遍历方法
    public static int nfactorial(int n){
        int tmp = 1;
        for (int i = n;i>0;i--){
            tmp = tmp * i;
        }
        return tmp;

    }
    //递归方法
    public static int nnfactorial2(int n){
        int tmp2 = 1;
        if (n > 0){
            tmp2 = n * nnfactorial2(n-1);
        }
        return tmp2;
//        if (n == 0 || n == 1){
//            return n;
//        }else {
//            return n*nnfactorial2(n-1);
//        }
    }
    public static void main(String[] args) {
//        System.out.println(nfactorial(5));
        System.out.println(nnfactorial2(5));

    }
}
