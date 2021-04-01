package BinaryTree;

/**
 * 普通二叉树的最深公共祖先
 *
 * 所有节点的值都是唯一的。p、q 为不同节点且均存在于给定的二叉树中。且祖先可以是自己。
 *
 *  *            3
 *  *          /  \
 *  *         5    1
 *  *        / \  / \
 *  *       6  2 0  8
 *  *         /\
 *  *       7  4
 *
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * 输出: 3
 * 解释: 节点 5 和节点 1 的最近公共祖先是节点 3。假如p=5,q=2.则输出5，因为祖先可以是自己。
 */

public class lowestCommonAncestor {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public static TreeNode lowanstor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        //三种情况，pq一个在左子树，一个在右子树，那么当前点就是最近祖先
        //p q都在左子树
        TreeNode left = lowanstor(root.left,p,q);
        //p q都在右子树
        TreeNode right = lowanstor(root.right,p,q);
        if (left != null && right != null){
            return root;
        }
        if (left != null){
            return left;
        }
        if (right != null){
            return right;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 6;
        root.right = new TreeNode();
        root.right.val = 8;
        root.left = new TreeNode();
        root.left.val = 2;
        root.left.left = new TreeNode();
        root.left.left.val = 0;
        root.left.right = new TreeNode();
        root.left.right.val = 4;
        root.right.left = new TreeNode();
        root.right.left.val = 7;
        root.right.right = new TreeNode();
        root.right.right.val = 9;
        root.left.right.left = new TreeNode();
        root.left.right.left.val = 3;
        root.left.right.right = new TreeNode();
        root.left.right.right.val = 5;
/**
 *  *            6
 *  *          /  \
 *  *         2    8
 *  *        / \  / \
 *  *       0  4 7  9
 *  *         /\
 *  *       3  5
 */

        System.out.println(lowanstor(root,root.left.right.left,root.right).val);
    }
}
