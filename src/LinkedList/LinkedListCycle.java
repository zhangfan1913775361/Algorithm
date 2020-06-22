package LinkedList;

/**
 * 找出链表是否有环,使用快慢指针法，最简单
 */

public class LinkedListCycle {
    public static class ListNode {
        public int value; // 保存链表的值
        public ListNode next; // 下一个结点
        public ListNode(int data){this.value = data;}
    }
    public static boolean findCycle(ListNode head){
        ListNode faster = head,slower = head;
        while (faster != null&& slower !=null){
            faster = faster.next.next;
            slower = slower.next;
            if (slower == faster)
            {return true;}
        }
        return false;
    }

    public static void main(String[] args) {
        // 1->2->3->4->5->6
        //       ^        |
        //       |        |
        //       +--------+
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n3;
        System.out.println(findCycle(n1));
    }


}
