package DataStructure.LinkedListRevision.Bascis;

public class LinkedListUsed {

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1;

    }

    public static void print(Node<Integer> head) {

//        System.out.println(head.data);       //output 10
//        System.out.println(head.next.data);  // output 20
        Node<Integer> temp = head;
        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();


    }

    public static void increment(Node<Integer> head) {

//        head.data++; // this will only increment the first node

        // to increment all the nodes

        Node<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }

    }

    public static void countnodes(Node<Integer> head) {
        int count = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }


    public static void printith(Node<Integer> head,int i) {

//        int count=0;
//        Node<Integer> temp=head;
//        while (temp != null){
//            if (count == i){
//                System.out.println(temp.data);
//            }
//            count++;
//            temp=temp.next;
//
//        }
      Node<Integer> n=head;
         while (n!=null && i>0)
         {
             i=i-1;
             n=n.next;
         }
         if (n==null)
         {
             System.out.println();
         }
         else
         {
             System.out.println(n.data);
         }
    }

    public static void main(String[] args) {

//        Node<Integer> n1=new Node<>(10);
//        System.out.println(n1.data);
//        System.out.println(n1);
//        System.out.println(n1.next);

        Node<Integer> head = createLinkedList();
//        increment(head);
        print(head);
        countnodes(head);
        printith(head,2);


    }

}
