package LinkedList;


/**
 * Created by zhangfan 2020/6/23
 * 单链表去掉倒数第k个节点，将删除后的链表输出
 */
public class RemoveLastKth {
    private static class ListNode{
        public int value;
        public ListNode next;
    }
    public  static ListNode removeLastkth(ListNode head,int kth){
        if (head == null || kth <1){
            return head;
        }
        ListNode cur = head;
        while (cur !=null){
            kth--;
            cur = cur.next;
        }
        System.out.println("递减后的k为"+kth);
        if (kth >0){
            System.out.println("k>0,不存在倒数第k个点，直接返回原链表即可");
        }else if(kth == 0){
            System.out.println("k=0,则倒数第k个点正好是头节点，返回此时的head.next");
            head = head.next;
        }else {
            cur = head;
            while (++kth != 0){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }
    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode root = new ListNode();
        root.value = 1;
        root.next = new ListNode();
        root.next.value = 2;
        root.next.next =new ListNode();
        root.next.next.value = 3;
        root.next.next.next = new ListNode();
        root.next.next.next.value  = 4;
        root.next.next.next.next = new ListNode();
        root.next.next.next.next.value  = 5;
//        System.out.println(.value);
        //删除倒数第2个，结果为1 2 3 5
        printList(removeLastkth(root,2));
    }
}
