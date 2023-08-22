package DataStructure.StackDataStrcture.UsingArray;

public class StackUsingArray {

    private int data[]; // Dynamic array created serving as stack
    private int topIndex;// To keep track of the current top index


    public StackUsingArray() {
        data = new int[3];
        topIndex = -1;
    }

    public StackUsingArray(int capacity) {
        data = new int[capacity];
        topIndex = -1;
    }


    public int size() {
// return the number of elements present in my stack
        return topIndex + 1;
    }


    // insert element
    public void push(int element) /*throws StackFullException */{

//      if the Stack is full, it will trow the StackFullException error
        if (topIndex == data.length - 1) {
//            StackFullException e = new StackFullException();
//            throw e;

//            or
//                    throw new StackFullException();

            doubleCapcity();
        }
        data[++topIndex] = element;

    }

    private void doubleCapcity(){
        System.out.println("doubleCapacity");
        int temp[]=data;
        data=new int[2 * temp.length];

        for (int i=1;i<temp.length;i++){
            data[i]=temp[i];
        }

    }

    public boolean isEmpty() {
//        Or
//        if (topIndex == -1){
//            return true;
//        }
//        else {
//            return false;
//        }
        return topIndex == -1;
        //Above program written in short-hand
    }


    //to return the top element of the stack
    public int top() throws StackEmptyException {
//        if the Stack is empty, it will trow the StackEmptyException error
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        return data[topIndex];


    }


    // delete element
    public int pop() throws StackEmptyException {
//Before deletion check for empty to prevent underflow
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        int temp = data[topIndex];
        topIndex--;//Conditioned satisfied so deleted
        return temp;

    }
}


