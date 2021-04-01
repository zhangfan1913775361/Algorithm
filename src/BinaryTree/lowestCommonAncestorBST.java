package BinaryTree;

/**
 * 二叉搜索树的最近公共祖先。
 * 例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]
 *            6
 *          /  \
 *         2    8
 *        / \  / \
 *       0  4 7  9
 *         /\
 *       3  5
 *
 *  例一：输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * 输出: 6
 * 解释: 节点 2 和节点 8 的最近公共祖先是 6。
 *
 * 例二：输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 * 输出: 2
 * 解释: 节点 2 和节点 4 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。
 *
 */


public class lowestCommonAncestorBST {
    public  static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
//        TreeNode(int x) { val = x; }
    }

    /**
     * 思路，二叉搜索树啊！！root比左结点大，比右结点小。从root与p,q相比，
     * 大了就从左往下递归，小了就从右往下递归，这种题难道不应该2分钟AC吗？
     * @param root
     * @param p
     * @param q
     * @return
     */
    public static int lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left,p,q);
        }else if (root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right,p,q);
        }else {
            return root.val;
        }
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(8);如果第30行没注释，则需要这么初始化
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

        //p和q为4和2
        System.out.println(lowestCommonAncestor(root,root.left.right.left,root.right));
        /**
         * 结果分析：
         * 1.如果是空指针异常，一般都是调用了null对象的方法，或者改变了null对象的值。也就是说该节点根本
         * 就没有值，你调用它怎么可能成功呢？
         * 2.如果输出：BinaryTree.lowestCommonAncestor$TreeNode@1540e19d，
         * 则因为方法返回类型是NodeTree,改为返回Int即可。
         *
         *
         */
    }
}
