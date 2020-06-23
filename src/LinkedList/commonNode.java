package LinkedList;

/**
 * 打印两个有序链表的公共部分！注意是有序！一下子就变简单了。
 */

public class commonNode {
    public static class ListNode {
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


//    /**
//     * 寻找对应位置上结点相同的位置，
//     * @param pHead1
//     * @param pHead2
//     * @return
//     */
//    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
//        if (pHead1 == null||pHead2 == null) {
//            return null;
//        }
//        //分别计算链表1和2的长度
//        int count1 = 0;
//        ListNode p1 = pHead1;
//        while (p1!=null){
//            p1 = p1.next;
//            count1++;
//        }
//        int count2 = 0;
//        ListNode p2 = pHead2;
//        while (p2!=null){
//            p2 = p2.next;
//            count2++;
//        }
//
//        int flag = count1 - count2;
//
//        if (flag > 0){
//            while (flag>0){
//                pHead1 = pHead1.next;
//                flag --;
//            }
//            while (pHead1!=pHead2){
//                pHead1 = pHead1.next;
//                pHead2 = pHead2.next;
//            }
//            return pHead1;
//        }
//        if (flag <= 0){
//            while (flag<0){
//                pHead2 = pHead2.next;
//                flag ++;
//            }
//            while (pHead1 != pHead2){
//                pHead2 = pHead2.next;
//                pHead1 = pHead1.next;
//            }
//            return pHead1;
//        }
//        return null;
//    }

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
