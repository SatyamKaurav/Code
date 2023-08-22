package DataStructure.StackDataStrcture.UsingLinkedList;

import DataStructure.Linkedlist.Node;

public class StackUsingLL<t> {
    private Node<t> head;
    private int size;

    public StackUsingLL() {
//        This is a default constructor no need to be writen but still for explanatin
        head = null;
        size = 0;

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size ==0;
    }


    public void push(t element) {
        Node<t> node = new Node<>(element);
        node.next = head;
        head = node;
        size++;
    }

    public t top() {

        /* Remember that the top return type is t(type of data user has inserted) not the Node.
           I think many times we get confused that shouldn't we return the head node
           we should not as a user someone not know that wheter the stack you are using is implimented
           deep-down array or LL for me or anyone else as a user this should be abstract.
           The abstarct data type idea (right) so that's completly abstact you don't have to don't wory about that
           I will(as a programer ) make sure that funtions push() pop() top90 work correctly


         */


        if (head == null) {
            System.out.println("Stack is empty ***StackUnderFlow***");
        }
        return head.data;

    }

    public t pop() {
        if (head == null) {
            System.out.println("Stack is empty ***StackUnderFlow***");
        }

        t temp = head.data;
        head = head.next;
        size--;
        return temp;

    }

}
