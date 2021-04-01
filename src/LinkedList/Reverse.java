package LinkedList;

import java.util.Stack;

/**
 * Created by zhangfan 2020/6/14
 *
 * 最常见的反转链表！输入头结点，输出反转链表后的头结点！！！
 */
public class Reverse {
        private static class ListNode{
            int Value;
            ListNode next;
        }
        //该方法为左程云版本，最推荐！！！标准答案！
        //入参是head也就是当前的结点
        private static ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return null;
            }
            ListNode tmp = null;
            ListNode pre = null;
            ListNode p = head;
            while(head != null){
                //把下一个结点存一下
                tmp = p.next;
                //指针指向上一个结点
                p.next = pre;
                //head的值赋给pre，即之前还是pre
                pre = p;
                p = tmp;
            }
            return pre;
        }

    public static ListNode ReverseJiudifanzhuan(ListNode pCur) {
        ListNode prev = null, dummy = null;

        while (pCur != null) {
            prev.next = pCur.next;
            pCur.next = dummy.next;
            dummy.next = pCur;
            pCur = prev.next;
        }
        return prev;
    }

    //用栈 该方法是打印出逆序的所有值
        public static void ReverseByStack(ListNode root){
            Stack<ListNode> stack = new Stack<>();
            while ( root != null){
                stack.push(root);
                root = root.next;
            }
            ListNode tmp;
            while (!stack.isEmpty()){
                tmp = stack.pop();
                System.out.println(tmp.Value+"->");
            }
        }
        //用递归
        public static void Rucursion(ListNode root){
            if (root!=null){
                Rucursion(root.next);
                System.out.println(root.Value+"");
            }
        }

        private static void printList(ListNode head) {
            while (head != null) {
                head = head.next;
                System.out.print(head.Value + "->");
            }
            System.out.println("null");
        }
        public static void main(String[] args) {
            ListNode root = new ListNode();
            root.Value = 1;
            root.next = new ListNode();
            root.next.Value = 2;
            root.next.next =new ListNode();
            root.next.next.Value = 3;
            root.next.next.next = new ListNode();
            root.next.next.next.Value  = 4;
            root.next.next.next.next = new ListNode();
            root.next.next.next.next.Value  = 5;

            System.out.println(reverseList(root));
        }
}
