package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/18 17:26
 * @Description: 给定二叉树 A和B，判断B是不是A的子结构（空树不是任何一个树的子结构）
 * <p>
 * 这道题递归了好多！！
 */
public class Test17 {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    private static boolean isSubStruction(TreeNode node1, TreeNode node2) {
        return (node1 != null && node2 != null) || (recur(node1.left, node2) || recur(node1.right, node2) || isSubStruction(node1, node2));
    }

    private static boolean recur(TreeNode node1, TreeNode node2) {
        if (node2 == null) {
            return true;
        }
        if (node1 == null || node1.val != node2.val) {
            return false;
        }
        return recur(node1.left, node1.left) && recur(node1.right, node2.right);
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        //如果A和B有任何一个是空，则为false
        if (A == null || B == null)
            return false;
        //先从根节点判断B是不是A的子结构，如果不是在分别从左右两个子树判断，
        //只要有一个为true，就说明B是A的子结构
        return isSub(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    boolean isSub(TreeNode A, TreeNode B) {
        //这里如果B为空，说明B已经访问完了，确定是A的子结构
        if (B == null)
            return true;
        //如果B不为空A为空，或者这两个节点值不同，说明B树不是
        //A的子结构，直接返回false
        if (A == null || A.val != B.val)
            return false;
        //当前节点比较完之后还要继续判断左右子节点
        return isSub(A.left, B.left) && isSub(A.right, B.right);
    }


    public static void main(String[] args) {
//           8
//          /
//         8
//        /
//       9
//      /
//     2
//    /
//   5
//          8
//         /
//        9
//       /
//      2

        TreeNode node1 = new TreeNode();
        node1.val = 8;
        node1.left = new TreeNode();
        node1.left.val = 8;
        node1.left.left = new TreeNode();
        node1.left.left.val = 9;
        node1.left.left.left = new TreeNode();
        node1.left.left.left.val = 2;
        node1.left.left.left.left = new TreeNode();
        node1.left.left.left.left.val = 5;
        TreeNode node2 = new TreeNode();
        node2.val = 8;
        node2.left = new TreeNode();
        node2.left.val = 9;
        node2.left.left = new TreeNode();
        node2.left.left.val = 2;
        System.out.println(isSubStruction(node1, node2));

    }
}
