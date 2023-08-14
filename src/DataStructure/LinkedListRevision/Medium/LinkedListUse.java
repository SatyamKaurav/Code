package DataStructure.LinkedListRevision.Medium;

import java.util.Scanner;

public class LinkedListUse {



    public static void main(String[] args) {
//        Node<Integer> head= insertLL();
        Node<Integer> head=insertLLefficient();
        print(head);


    }

    private static Node<Integer> insertLL() {
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        Node<Integer> head=null;
        while (data != -1){
            Node<Integer> currentNode=new Node<>(data);

            if (head == null){
                head=currentNode;
            }else {
                Node<Integer> tail=head;
                while (tail.next != null){
                    tail=tail.next;
                }
                tail.next=currentNode;
            }


            data =s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){


//        System.out.println(head.data);       //output 10
//        System.out.println(head.next.data);  // output 20
            Node<Integer> temp = head;
            while (temp != null) {

                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();


        }
    private static Node<Integer> insertLLefficient() {
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        Node<Integer> head=null,tail=null;
        while (data != -1){
            Node<Integer> currentNode=new Node<>(data);

            if (head == null){
                head=currentNode;
                tail=currentNode;
            }else {
//                Node<Integer> tail=head;
//                while (tail.next != null){
//                    tail=tail.next;
//                }
//                tail.next=currentNode;
                tail.next=currentNode;
                tail=currentNode;
            }


            data =s.nextInt();
        }
        return head;
    }
    }

