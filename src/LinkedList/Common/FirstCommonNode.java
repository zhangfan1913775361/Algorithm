package LinkedList.Common;

import java.util.HashMap;

/**
 * Created by zhangfan 2020/7/22
 * 输入两个链表，找出它们的第一个公共结点。（Y型链表）
 */
public class FirstCommonNode {
    private static class ListNode{
        int value;
        ListNode next;
        public ListNode(int val) {
            this.value = val;
        }

        @Override
        public String toString() {
            return value + "";
        }

    }


    //该方法用hashmap，先遍历链表1，存入每个节点值。再遍历链表2，用containskey检验出来。
    public static ListNode firstCommonNode(ListNode head1, ListNode head2){
        ListNode current1 = head1;
        ListNode current2 = head2;
        HashMap hashMap = new HashMap();
        while (current1 != null){
            hashMap.put(current1,null);
            current1 = current1.next;
        }
        while (current2 != null){
            if (hashMap.containsKey(current2)){
                return current2;
            }
            current2 = current2.next;
        }
        return null;
    }


    //大部分都对，在单链表时出现了错误
    public static ListNode firstCommonNode2(ListNode head1,ListNode head2){
        ListNode current1 = head1;
        ListNode current2 = head2;
        if(current1 == null || current2 == null)
            return null;
        int length1 = getlength(current1);
        int length2 = getlength(current2);
        if (length1 > length2){
            int diff = length1-length2;
            for (int i = 0;i < diff;i++){
                current1 = current1.next;
            }
        }else {
            int diff = length2-length1;
            for (int i = 0;i < diff;i++){
                current2 = current2.next;
            }
        }
        while (current1!= null && current2!= null){
            current1 = current1.next;
            current2 = current2.next;
            if (current1 == current2)
                return current1;
        }
        return null;


    }
    public static int getlength(ListNode head){
        int count = 0;
        ListNode current = head;
        while (current != null){
            current = current.next;
            count++;
        }
        return count;
    }


    //该方法用双指针，先让长点的链表走几步多的长度，再让两个链表齐头并进。
    public static ListNode FindFirstCommonNodeII(ListNode pHead1, ListNode pHead2) {
        ListNode current1 = pHead1;// 链表1
        ListNode current2 = pHead2;// 链表2
        if (pHead1 == null || pHead2 == null)
            return null;
        int length1 = getLength(current1);
        int length2 = getLength(current2);
        // 两连表的长度差

        // 如果链表1的长度大于链表2的长度
        if (length1 >= length2) {
            int len = length1 - length2;
            // 先遍历链表1，遍历的长度就是两链表的长度差
            while (len > 0) {
                current1 = current1.next;
                len--;
            }

        }
        // 如果链表2的长度大于链表1的长度
        else if (length1 < length2) {
            int len = length2 - length1;
            // 先遍历链表1，遍历的长度就是两链表的长度差
            while (len > 0) {
                current2 = current2.next;
                len--;
            }

        }
        //开始齐头并进，直到找到第一个公共结点
        while(current1!=current2){
            current1=current1.next;
            current2=current2.next;
        }
        return current1;

    }

    // 求指定链表的长度
    public static int getLength(ListNode pHead) {
        int length = 0;

        ListNode current = pHead;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    //以下均为测试数据
    private static void test1() {
        // 第一个公共结点在链表中间
        // 1 - 2 - 3 \
        //            6 - 7
        //     4 - 5 /
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n6;
        n6.next = n7;

        n4.next = n5;
        n5.next = n6;

        System.out.println(firstCommonNode2(n1, n4)); // 6
    }


    private static void test2() {
        // 没有公共结点
        // 1 - 2 - 3 - 4
        //
        // 5 - 6 - 7
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n5.next = n6;
        n6.next = n7;
        System.out.println(firstCommonNode2(n1, n5)); // null
    }

    private static void test3() {
        // 公共结点是最后一个结点
        // 1 - 2 - 3 - 4 \
        //                7
        //         5 - 6 /
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n7;

        n5.next = n6;
        n6.next = n7;
        System.out.println(firstCommonNode2(n1, n5)); // 7
    }

    private static void test4() {
        // 公共结点是第一个结点
        // 1 - 2 - 3 - 4 - 5
        // 两个链表完全重合
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(FindFirstCommonNodeII(n1,n1));
        System.out.println(firstCommonNode2(n1, n1)); // 1
    }

}
