package DataStructure.LinkedListRevision.trying;

import java.util.Scanner;

public class LinkedListMid {
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
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + "->");

            temp = temp.next;

        }
        System.out.print("null");
        System.out.println();


    }

    public static Node mid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast.next !=null && fast.next.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    public static void main(String[] args) {
        Node head=InputLL();
        Node midPoint=mid(head);
        System.out.println(midPoint.data);

    }
}
