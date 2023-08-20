package DataStructure.LinkedListRevision.LinkedListCollection;

import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {

//        This is a Doubly Linked List
        LinkedList<Integer> list= new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (int x:list){
            System.out.print(x+" ");
        }

    }
}
