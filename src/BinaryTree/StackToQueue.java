package BinaryTree;

//Integer是int的包装类型，默认值为null，也可以为0.但是int默认为0，不能为null。
//包装类型是为了对象化！有自己的属性(min_value)，自己的对象操作（进制转化，类型转化）

import java.util.Stack;

/**
 * 包装类有以下用途
 *         1.集合不允许存放基本数据类型，故常用包装类
 *         2.包含了每种基本类型的相关属性，如最大值，最小值，所占位数等
 *         3.作为基本数据类型对应的类类型，提供了一系列实用的对象操作，如类型转换，进制转换等
 */

/*  两个栈充当队列，十分简单，画个流程图即可

push时，判断stack2里有没有值，如果有，则先pop出来，再push进stack1，再执行stack1本来的push操作
pop时，判断stack1里有没有值，有的话则pop出来，push进stack2，再pop。

总结：push的话，只有stack1里能有值。pop的话，只有stack里能有值。

 */

public class StackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(Integer node){
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }
    public int pop(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
