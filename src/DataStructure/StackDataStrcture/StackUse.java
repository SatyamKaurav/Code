package DataStructure.StackDataStrcture;

public class StackUse {

    public static void main(String[] args) throws StackFullException, StackEmptyException {

//        StackUsingArray stack = new StackUsingArray();
//        int arr[]={1,2,3,4};
//        for (int i=0;i<arr.length;i++){
//            stack.push(arr[i]);
//        }
//        while (! stack.isEmpty()){
//
//            System.out.print(stack.pop());
//        }
//***************************************************************
//        stack.push(10);
//        stack.push(20);
//        stack.push(30); //Complexity of the funtion is O(1)
//        System.out.println(stack.top()); //Complexity of the funtion is O(1)
//        System.out.println("pop element ->"+stack.pop());//Complexity of the funtion is O(1)
//        System.out.println("top most element of the stack "+stack.top());
//        System.out.println(stack.isEmpty());//Complexity of the funtion is O(1)
//        System.out.println(stack.size());//Complexity of the funtion is O(1)
//****************************************************************

//        Now if you want to give the user to give the capacity of the stack,
//        then you have to create a constructor
        StackUsingArray stack=new StackUsingArray(100);
         stack.push(4);
         stack.push(5);
         stack.pop();
         stack.pop();
         stack.push(6);
         stack.pop();

        while (! stack.isEmpty()) {

          System.out.print(stack.pop());
        }


        }


    }

