package LinkedList.Common;

/**
 * 打印两个有序链表的公共部分！注意是有序！一下子就变简单了
 * 分别比较链表的节点值，小的那个值就走一步。相同则输出。
 */

public class CommonNode {
    private static class ListNode {
    int val;
    ListNode next = null;
    }

    /**
     * 找出两个有序链表的公共结点
     * @param head1
     * @param head2
     */
    public static void FindCommonNode(ListNode head1,ListNode head2){
        System.out.println("输出公共结点");
        while (head1 != null && head2 != null){
            if(head1.val<head2.val){
                head1 = head1.next;
            }else if (head1.val > head2.val){
                head2 = head2.next;
            }else {
                System.out.println(head1.val);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }



    public static void main(String[] args) {
        ListNode root1 = new ListNode();
        root1.val = 1;
        root1.next = new ListNode();
        root1.next.val = 2;
        root1.next.next =new ListNode();
        root1.next.next.val = 3;
        root1.next.next.next = new ListNode();
        root1.next.next.next.val  = 4;
        root1.next.next.next.next = new ListNode();
        root1.next.next.next.next.val  = 5;
        ListNode root2 = new ListNode();
        root2.val = 3;
        root2.next = new ListNode();
        root2.next.val = 3;
        root2.next.next =new ListNode();
        root2.next.next.val = 3;
        root2.next.next.next = new ListNode();
        root2.next.next.next.val  = 4;
        root2.next.next.next.next = new ListNode();
        root2.next.next.next.next.val  = 5;
        FindCommonNode(root1,root2);
//        System.out.println(FindFirstCommonNode(root1,root2));
    }
}
