package DataStructure.StackDataStrcture.UsingCollection;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
//        stack.push(5);
//        stack.push(10);
//        stack.push(15);
//        System.out.print(stack.pop()+stack.size());
        while(stack.isEmpty())
        {
            stack.push(10);
        }
        System.out.print(stack.pop()+" "+stack.size());
    }

    }

