package DataStructure.QueueDataStrucutre.UsingArray;

public class QueueUsing {
//    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
//        QueueUsingArray queue=new QueueUsingArray();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        System.out.println(queue.front());
//        queue.dequeue();
//        queue.enqueue(40);
//        System.out.println(queue.front());
//
//    }

    //    public static void main(String[] args) {
//        QueueUsingArray queue=new QueueUsingArray();
//        int arr[]={10,20,30};
//        for (int x:arr){
//                try {
//                    queue.enqueue(x);
//                } catch (QueueFullException e) {
//
//                }
//        }
//        while (!queue.isEmpty()){
//            try {
//                System.out.println(queue.dequeue());
//            } catch (QueueEmptyException e) {
//
//            }
//        }
//
//    }
    public static void main(String[] args) {
        DyanmicQueueUsingArray queue = new DyanmicQueueUsingArray();
//    int arr[]={10,20,30};
//        for (int x:arr){
//
//                    queue.enqueue(x);
//
//        }
//        while (!queue.isEmpty()){
//            try {
//                System.out.println(queue.dequeue());
//            } catch (QueueEmptyException e) {
//
//            }
//}


        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(50);
        queue.enqueue(60);
        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException e) {

            }

        }
    }
}
