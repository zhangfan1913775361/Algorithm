package LinkedList.Remove;

import LinkedList.Define.PrintListNode;

/**
 * Created by zhangfan 2020/6/21
 * 剑指offer的一道简单题，输出链表倒数第k个结点(凡是倒数的，都是一个先走一个后走)
 *
 */
public class Last_K_Node {
    private static class ListNode {
        int value; // 保存链表的值
        ListNode next; // 下一个结点
    }
    private static ListNode getKthFromEnd(ListNode head,int k){
        ListNode former = head,latter = head;
        //先让former走k步
        for (int i = 0; i < k; i++) {
            if (former == null) return null;
            former = former.next;
        }
        //former和latter一起走。
        while (former != null){
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + "->");
            head = head.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.value = 1;

        head.next = new ListNode();
        head.next.value = 2;

        head.next.next = new ListNode();
        head.next.next.value = 3;

        head.next.next.next = new ListNode();
        head.next.next.next.value = 4;

        head.next.next.next.next = new ListNode();
        head.next.next.next.next.value = 5;

        printList(head);
        System.out.println("=========");
        System.out.println(getKthFromEnd(head,2).value);
    }


}
