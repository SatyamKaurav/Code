package DataStructure.LinkedListRevision.trying;

import java.util.Scanner;
//This is edit from GitHub 
public class LLuse {

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

    public static Node createLinkedList() {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1;

    }

    public static Node Insert(Node head, int invalue, int pos) {

        Node newNode = new Node(invalue);
        if (pos == 0){
            newNode.next=head;
            head=newNode;

        }else {


        Node prev = head;
        int count = 0;

        while (count < pos - 1 && prev != null) {
            count++;
            prev = prev.next;
        }
        if (prev != null) {
            newNode.next = prev.next;
            prev.next = newNode;
        }}
        return head;
    }
public static Node deleteNode(Node head, int pos){
        if (head == null){
            return head;
        }

        if (pos ==0){
           return head.next;
        }

            int count = 0;
            Node prev = head;
            while (count < pos - 1 && prev !=null) {
                prev = prev.next;
                count++;
            }
            if (prev==null || prev.next==null) {
                return head;
            }
    prev.next = prev.next.next;
        return head;
}
    public static void main(String[] args) {
//        Node head = InputLL();
        Node head = createLinkedList();
        print(head);
        Node newHead=deleteNode(head,5);
        print(newHead);
//        Node newHead = Insert(head, 25, 0);
//        print(newHead);

    }

}
