package BinaryTree;
/**
 * 从上往下打印二叉树 （同一层从左到右）
 *      * 从上往下打印出二叉树的每个结点，向一层的结点按照从左往右的顺序打印。
 *      * 例如下的二叉树，
 *      *       8
 *      *    /    \
 *      *   6     10
 *      *  /  \   / \
 *      * 5   7  9  11
 *      * 则依次打印出8、6、10、5、3 、9、11.
 */

import java.util.ArrayList;

public class PrintFromTopToBottom {
    public static class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode();
        root.val = 8;
        root.right = new BinaryTreeNode();
        root.right.val = 10;
        root.left = new BinaryTreeNode();
        root.left.val = 6;
        root.left.left = new BinaryTreeNode();
        root.left.left.val = 5;
        root.left.right = new BinaryTreeNode();
        root.left.right.val = 7;
        root.right.left = new BinaryTreeNode();
        root.right.left.val = 9;
        root.right.right = new BinaryTreeNode();
        root.right.right.val = 11;
        System.out.println(PrintFromTopToBottom(root));

    }

    /**
     *
     * @param root
     * @return
     */
    public static ArrayList<Integer> PrintFromTopToBottom(BinaryTreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<BinaryTreeNode> queue = new ArrayList<>();
        if (root == null) {
            return list;
        }
        //先把root add进queue中。
        queue.add(root);
        while (queue.size() != 0) {
            BinaryTreeNode temp = queue.remove(0);
            if (temp.left != null){
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;
    }
}
