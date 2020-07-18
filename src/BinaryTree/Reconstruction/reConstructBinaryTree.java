package BinaryTree.Reconstruction;

import java.util.concurrent.CountDownLatch;

/**
 * 根据前序，中序，重建二叉树，返回根结点
 */



public class reConstructBinaryTree {
    private class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;
        BinaryTreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        int [] in ={4,7,2,1,5,3,8,6};
        int [] pre= {1,2,4,7,3,5,6,8};

        reConstructBinaryTree re = new reConstructBinaryTree();
        System.out.println(re.reConstructBinaryTree(pre,1,8,in,4,6).val);
    }

    //该类的构造方法
    public BinaryTreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {
        //// 没有符合前序和中序的二叉树或已经到达叶子节点
        if(startPre>endPre||startIn>endIn)
            return null;
        //实例化一个root
        BinaryTreeNode root=new BinaryTreeNode(pre[startPre]);

//        前序[1],[2,4,7],[3,5,6,8]
//        中序[4,7,2],[1],[5,3,8,6]


        //对中序遍历
        for(int i=startIn;i<=endIn;i++)
            //如果中序的某个值为前序的第一个值（根结点）
            if(in[i]==pre[startPre]){

                //参数值的选择并不十分清楚
                root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=reConstructBinaryTree(pre,startPre+i-startIn+1,endPre,in,i+1,endIn);
//                root.left = reConstructBinaryTree(pre,in,left+1,left+ count,)
                break;
            }

        return root;
    }
}
