package DataStructure.QueueDataStrucutre.UsingArray;

/*
                                       Time complexity
          What is the time complexity of performing double capacity function in case of queues?
                                         Answer:
                                           O(n)

 */
public class DyanmicQueueUsingArray {
    /*
                Dynamic queue
                In the dynamic queue. we will be preventing the condition where the queue
                becomes full, and we were not able to insert any further elements in that.
                As we all know that when the queue is full, it means the internal array that we are
                using in the form of a queue has become full, we can resolve this problem by
                creating a new array of double the size of the previous one and copying and pasting the
                elements of the previous array to the new one. Now this new array which has the
                double size will be considered as our queue. We will do this in insert function when
                we check for queue full (size==capacity), when this happens, we will discard the
                previous array and create a new array of double size, copying and pasting all the elements
                so that we don't lose the data. Let’s now check the implementation of the same.
                Implementation is pretty similar to the static approach discussed above. A few
                minor changes are there which could be followed with the help of comments in the
                code below.
     */
    private int data[];
    private int front;
    private int rare;
    private int size;

    public DyanmicQueueUsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rare = -1;
    }

    public DyanmicQueueUsingArray() {
        data = new int[2];
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

    public void enqueue(int element) {
        if (size == data.length)// To check if the queue is already full
        {
            doubleCapacity();
        }
        if (size == 0) {
            front++;
        }
        rare = (rare + 1) % data.length;
        data[rare] = element;// Otherwise added a new element
        size++;


    }

    private void doubleCapacity() {
//        This is private because this is used internally and
//        I don't want any one outside the class change it

        int temp[] = data; // Keeping a reference of previous array
        data = new int[2 * temp.length];
        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index++] = temp[i];
        }
        for (int i = 0; i < front - 1; i++) {
            data[index++] = temp[i];
        }
        front = 0;
        rare = temp.length - 1;
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
        front = (front + 1) % data.length;
        size--;
        if (size == 0) {
            front = -1;
            rare = -1;
        }
        return temp;

    }
}
