package DataStructure.LinkedListRevision.trying;

import java.util.Scanner;

public class LinkedListMerge {
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

    public static Node mergeLL(Node head1 ,Node head2){
       if (head1==null){
           return head2;
       }
       if (head2==null){
           return head1;
       }

       Node t1=head1,t2=head2;
       Node head=null,tail=null;

       if (t1.data <= t2.data){
           head=t1;
           tail=t1;
           t1=t1.next;
       }
      else {
           head=t2;
           tail=t2;
           t2=t2.next;
       }

       while (t1 != null && t2 != null){
           if (t1.data <= t2.data){
               tail.next=t1;
               tail=t1;
               t1=t1.next;
           }else {
               tail.next=t2;
               tail=t2;
               t2=t2.next;
           }

       }
//       One of the is over
        if (t1 != null){
            tail.next=t1;

        }else {
            tail.next=t2;
        }

        return head;

    }

    public static void main(String[] args) {

        Node head1=InputLL();

        Node head2=InputLL();

        Node head=mergeLL(head1,head2);
        print(head);



    }
}
