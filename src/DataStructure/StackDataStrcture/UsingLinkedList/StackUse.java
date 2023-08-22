package DataStructure.StackDataStrcture.UsingLinkedList;

public class StackUse {
    public static void main(String[] args) {
        StackUsingLL<Integer> stack=new StackUsingLL<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.top());

    }
}
