package Array;

/**
 * 多多方块
 *
 */

public class DuoDuoFangKuai {
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1,3,3,3};
        System.out.println(test(8,1,nums));

    }
    public static int test(int N,int K,int[] nums){

        int max=0;//记录最长的颜色
        int count=0;//记录间隔
        int k=0;
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            j=i;
            k=i+1;
            count=0;
            int temp=1;
            while(k<nums.length){
                if(nums[j]==nums[k]){
                    temp++;
                    j=k;
                    k++;
                }else{
                    count++;
                    if(count<=K){
                        k++;
                    }else{
                        break;
                    }
                }
            }
            if(temp>max){
                max=temp;
            }
        }
        return max;
    }
}
