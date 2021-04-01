package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/17 18:34
 * @Description:  二叉树的最近公共祖先
 */
public class Test68 {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    private static TreeNode ancestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) {
            return root;
        }
        TreeNode l = ancestor(root.left, p, q);
        TreeNode r = ancestor(root.right, p, q);
        if (l == null) {
            return r;
        } else if (r == null) {
            return l;
        }else {
            return root;
        }
    }


    public static void main(String[] args) {
//          3
//        /   \
//       5      1
//      / \    / \
//     6   2   0  8
//        / \
//       7   4
//
        TreeNode node = new TreeNode();
        node.val = 3;
        node.left = new TreeNode();
        node.left.val = 5;
        node.left.left = new TreeNode();
        node.left.left.val = 6;
        node.left.right = new TreeNode();
        node.left.right.val = 2;
        node.left.right.left = new TreeNode();
        node.left.right.left.val = 7;
        node.left.right.right = new TreeNode();
        node.left.right.right.val = 4;
        node.right = new TreeNode();
        node.right.val = 1;
        node.right.left = new TreeNode();
        node.right.left.val = 0;
        node.right.right = new TreeNode();
        node.right.right.val = 8;
        System.out.println(ancestor(node,node.left.left,node.left.right.right).val);


    }
}
