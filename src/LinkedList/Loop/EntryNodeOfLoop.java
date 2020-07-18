package LinkedList.Loop;

/**
 * Created by zhangfan 2020/7/18
 * 返回有环链表的入口结点
 * 解:有巧妙的算法。将p1和p2都从原点出发，p1走1步，p2走两步。p1经过x步在环中第一次相遇，此时p2比p1多走一圈，
 * （a+b）*2=a+b+c+b。所以a=c。也就是环外的长度，与剩下的长度相同。让p2在原点重新一步一步走，p1接着一步一步走，下次相遇的点
 * 返回，就是入口点。
 *
 * --------a---------\---------\ 半圆长为b
 *                  \          \
 *                  \          \
 *      半圆长为c    \________*|
 *                           相遇点
 *
 */
public class EntryNodeOfLoop {
    public static class ListNode {
        int value; // 保存链表的值
        ListNode next; // 下一个结点
        public ListNode(int val) {
            this.value = val;
        }
        //如果不重写这个方法，则输出需要.value。否则输出hash码。
        // 但是加了.value，容易造成空指针异常。
//        所以为了既不输出hash码，又没有空指针，重写了tostring方法会更好。
        @Override
        public String toString() {
            return value +"";
        }
    }
    public static ListNode EntryNodeOfLoop(ListNode pHead){
        //判断链表头结点是否为空
        if(pHead == null || pHead.next == null)
            return null;
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        while(p2 != null && p2.next != null ){
            //快慢指针
            p1 = p1.next;
            p2 = p2.next.next;
            //第一次相遇后，将快指针放到链表原点（表头），慢指针接着走。且都是一步一步走
            if(p1 == p2){
                p2 = pHead;
                while(p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                if(p1 == p2)
                    return p1;//重新相遇的地方就是入口。此时返回p1和p2都行。
            }
        }
        return null;
    }

    //该方法也可以，而且嵌套少，更清楚
    public static ListNode meetingNode(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        // 链表中没有环
        if (fast == null || fast.next == null) {
            return null;
        }

        // fast重新指向第一个结点
        fast = head;

        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }

    public static void main(String[] args) {
        test01();
        test02();
        test03();
    }

    // 1->2->3->4->5->6
    private static void test01() {
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

        System.out.println(EntryNodeOfLoop(n1));
        System.out.println(meetingNode(n1));
    }

    // 1->2->3->4->5->6
    //       ^        |
    //       |        |
    //       +--------+
    private static void test02() {
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

        System.out.println(EntryNodeOfLoop(n1));
        System.out.println(meetingNode(n1));
    }

    // 1->2->3->4->5->6 <-+
    //                |   |
    //                +---+
    private static void test03() {
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
        n6.next = n6;

        System.out.println(EntryNodeOfLoop(n1));
        System.out.println(meetingNode(n1));
    }

}


