package LinkedList.Loop;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhangfan 2020/7/20
 * 给定一个链表，判断链表中是否有环。根据head返回boolean型
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。
 *
 输入：head = [3,2,0,-4], pos = 1
 输出：true
 解释：链表中有一个环，其尾部连接到第二个节点
 *
 *输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 *
 *
 */
public class LoopbyPos {
    private static class ListNode {
        int value; // 保存链表的值
        ListNode next; // 下一个结点
        public ListNode(int val) {
            this.value = val;
        }
        @Override
        public String toString() {
            return value +"";
        }
    }

    //最经典的快慢指针
    public static boolean loopbyPos(ListNode head){
        if (head == null || head.next ==null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while (slow != fast){
            if (fast == null ||fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    //自己1分钟快速敲出来的。
    public static boolean myCyclel(ListNode head){
        if (head == null || head.next == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            if (slow == fast){
                return true;
            }else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return false;
    }

    //用hash表，每次将一个节点的hash值放进hashset中，遇到重复的则说明有环。
    public static boolean hasCycle(ListNode head){
        Set<ListNode> nodes = new HashSet<>();
        while (head != null){
            if (nodes.contains(head)){
                return true;
            }else {
                nodes.add(head);
            }
            head = head.next;
        }
        return false;
    }

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
        n6.next = n4;

        System.out.println(loopbyPos(n1));
        System.out.println(hasCycle(n1));
        System.out.println(myCyclel(n1));
    }

    public static void main(String[] args) {
        test01();
    }


}
