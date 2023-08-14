package DataStructure.Linkedlist;

import java.util.Scanner;

public class LinkedListUse {

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

    public static void print(Node<Integer> head) {
        /*
        while (head != null) {
            System.out.print(head.data+"->");
            head = head.next;
        }

        By using this Function/method I can not use this LinkedList again
        here head is the pointer/variable which is iterating it will become null,
        and you want to go back and have trak of head of the link you can do that

                                        ***so***
           * A common and decent practice while dealing with linkedlist we should never move head you can
             keep a variable temp which will iterate.
           head                      @150    @200     @250
           [150]                     [10]     [20]     [30]
           temp
           [150]->[200]->[250]->[null]

            Node<Integer> temp=head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        And now if you want to access the liked list, and you want to print things again you can
        temp=head;
        this will bring temp back to first node*

         */


        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print("["+temp.data+ "]" + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();



        /*
        what if we put the while loop twice?
        what will be the output?
        while (head != null) {
            System.out.print(head.data+"->");
            head = head.next;
        }while (head != null) {
            System.out.print(head.data+"->");
            head = head.next;

        Answer: The output will be the same as output of loop one because after the first loop is done the
                head will become null next it will satisfy the condition of second loop.



         */

//        not a good way to print this
//        System.out.print(head.data+"->");
//        System.out.print(head.next.data+"->");
//        System.out.print(head.next.next.data+"->");


    }

    public static void incerment(Node<Integer> head) {
        head.data++;
        /*
        If input is 10 20 30
        the output will be 11 20 30
        How this is possible as every thing in java is "call by value"
        and even head was pass by value so why this increment is even possible

        Solution:
        Here as java is pass by value as the main method calling the increment method it is passing the reference of the
        head variable now there is different memory of the reference of head, but they are pointing to the same value
        (in this case 10).
        As the increment method is call it will increment the head value(data) by one
        and as the is main and increment method reference variable pointing to same data it so this output .


         */

        // Important
        /*
        head =new Node<>(100);
        head.data++;
        Now we are making head point to new Node and this head will start pointing too new Node
        and increase its data
        the data in the main will be unaffected
        input 10 20 30
        output 10 20 30

         */
//        If you want to incement all the values then use while loop
        Node<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }

    }


    public static int length(Node<Integer> head) {
        int count = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;
    }

//    static int printIthNode(Node<Integer> head,int i){
//    int count=0;
//    while(head != null){
//
//        if(i == count){
//            return head.data;
//        }
//        count++;
//        head=head.next;
//    }
//    assert (false);
//    return 0;
//    }


    public static void printIthNode(Node<Integer> head, int i) {
        int position = 0;
        Node<Integer> temp = head;
        while (temp != null && position < i) {
            temp = temp.next;
            position++;
        }
        if (temp != null) {
            System.out.println(temp.data);
        }
    }
//    public static Node<Integer> insert(Node<Integer> head,int n , int i ){
//
//        int position=0;
//        Node<Integer> temp=head;
//
//        while (temp != n)
//
//
//    }



    public static Node<Integer> input(){
        Scanner s=new Scanner(System.in);
        int data =s.nextInt();
        Node<Integer> head=null;
        while (data != -1){
            Node<Integer> currentNode =new Node<>(data);
            if (head == null){
                head=currentNode;
            }else {
                Node<Integer> tail=head;
                while (tail.next != null){
                    tail=tail.next;
                }
                tail.next=currentNode;
            }
            data= s.nextInt();
        }

        return head;
    }
    public static void main(String[] args) {
         Node<Integer> head = createLinkedList();
//        incerment(head);
//        print(head);
//        printIthNode(head, 2);
//        System.out.println("Lenght" + length(head));
//            Node<Integer> head= input();
//        print(head);




        /*
        what if we put the
        print(head);
        print(head);
        twice

        answer: It will print the answer twice because after the first the print(head)
        main method will call the print method again form staring.
         */
    }





}

//    }


   /*
    //*************************************************************************
    ///Question
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){

        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        node2.next = node1;
        print(node2);
    }

}
    */
