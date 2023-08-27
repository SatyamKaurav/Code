package DataStructure.QueueDataStrucutre.UsingLL;

import DataStructure.QueueDataStrucutre.UsingArray.QueueEmptyException;

public class QueueUsing {
    public static void main(String[] args) throws QueueEmptyException {
        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
        int arr[] = {10, 20, 30, 40, 50};
        for (int x : arr) {
            queue.enqueue(x);
        }
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


    }
}
