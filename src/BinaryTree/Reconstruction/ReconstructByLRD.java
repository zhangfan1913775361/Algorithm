package BinaryTree.Reconstruction;

/**
 * Created by zhangfan 2020/7/15
 * 只通过后续遍历重建搜索二叉树（左子树比根小，右子树比根大）
 */
public class ReconstructByLRD {
    //1、判断数组是否为后序遍历
    public static boolean isPostArray(int []arr )
    {
        if(arr==null||arr.length==0)
        {
            return false;
        }
        return isPost(arr,0,arr.length-1);

    }
    //递归调用
    public static boolean isPost(int[]arr,int start,int end)
    {
        if(start==end)
        {
            return true;
        }
        int less=-1;
        int more=end;
        for(int i=start;i<end;i++)
        {
            if(arr[end]>arr[i])
            {
                less=i;
            }else
            {
                more=more==end?i:more;
            }

        }
        if(less==-1||more==end)
        {
            return isPost(arr,start,end-1);
        }
        if(less!=more-1)
        {
            return false;
        }
        return isPost(arr,start,less)&&isPost(arr,more,end-1);

    }
    //2、根据后续遍历重建二叉搜索树
    //首先写BST的定义
    public static class Node{

        public int value;

        public Node left;

        public Node right;

        public Node(int data)
        {
            this.value=data;
        }
    }
    //构建搜索二叉树
    public static Node posArrayToBST(int[] posArr) {
        if (posArr == null) {
            return null;
        }
        return posToBST(posArr, 0, posArr.length - 1);
    }

    public static Node posToBST(int[] posArr, int start, int end) {
        if (start > end) {
            return null;
        }
        Node head = new Node(posArr[end]);
        int less = -1;
        int more = end;
        for (int i = start; i < end; i++) {
            if (posArr[end] > posArr[i]) {
                less = i;
            } else {
                more = more == end ? i : more;
            }
        }
        head.left = posToBST(posArr, start, less);
        head.right = posToBST(posArr, more, end - 1);
        return head;
    }

    // 先序遍历打印二叉树
    public static void printTree(Node head) {
        System.out.println("Binary Tree:");
        printInOrder(head, 0, "H", 17);
        System.out.println();
    }

    public static void printInOrder(Node head, int height, String to, int len)
    {
        if (head == null) {
            return;
        }
        printInOrder(head.right, height + 1, "v", len);
        String val = to + head.value + to;
        int lenM = val.length();
        int lenL = (len - lenM) / 2;
        int lenR = len - lenM - lenL;
        val = getSpace(lenL) + val + getSpace(lenR);
        System.out.println(getSpace(height * len) + val);
        printInOrder(head.left, height + 1, "^", len);
    }

    public static String getSpace(int num) {
        String space = " ";
        StringBuffer buf = new StringBuffer("");
        for (int i = 0; i < num; i++) {
            buf.append(space);
        }
        return buf.toString();
    }


    public static void main(String[] args) {
            //        4
            //       / \
            //      3   7
            //     /   /
            //    1   5
            //    \    \
            //     2    6
        int[]arr={2,1,3,6,5,7,4};
        System.out.println(isPostArray(arr));

        printTree(posArrayToBST(arr));
    }

}
