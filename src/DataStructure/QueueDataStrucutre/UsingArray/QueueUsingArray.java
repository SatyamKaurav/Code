package DataStructure.QueueDataStrucutre.UsingArray;

public class QueueUsingArray {

     private int data[];
     private int front;
     private int rare;
     private int size;

     public QueueUsingArray() {
          data=new int[5];
          front=-1;
          rare=-1;
     }
     public QueueUsingArray(int capacity) {
          data=new int[capacity];
          front=-1;
          rare=-1;
     }

     public int  size(){
          return size;
     }
     public boolean isEmpty(){
          return size==0;

     }

     public void enqueue(int element) throws QueueFullException {
          if (size == data.length){
           throw new QueueFullException();
          }
          if (size ==0){
               front++;
          }

          rare++;
          if (size==data.length){
               /*
                               ***Concept of Circular Queue***
          1.   Before adding this if statement, if we are inserting any element in the
               queue, it will show Index out of bound exception and the user will not be
               able to insert the element.
          2.   When do you have the space in your queue,So instead of going in the same
               direction, we should come back in the circular fashion and start inserting
               at the beginning again.

          rare++;
          if(size==data.length){
          rare=0;
          },
          instead of writing these codes, we can write it one line
        ***   rare=(rare + 1) % data.length;***

                */
               rare=0;
          }
          data[rare]=element;
          size++;


     }

     public int front() throws QueueEmptyException{
          if (size==0){
               throw new QueueEmptyException();
          }
          return data[front];
          
     }

     public int dequeue() throws QueueEmptyException {
          if (size==0){
               throw new QueueEmptyException();
          }
          int temp=data[front];
          front++;
          if (size==data.length){
               /*
               Circular Queue Concept
          front++;
          if (size==data.length){
          front=0;
          }

        ***  front=(front+1)%data.length;***

                */
               front=0;
          }
          size--;
          if (size==0){
               front=-1;
               rare=-1;
          }
          return temp;

     }
}
