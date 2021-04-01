package LinkedList;

/**
 * Created by zhangfan 2020/6/22
 */
public class reverseMtoN {
    private static class ListNode {
        int Value;
        ListNode next;
        public ListNode(int data){this.Value = data;}
    }
    public static ListNode MidNode(ListNode head,int m,int n) {
//        ListNode head = null;
//        ListNode tmp = null, pre = null;
//        int count = 0;
//        while (head != null) {
//            head = head.next;
//            count++;
//        }
//        System.out.println(head.Value);
//        for (int i = 0; i < count / 2; i++) {
//            tmp = head.next;
//            head.next = pre;
//            pre = head;
//            head = tmp;
//        }
//        return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode first = dummy;
        for(int i = 1;i<m;i++){
            first = first.next;
        }
        ListNode second = first.next;
        if (second == null) {
            return dummy.next;
        }
        ListNode l = second;
        ListNode r = l.next;
        for (int i = m;i<n;i++){
            ListNode tmp = r.next;
            r.next = l;
            l = r;
            r = tmp;
        }
        first.next = l;
        second.next = r;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
//        root.Value = 1;
        root.next = new ListNode(2);
//        root.next.Value = 2;
        root.next.next = new ListNode(3);
//        root.next.next.Value = 3;
        root.next.next.next = new ListNode(4);
//        root.next.next.next.Value = 4;
        root.next.next.next.next = new ListNode(5);
//        root.next.next.next.next.Value = 5;
        System.out.println(MidNode(root,2,4).Value);
    }
}
