package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/18 16:38
 * @Description:
 */
public class Test15 {
    private static class ListNode {
        int value;
        ListNode next;
    }

    private static ListNode reverseListNode(ListNode head) {
        ListNode p = null;
        ListNode q = head;
        while (q != null) {
            ListNode node = q.next;
            q.next = p;
            p = q;
            q = node;
        }
        return p;
    }

    private static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.value + "->");
            head = head.next;
        }
        System.out.print("null");
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
        print(node);
        System.out.println();
        print(reverseListNode(node));

    }
}
