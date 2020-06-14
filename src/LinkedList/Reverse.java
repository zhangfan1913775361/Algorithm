package LinkedList;

import java.util.Stack;

/**
 * Created by zhangfan 2020/6/14
 */
public class Reverse {
        private static class ListNode{
            int Value;
            ListNode next;
        }
        //用栈
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
                System.out.print(head.Value + "->");
                head = head.next;
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
//            System.out.println(root.Value);
//            printList(root);
//            ReverseByStack(root);
            Rucursion(root);
        }
}
