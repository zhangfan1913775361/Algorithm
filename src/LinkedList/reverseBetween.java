package LinkedList;

/**
 * Created by zhangfan 2020/6/22
 */
public class reverseBetween{
    private static class ListNode{
        int Value;
        ListNode next;
    }
    public static ListNode reverseBetween(ListNode head, int m, int n) {

        // Empty list
        if (head == null) {
            return null;
        }

        // Move the two pointers until they reach the proper starting point
        // in the list.
        ListNode cur = head, prev = null;
        while (m > 1) {
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }

        // The two pointers that will fix the final connections.
        ListNode con = prev, tail = cur;

        // Iteratively reverse the nodes until n becomes 0.
        ListNode third = null;
        while (n > 0) {
            third = cur.next;
            cur.next = prev;
            prev = cur;
            cur = third;
            n--;
        }

        // Adjust the final connections as explained in the algorithm
        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;
        return head;
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
        printList(root);
        System.out.println(reverseBetween(root,2,4).Value);
        System.out.println();
    }
}
