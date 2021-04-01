package JianzhiOffer;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/18 16:46
 * @Description: 合并2个排序列表
 */
public class Test16 {
    private static class ListNode {
        int val;
        ListNode next;
    }

    private static ListNode merge(ListNode list1, ListNode list2) {
        ListNode head;
        ListNode pointer;
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val > list2.val) {
            head = list2;
            list2 = list2.next;
        } else {
            head = list1;
            list1 = list1.next;
        }
        pointer = head;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                pointer.next = list2;
                list2 = list2.next;
                pointer = pointer.next;
            } else {
                pointer.next = list1;
                list1 = list1.next;
                pointer = pointer.next;
            }
        }
        if (list1 == null) {
            pointer.next = list2;
        }
        if (list2 == null) {
            pointer.next = list1;
        }
        return head;
    }

    private static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        node1.val = 1;
        node1.next = new ListNode();
        node1.next.val = 3;
        node1.next.next = new ListNode();
        node1.next.next.val = 5;
        node1.next.next.next = new ListNode();
        node1.next.next.next.val = 7;
        node1.next.next.next.next = new ListNode();
        node1.next.next.next.next.val= 9;
        ListNode node2 = new ListNode();
        node2.val = 2;
        node2.next = new ListNode();
        node2.next.val = 4;
        node2.next.next = new ListNode();
        node2.next.next.val = 6;
        node2.next.next.next = new ListNode();
        node2.next.next.next.val = 8;
        node2.next.next.next.next = new ListNode();
        node2.next.next.next.next.val = 10;
        print(node1);
        print(merge(node1, node2));
    }
}
