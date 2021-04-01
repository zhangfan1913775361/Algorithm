package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/18 16:16
 * @Description: 链表里倒数第k个结点
 */
public class Test14 {
    private static class ListNode {
        int value;
        ListNode next;
    }

    private static ListNode kthNodeFromEnd(ListNode head, int k) {
        //长度为n的链表，倒数第k个节点，其实也就是正数第n-k+1.
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count = count + 1;
            temp = temp.next;
        }
        if (k > count){
            return null;
        }
        for (int i = 0; i < count - k; i++) {
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode();
        node.value = 1;
        node.next = new ListNode();
        node.next.value = 2;
        node.next.next = new ListNode();
        node.next.next.value = 3;
        node.next.next.next = new ListNode();
        node.next.next.next.value = 4;
        node.next.next.next.next = new ListNode();
        node.next.next.next.next.value = 5;
        System.out.println(kthNodeFromEnd(node, 2).value);
    }
}
