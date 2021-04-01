package LinkedList.Remove;
//    15056405909 修水管

/**
 * Created by zhangfan 2020/7/18
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留！！！！返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */



public class DeleteDuplication {
    private static class ListNode {
        int value; // 保存链表的值
        ListNode next; // 下一个结点
    }
    private static void print(ListNode head) {
        while (head != null) {
            System.out.print(head + "->");
            head = head.next;
        }
        System.out.println("null");
    }
//    public static ListNode DeleteDuplication(ListNode phead){
//
//
//    }


}
