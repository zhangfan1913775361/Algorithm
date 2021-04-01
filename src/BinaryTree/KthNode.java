package BinaryTree;

/**
 * Created by zhangfan 2020/7/23
 */
public class KthNode {
    private static class BinaryTreeNode{
        private int value;
        private BinaryTreeNode left;
        private BinaryTreeNode right;
        public BinaryTreeNode(int value){
            this.value = value;
        }
    }
    //root 和k，都是入参
    public static BinaryTreeNode kthNode(BinaryTreeNode root, int k) {
        if (root == null || k < 1) {
            return null;
        }

        //将k转化为int数组
        int[] tmp = {k};
        return kthNodeCore(root, tmp);
    }
    private static BinaryTreeNode kthNodeCore(BinaryTreeNode root, int[] k) {
        BinaryTreeNode result = null;

        // 先从左子树中找
        if (root.left != null) {
            result =  kthNodeCore(root.left, k);
        }

        // 如果在左子树中没有找到
        if (result == null) {
            // 说明当前的根结点是所要找的结点
            if(k[0] == 1) {
                result = root;
            } else {
                // 当前的根结点不是要找的结点，但是已经找过了，所以计数器减一
                k[0]--;
            }
        }

        // 根结点以及根结点的右子结点都没有找到，则找其右子树
        if (result == null && root.right != null) {
            result = kthNodeCore(root.right, k);
        }

        return result;
    }
}
