package JianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/22 10:46
 * @Description: 按层打印二叉树，但是要有层级信息
 */
public class Test22_2 {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    //按层打印，并保留层序信息
    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        //先加第一个
        if (root != null) queue.add(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                //每次获取队首的元素，并放至tmp中
                TreeNode node = queue.poll();
                tmp.add(node.val);
                //归并
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
//            将所有tmp值一次性加入res中
            res.add(tmp);
        }
        return res;
    }

    //之字形打印
    public static List<List<Integer>> printTreeNodeByZ(TreeNode root) {
        if (root == null) {
            return new ArrayList<>(0);
        }
//        同样是先加第一个
        LinkedList<TreeNode> queue = new LinkedList() {{
            add(root);
        }};
        List<List<Integer>> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            LinkedList<Integer> tmp = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--) {
//                获得队首元素，并加入tmp中。只是此时的分为加到前和加到后了。
                TreeNode node = queue.poll();
                if (res.size() % 2 == 0) {
                    tmp.addLast(node.val);
                } else {
                    tmp.addFirst(node.val);
                }
//                归并
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }

            }
            res.add(tmp);
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
        node.val = 1;
        node.left = new TreeNode();
        node.left.val = 2;
        node.right = new TreeNode();
        node.right.val = 3;
        node.left.left = new TreeNode();
        node.left.left.val = 4;
        node.left.right = new TreeNode();
        node.left.right.val = 5;
        node.right.left = new TreeNode();
        node.right.left.val = 6;
        node.right.right = new TreeNode();
        node.right.right.val = 7;
        System.out.println(printTreeNodeByZ(node));
    }
}
