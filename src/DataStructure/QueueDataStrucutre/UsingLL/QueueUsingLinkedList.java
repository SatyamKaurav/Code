package DataStructure.QueueDataStrucutre.UsingLL;

import DataStructure.Linkedlist.Node;
import DataStructure.QueueDataStrucutre.UsingArray.QueueEmptyException;


public class QueueUsingLinkedList<t> {
    Node<t> front;
    Node<t> rare;
    int size;


    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(t element) {
        Node<t> newNode = new Node<>(element);
        if (front == null) {
            front = newNode;
            rare = newNode;
        } else {
            rare.next = newNode;
            rare = newNode;//rare=rare.next;
        }
    }

    public t front() throws QueueEmptyException {
        if(front ==null){
             throw new QueueEmptyException() ;
        }
            return front.data;
    }

    public t dequeue() throws QueueEmptyException {
        if(front ==null){
            throw new QueueEmptyException() ;
        }
        t temp=front.data;
        front=front.next;
        if (front == null){
            rare=null;
        }
        size--;
        return temp;

    }

}
