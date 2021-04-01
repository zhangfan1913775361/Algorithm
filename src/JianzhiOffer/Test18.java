package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/18 18:12
 * @Description: 二叉树的镜像
 * 看了下答案之后，发现还是递归的方式最简单!!但是二叉树的打印方式不好写，所以不好判断结果是否正确
 */
public class Test18 {
    private static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
    }

    private static TreeNode mirro(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirro(root.left);
        mirro(root.right);
        return root;
    }

    private static void recur(TreeNode root) {
        if (root == null) {
            return;
        }
        //递归的先序遍历，先输出根节点，再分别输出左右子树
        System.out.println("value = " + root.value);
        recur(root.left);
        recur(root.right);
    }

    public static void main(String[] args) {
//                    1
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
//        System.out.println(mirro(node).value);
//        System.out.println(mirro(node).left.value);
//        System.out.println(Arrays.toString(LevelPrintTree.levelPrint(mirro(node))));

        recur(node);

    }
}
