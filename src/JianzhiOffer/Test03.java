package JianzhiOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/16 21:54
 * @Description: 链表的反向输出，要返回ArrayList类型
 */
public class Test03 {
    private static class ListNode {
        int value;
        ListNode next;
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode head) {
        //插入栈
        Stack<Integer> stack = new Stack<>();
        if (stack.empty()){
            while (head != null) {
                stack.push(head.value);
                head = head.next;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.empty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode();
        node.value = 1;
        node.next = new ListNode();
        node.next.value = 2;
        node.next.next = new ListNode();
        node.next.next.value = 3;
        node.next.next.next = new ListNode();
        node.next.next.next.value = 4;
        node.next.next.next.next = new ListNode();
        node.next.next.next.next.value = 5;
        System.out.println(printListFromTailToHead(node));
    }
}
