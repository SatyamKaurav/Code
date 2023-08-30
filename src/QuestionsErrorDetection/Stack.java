package QuestionsErrorDetection;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {

    //Define the data members
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int size;


    public Stack() {
        //Implement the Constructor
        q1=new LinkedList<Integer>();
        q2=new LinkedList<Integer>();
        size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        return size;

        //Implement the getSize() function
    }

    public boolean isEmpty() {
        return size==0;
        //Implement the isEmpty() function
    }

    public void push(int element) {
        q1.add(element);
        size=size+1;
        //Implement the push(element) function
    }

    public int pop() {
        if (q1.isEmpty())
        {
            return -1;
        }
        while(q1.size()!=1)
        {
            q2.add(q1.remove());
        }
        int top=q1.remove();

        while(!q2.isEmpty())
        {
            q1.add(q2.remove());
        }
        size=size-1;
        return top;
        //Implement the pop() function
    }

    public int top() {
        if (q1.isEmpty())
        {
            return -1;
        }
        while(q1.size()!=1)
        {
            q2.add(q1.remove());
        }
        int top=q1.remove();

        while(!q2.isEmpty())
        {
            q1.add(q2.remove());
        }
        size=size-1;
        return top;
        //Implement the top() function
    }
}