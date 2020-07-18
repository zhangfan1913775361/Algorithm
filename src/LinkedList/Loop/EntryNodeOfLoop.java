package LinkedList.Loop;

/**
 * Created by zhangfan 2020/7/18
 * 返回有环链表的入口结点
 */
public class EntryNodeOfLoop {
    public static class ListNode {
        int value; // 保存链表的值
        ListNode next; // 下一个结点
        public ListNode(int val) {
            this.value = val;
        }
    }
    public static ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null || pHead.next == null)
            return null;
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        while(p2 != null && p2.next != null ){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){
                p2 = pHead;
                while(p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                if(p1 == p2)
                    return p1;
            }
        }
        return null;
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

        System.out.println(EntryNodeOfLoop(n1).value);
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

        System.out.println(EntryNodeOfLoop(n1).value);
    }

}


