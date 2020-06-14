package LinkedList;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import java.net.HttpRetryException;

/**
 * Created by zhangfan 2020/6/14
 */
public class ReverseDoubleListNode {
    private static class DoubleNode{
        int Value;
        DoubleNode last;
        DoubleNode next;
        //初始化方式决定了这里不要有data
//        DoubleNode(int data){
//            this.Value = data;
//        }
    }

    public static DoubleNode reverseDoubleList(DoubleNode head){
        DoubleNode next = null;
        DoubleNode pre = null;
        while (head!= null){
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }
    public static void main(String[] args) {
        DoubleNode root = new DoubleNode();
        root.Value = 1;
        root.next = new DoubleNode();
        root.next.Value = 2;
        root.next.next =new DoubleNode();
        root.next.next.Value = 3;
        root.next.next.next = new DoubleNode();
        root.next.next.next.Value  = 4;
        root.next.next.next.next = new DoubleNode();
        root.next.next.next.next.Value  = 5;
        //输出反转后的双向链表的头节点5
        System.out.println(reverseDoubleList(root).Value);
    }

}
