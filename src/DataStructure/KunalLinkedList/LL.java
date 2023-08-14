package DataStructure.KunalLinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if (tail ==null){
            tail=head;
        }
        size+=1;
    }

    public void inserLast(int val){
        if (tail== null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val, int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        if (index == size){
            inserLast(val);
            return;
        }
        Node temp=head;
        for (int i=1;i<index;i++){
            temp=temp.next;


        }
        Node node =new Node(val , temp.next);
        temp.next=temp;
        size++;
    }

    public void display(){
        Node temp=head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.print("End");

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.next = next;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LL list =new LL();
        list.insertFirst(12);
        list.insertFirst(25);
        list.insertFirst(30);
        list.inserLast(50);

        list.display();

    }
}
