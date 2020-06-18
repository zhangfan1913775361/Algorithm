package BinaryTree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by zhangfan 2020/6/18
 *
 * 这是剑指offer的原题，判断二叉树是否对称。
 * 换而言之：如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 *
 */

public class TreeIsSymmetrical {
    private static class BinaryTreeNode{
        private int val;
        private BinaryTreeNode left;
        private BinaryTreeNode right;
        private BinaryTreeNode(int data){
            this.val = data;
        }
    }
    /**
     * 法一，递归法。非常简单。
     */
    private static boolean isSymmetrical(BinaryTreeNode root){
        if (root == null){
            return true;
        }
        return isSymmetrical(root.left,root.right);

    }
    private static boolean isSymmetrical(BinaryTreeNode left,BinaryTreeNode right){
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }
        if (left.val != right.val){
            return false;
        }
        return isSymmetrical(left.left, right.right)&&isSymmetrical(right.left,left.right);

    }
    private static void assemble(BinaryTreeNode node,
                                 BinaryTreeNode left,
                                 BinaryTreeNode right) {
        node.left = left;
        node.right = right;
    }

    /**
     * 法二：DFS用栈存储，达到深度优先遍历的效果。
     * @param pRoot
     * @return
     * * DFS使用stack来保存成对的节点
     * * 1.出栈的时候也是成对成对的 ，
     * 1.若都为空，继续；
     * 2.一个为空，返回false;
     * 3.不为空，比较当前值，值不等，返回false；
     * * 2.确定入栈顺序，每次入栈都是成对成对的，如left.left， right.right ;left.rigth,right.left
     */
   private static boolean isSymmetricalDFS(BinaryTreeNode pRoot)
    {
        if(pRoot == null) return true;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(pRoot.left);
        s.push(pRoot.right);
        while(!s.empty()) {
            BinaryTreeNode right = s.pop();//成对取出
            BinaryTreeNode left = s.pop();
            if(left == null && right == null) continue;
            if(left == null || right == null) return false;
            if(left.val != right.val) return false;
            //成对插入
            s.push(left.left);
            s.push(right.right);
            s.push(left.right);
            s.push(right.left);
        }
        return true;
    }



    /**
    * BFS使用Queue来保存成对的节点，代码和上面极其相似
    * 1.出队的时候也是成对成对的
    1.若都为空，继续；
    2.一个为空，返回false;
    3.不为空，比较当前值，值不等，返回false；
    * 2.确定入队顺序，每次入队都是成对成对的，如left.left， right.right ;left.rigth,right.left
    */

  private static boolean isSymmetricalBFS(BinaryTreeNode pRoot)
    {
        if(pRoot == null) return true;
        Queue<BinaryTreeNode> s = new LinkedList<>();
        s.offer(pRoot.left);
        s.offer(pRoot.right);
        while(!s.isEmpty()) {
            BinaryTreeNode left= s.poll();//成对取出
            BinaryTreeNode right= s.poll();
            if(left == null && right == null) continue;
            if(left == null || right == null) return false;
            if(left.val != right.val) return false;
            //成对插入
            s.offer(left.left);
            s.offer(right.right);
            s.offer(left.right);
            s.offer(right.left);
        }
        return true;
    }



    public static void main(String[] args) {
        test01();
    }

    //                            1
    //                  2                   2
    //             4         6          6          4
    //          8     9   10   11   11     10   9     8
    public static void test01() {
        BinaryTreeNode n1 = new BinaryTreeNode(1);
        BinaryTreeNode n2 = new BinaryTreeNode(2);
        BinaryTreeNode n3 = new BinaryTreeNode(2);
        BinaryTreeNode n4 = new BinaryTreeNode(4);
        BinaryTreeNode n5 = new BinaryTreeNode(6);
        BinaryTreeNode n6 = new BinaryTreeNode(6);
        BinaryTreeNode n7 = new BinaryTreeNode(4);
        BinaryTreeNode n8 = new BinaryTreeNode(8);
        BinaryTreeNode n9 = new BinaryTreeNode(9);
        BinaryTreeNode n10 = new BinaryTreeNode(10);
        BinaryTreeNode n11 = new BinaryTreeNode(11);
        BinaryTreeNode n12 = new BinaryTreeNode(11);
        BinaryTreeNode n13 = new BinaryTreeNode(10);
        BinaryTreeNode n14 = new BinaryTreeNode(9);
        BinaryTreeNode n15 = new BinaryTreeNode(8);

        assemble(n1, n2, n3);
        assemble(n2, n4, n5);
        assemble(n3, n6, n7);
        assemble(n4, n8, n9);
        assemble(n5, n10, n11);
        assemble(n6, n12, n13);
        assemble(n7, n14, n15);
        assemble(n8, null, null);
        assemble(n9, null, null);
        assemble(n10, null, null);
        assemble(n11, null, null);
        assemble(n12, null, null);
        assemble(n13, null, null);
        assemble(n14, null, null);
        assemble(n15, null, null);

        System.out.println(isSymmetrical(n2));
        System.out.println(isSymmetricalDFS(n1));
        System.out.println(isSymmetricalBFS(n1));

    }


}
