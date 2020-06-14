package LinkedList.Define;

/**
 * Created by zhangfan 2020/6/14
 */
public class PrintListNode {
    //ListNode需要为静态，不然调用不了
    private static class ListNode {
        private int value;
        private ListNode next;
        //下面可以不写，不然初始化的时候，括号里也要写值。
//        private ListNode(int data){
//            this.value = data;
//        }
    }

    /**
     * 输出链表的元素值
     *
     * @param head 链表的头结点
     */
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

        head.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.value = 6;

        head.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.value = 7;

        head.next.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.next.value = 8;

        head.next.next.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.next.next.value = 9;

        printList(head);
//        head = reverseList(head);
//        printList(head);
//        head = reverseList2(head);
//        printList(head);

    }
}
