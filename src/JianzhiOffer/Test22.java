package JianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/21 17:28
 * @Description: 从上到下打印二叉树  层序遍历，递归简单，非递归用栈
 */
public class Test22 {
    private static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
    }

    //最简单的办法，递归
    private static void printTreeByRecursion(TreeNode root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.value + " ");
        }
        printTreeByRecursion(root.left);
        printTreeByRecursion(root.right);
    }

    //非递归的办法，一般都是用队列
    public static int[] printTreeByQueue(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        //初始化res和queue
        Queue<TreeNode> queue = new LinkedList() {
            {
                add(root);
            }
        };
        ArrayList<Integer> ans = new ArrayList();


        //先把队列的值poll出来，再把它的左右节点放进队列里。
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (ans != null) {
                ans.add(node.value);
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }


        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        //            1
//                   / \
//                  2   3
//                 / \ / \
//                4  5 6  7
        TreeNode node = new TreeNode();
        node.value = 1;
        node.left = new TreeNode();
        node.left.value = 2;
        node.right = new TreeNode();
        node.right.value = 3;
        node.left.left = new TreeNode();
        node.left.left.value = 4;
        node.left.right = new TreeNode();
        node.left.right.value = 5;
        node.right.left = new TreeNode();
        node.right.left.value = 6;
        node.right.right = new TreeNode();
        node.right.right.value = 7;
        printTreeByRecursion(node);
    }

}
