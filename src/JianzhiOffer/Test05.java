package JianzhiOffer;

import java.util.Stack;

/**
 * @Author: YCKJ3803
 * @Date: 2021/3/16 22:21
 * @Description: 用2个栈，模拟一个队列，要有队列的Pop和push方法
 */
public class Test05 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    private void push(int node) {
        stack1.push(node);
    }

    private Integer pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
