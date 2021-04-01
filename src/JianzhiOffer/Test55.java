package JianzhiOffer;

import java.util.HashSet;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/29 18:16
 * @Description: 输出环的入口
 */
public class Test55 {
    public static class ListNode {
        int value;
        ListNode next = null;
    }

    public static ListNode EntryNodeOfLoop(ListNode pHead) {
        HashSet set = new HashSet();
        while (pHead != null) {
            if (set.add(pHead)) {
                pHead = pHead.next;
            } else {
                return pHead;
            }
        }
        return null;

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

        head.next.next.next.next.next = head.next.next;

        System.out.println(EntryNodeOfLoop(head).value);


//        1-> 2 -> 3-> 4->5
//                 |______|
    }
}
