package DataStructure.Linkedlist;

import java.util.Scanner;

public class LinkedListUse2 {
    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print("[" + temp.data + "]" + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    //    **********************************************************************************************
    public static Node<Integer> takeInput() {

        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null, tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;

            } else {
                tail.next = currentNode;
                tail = currentNode;
            }
            data = s.nextInt();
        }

        return head;
    }

    //       **********************************************************************************************
    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
//          inserting a node in the beginning
        Node<Integer> n = new Node<>(5);
        n.next = n1;
//          inserting a value in between
        Node<Integer> u = new Node<>(25);
        u.next = n3;
        n1.next = n2;
        n2.next = u;
        n3.next = n4;
        return n;
//        System.out.println("n1 " + n1 + " data ->" + n1.data + " next " + n1.next);
//        System.out.println("n2 " + n2 + " data ->" + n2.data + " next " + n2.next);
//        System.out.println("n3 " + n3 + " data ->" + n3.data + " next " + n3.next);
//        System.out.println("n4 " + n4 + " data ->" + n4.data + " next " + n4.next);

    }

    //        **********************************************************************************************
    public static void main(String[] args) {
//      Node<Integer> head = takeInput();
        Node<Integer> head = createLinkedList();
        print(head);
    }
}
