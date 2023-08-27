package DataStructure.QueueDataStrucutre.UsingArray;

public class QueueUsingArray {

     /*
     ● enqueue(): Insertion of element [Time Complexity O(1)]
     ● dequeue(): Deletion of element [Time Complexity O(1)]
     ● front(): returns the element present in the front position [Time Complexity O(1)]
     ● getSize(): returns the total number of elements present at current stage [Time Complexity O(1)]
     ● isEmpty(): returns boolean value, TRUE for empty and FALSE for non-empty [Time Complexity O(1)]
      */

    private int data[];
    private int front;
    private int rare;
    private int size;

    public QueueUsingArray() {
        data = new int[5];
        front = -1;
        rare = -1;
    }

    public QueueUsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rare = -1;
    }

    public int size() // Returns number of elements present
    {
        return size;
    }

    public boolean isEmpty()// To check if queue is empty or not
    {
        return size == 0;

    }

    public void enqueue(int element) throws QueueFullException {
        if (size == data.length)// To check if the queue is already full
        {
            throw new QueueFullException();
        }
        if (size == 0) {
            front++;
        }

        rare++;
        if (size == data.length) {
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
        ***   rare=(rare + 1) % data.length;*** // in cyclic way

                */
            rare = 0;
        }
        data[rare] = element;// Otherwise added a new element
        size++;


    }

    public int front() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        return data[front];

    }

    public int dequeue() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front++;
        if (size == data.length) {
               /*
               Circular Queue Concept
          front++;
          if (size==data.length){
          front=0;
          }

        ***  front=(front+1)%data.length;***

                */
            front = 0;
        }
        size--;
        if (size == 0) {
            front = -1;
            rare = -1;
        }
        return temp;

    }
}
