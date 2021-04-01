import LinkedList.Define.PrintListNode;

/**
 * Created by zhangfan 2020/7/1
 * 自己写的链表反转
 */
public class MyReverse {
    public static class ListNode{
        int value;
        ListNode next;
    }
    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode myReverse(ListNode cur){
        ListNode pre = null;
        ListNode dummy = null;
        while (cur != null){
            //将pre连到下下个结点
            pre.next = cur.next;
            //将当前的点指向之前的点
            cur.next = dummy.next;
            //dummy点指向当前的点
            dummy.next = cur;
            cur = cur.next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode();
        root.value = 1;
        root.next = new ListNode();
        root.next.value = 2;
        root.next.next = new ListNode();
        root.next.next.value = 3;
        root.next.next.next = new ListNode();
        root.next.next.next.value = 4;
        root.next.next.next.next = new ListNode();
        root.next.next.next.next.value = 5;
        root.next.next.next.next.next = new ListNode();
        root.next.next.next.next.next.value = 6;
        printList(root);

//        System.out.println(myReverse(root).value);


    }
}
