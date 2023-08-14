package DataStructure.LearningLL;

public class LearningLL {



//    class DoubleNode{
//        public DoubleNode next;
//        DoubleNode head;
//        DoubleNode tail;
//
//        DoubleNode(){}
//
//        public DoubleNode(DoubleNode head, DoubleNode tail) {
//            this.head = head;
//            this.tail = tail;
//        }
//    }
    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;

        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //      *********************************************************
    private Node head = null;
    private Node tail = null;

    //        *******************************************************
    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;

    }

    //    *******************************************************
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    //      *********************************************************
    public void update(int val, int index) {
        Node newNode = new Node(val);

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

//     *********************************************************


    //    **********************************************************
    public void insertLast(int val) {
        Node newNode = new Node(val);

        if (tail == null) {
            insert(val);
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

//      *********************************************************

    public void inserFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;


    }

//    *********************************************************

    public void count() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;

        }
        System.out.println();
        System.out.println("Total elements 'size' " + count);
    }
//  **********************************************************
//Printing the linkedList using recursion


    public void printR(Node head) {
        if (head == null) {
            return;
        }

        System.out.print(head.value + "->");

        printR(head.next);

    }
//    ***************************************
//    How to print Linked List reverse using linked list

    public void printRR(Node head) {
        if (head == null) {
            return;
        }
        printRR(head.next);
        System.out.print(head.value + "->");


    }

    public Node insertR(Node head, int val, int i) {

        if (head == null && i > 0) {
            return head;
        }

        if (i == 0) {
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        } else {
            head.next = insertR(head.next, val, i - 1);
            return head;

        }


    }

//    *******************************************************************

    public Node deleteR(Node head, int i) {
        if (head == null) {
            return head;
        }


        if (i == 0) {
            head = head.next;
            return head;
        } else {
            head.next = deleteR(head.next, i - 1);
            return head;
        }


    }
// **************************************************************

//    public Node reverseR(Node head){
//        if (head== null)
//        {
//            return head;
//        }else
//        {
//
//        }
//
//
//
//    }

    //        *********************************************************
    public static void main(String[] args) {
        LearningLL list = new LearningLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);


        Node mid= list.midLL(list.head);
        System.out.println(mid.value);

//        list.update(25, 2);
//        list.insertLast(50);
//        list.inserFirst(5);
//        list.display();
//        list.printR(list.head);
//        list.printR(list.head);
//        list.insertR(list.head, 5, 1);

//        Node node = list.deleteR(list.head, 3);


//        Node node = list.reverseLL(list.head);
//        list.printR(node);

//       Node node= list.reverseRLL(list.head);
//         list.printR(node);
//        list.printR(list.head);




    }


    public Node reverseLL(Node head) {


        if (head == null) {
            return head;
        }

        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public Node reverseRLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newhead = reverseRLL(head.next);
        Node nexthead = head.next;
        nexthead.next = head;
        head.next = null;
        return newhead;
    }




//    public DoubleNode betterReverLL(DoubleNode head){
//        DoubleNode ans;
//        if (head == null || head.next == null) {
//            ans = new DoubleNode(head,head);
//            return ans;
//        }
//        DoubleNode smallAns=betterReverLL(head.next);
//        smallAns.tail.next=head;
//        head.next=null;
//        ans=new DoubleNode();
//        ans.head=smallAns.head;
//        ans.tail=head;
//        return  ans;
//
//
//
//    }

    public Node midLL(Node head){
        Node slow=head;
        Node fast=head;
        while (fast.next!=null && fast.next.next!=null){
           slow= slow.next;
           fast=fast.next.next;

        }
        return slow;

    }

}

