package LinkedList;


/**
 * Created by zhangfan 2020/6/23
 */
public class ReverseAndPrint {
    private static class ListNode{
        int Value;
        ListNode next;
    }
    public static Integer[] reversePrint(ListNode head) {
        ListNode node = head;
        int count = 0;
        //先数数一共几个结点。
        while (node!=null){
            count++;
            node = node.next;
        }
        System.out.println(count);
        Integer [] nums = new Integer[count];
        node = head;
        for (int i= count-1;i>0;i--){//只限定次数，授值与count无关
            nums[i] = node.Value;
            node = node.next;
        }
        return nums;
    }
    public static void main(String[] args) {
        ListNode root = new ListNode();
        root.Value = 1;
        root.next = new ListNode();
        root.next.Value = 2;
        root.next.next =new ListNode();
        root.next.next.Value = 3;
        root.next.next.next = new ListNode();
        root.next.next.next.Value  = 4;
        root.next.next.next.next = new ListNode();
        root.next.next.next.next.Value  = 5;
        System.out.println(reversePrint(root));
    }
}
