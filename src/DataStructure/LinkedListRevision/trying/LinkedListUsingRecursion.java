package DataStructure.LinkedListRevision.trying;

import java.util.Scanner;

public class LinkedListUsingRecursion {

    public static Node InputLL() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node head = null;
        while (data != -1) {
            Node currentNode = new Node(data);
            if (head == null) {
//                Make this node as head node
                head = currentNode;
            } else {
                Node tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = s.nextInt();
        }

        return head;
    }

    public static void printR(Node head) {
        if (head == null) {
            return;
        }
//    printR(head.next);  To print the linked list in reverse order
        System.out.print(head.data + " ");
        printR(head.next); // To print Linked-list in correct order

    }

    public static Node insertR(Node head, int element, int pos) {
        if (head == null && pos > 0) {
            return head;
        }
        if (pos == 0) {
            Node newNode = new Node(element);
            newNode.next = head;
            return newNode;
        } else {
            head.next = insertR(head.next, element, pos - 1);
            return head;
        }

    }

    public static Node deleteR(Node head, int pos) {
        if (head == null && pos > 0) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        head.next = deleteR(head.next, pos - 1);
        return head;
    }

//    public static Node reverseR(Node head) {
//
//        if (head == null || head.next == null) {
//            return head;
//        }
//        Node newhead=reverseR(head.next);
//        Node nexthead=head.next;
//        nexthead.next=head;
//        head.next=null;
//        return newhead;
//
//
//    }

    public static Node reverseLLR(Node head){
        // *The time complexity of this method will be O(n^2)*


        if (head ==null || head.next == null){
            return head;
        }
        Node newHead=reverseLLR(head.next); // This will create the lastnode Node of the Linked list the first node
        /*
         head ->[1] -> [2]-> [3]-> [4]-> [5]-> null
         Node newHead=reverseLLR(head.next);
         now after the above the line the newhead will becoeme
         [1]->null     null <-[2] <-[3] <-[4] <-[5] <-newHead
         */

        Node tail=newHead;
        while (tail.next != null){
            tail=tail.next;
        }
        tail.next=head;
        head.next=null;
        /*
        Now this 94 to 99 code of lines are doind that
        the last node which was the head of the linked list now become the taill of the linked list
        and the head.next will start porintng to the null
          null<-[1]<-[2] <-[3] <-[4] <-[5] <-newHead
         */
        return newHead;

    }

    public static void main(String[] args) {
        Node head = InputLL();
//        Node newNode = insertR(head, 20, 10);
//        head = deleteR(head, 10);
//        printR(head);
//        printR(newNode);



    }
}
