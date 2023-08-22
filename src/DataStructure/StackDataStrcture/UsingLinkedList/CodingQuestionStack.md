###### Stack Using LL
 
Implement a Stack Data Structure specifically to store integer data using a Singly Linked List.<br>
The data members should be private.<br>
You need to implement the following public functions :<br>
1. Constructor:
   It initialises the data members as required.
2. push(data) :
   This function should take one argument of type integer. It pushes the element into the stack and returns nothing.
3. pop() :
   It pops the element from the top of the stack and in turn, returns the element being popped or deleted. In case the stack is empty, it returns -1.
4. top :
   It returns the element being kept at the top of the stack. In case the stack is empty, it returns -1.
5. size() :
   It returns the size of the stack at any given instance of time.
6. isEmpty() :
   It returns a boolean value indicating whether the stack is empty or not.
   Operations Performed on the Stack:
   Query-1(Denoted by an integer 1): Pushes an integer data to the stack.

Query-2(Denoted by an integer 2): Pops the data kept at the top of the stack and returns it to the caller.

Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the top of the stack but doesn't remove it, unlike the pop function.

Query-4(Denoted by an integer 4): Returns the current size of the stack.

Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the stack is empty or not.
Input Format:
The first line contains an integer 'q' which denotes the number of queries to be run against each operation in the stack.
Then the test cases follow.

Every 'q' lines represent an operation that needs to be performed.<br>

For the push operation, the input line will contain two integers separated by a single space, representing the type of the operation in integer and the integer data being pushed into the stack.<br>

For the rest of the operations on the stack, the input line will contain only one integer value, representing the query being performed on the stack.<br>
Output Format:<br>
For Query-1, you do not need to return anything.<br>
For Query-2, prints the data being popped from the stack.<br>
For Query-3, prints the data kept on the top of the stack.<br>
For Query-4, prints the current size of the stack.<br>
For Query-5, prints 'true' or 'false'(without quotes).<br>

Output for every query will be printed in a separate line.<br>
Note:<br>
You are not required to print anything explicitly. It has already been taken care of. Just implement the function.
Constraints:<br>
1 <= q <= 10^5<br>
1 <= x <= 5<br>
-2^31 <= data <= 2^31 - 1 and data != -1<br>

Where 'q' is the total number of queries being performed on the stack, 'x' is the range for every query and data represents the integer pushed into the stack.

Time Limit: 1 second<br>
Sample Input 1:<br>
6<br>
1 13<br>
1 47<br>
4<br>
5<br>
2<br>
3<br>
Sample Output 1:<br>
2<br>
false<br>
47<br>
13<br>
Sample Input 2:<br>
4<br>
5<br>
2<br>
1 10<br>
5<br>
Sample Output 2:<br>
true<br>
-1<br>
false<br>
Explanation of Sample Input 2:<br>
There are 4 queries in total.<br>
The first one is Query-5: It tells whether the stack is empty or not. Since the stack is empty at this point, the output is  'true'.

The second one is Query-2: It pops the data from the stack. Since at this point in time, no data exist in the stack hence, it prints -1.

The third one is Query-1: It pushes the specified data 10 into the stack and since the function doesn't return anything, nothing is printed.

The fourth one is Query-5: It tells whether the stack is empty at this point or not. Since the stack has one element and hence it is not empty, false is printed.

## Answer
```java
       

[//]: # ( Following is the structure of the node class for a Singly Linked List)

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    
    public class Stack {

    //Define the data members
      private Node head;
       private int size;



    public Stack() {
        //Implement the Constructor
        head=null;
        size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size==0;

    }

    public void push(int element) {
        //Implement the push(element) function
      Node newNode=new Node(element);
      newNode.next=head;
      head=newNode;
      size++;

    }

    public int pop() {
        //Implement the pop() function
      if (head==null)
      {
     size=0;
       return -1;
        }
          int temp=head.data;
        head=head.next;
       size--;
        return temp;



    }

    public int top() {
        //Implement the top() function

         if (head==null)
        {
             
            return -1;
        }

        return head.data;
    }
    }
```

### Brackets Balanced
 
For a given a string expression containing only round brackets or parentheses, check if they are balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.

Example:<br>
Expression: (()())<br>
Since all the opening brackets have their corresponding closing brackets, we say it is balanced and hence the output will be, 'true'.<br>
You need to return a boolean value indicating whether the expression is balanced or not.<br>
Note:<br>
The input expression will not contain spaces in between.<br>
Input Format:<br>
The first and the only line of input contains a string expression without any spaces in between. Input string will only consists of round brackets.
Output Format:<br>
The only line of output prints 'true' or 'false'.<br>
Note:<br>
You don't have to print anything explicitly. It has been taken care of. Just implement the function.
Constraints:<br>
1 <= N <= 10^7<br>
Where N is the length of the expression.<br>

Time Limit: 1sec<br>
Sample Input 1 :<br>
(()()())<br>
Sample Output 1 :<br>
true<br>
Sample Input 2 :<br>
()()(()<br>
Sample Output 2 :<br>
false<br>
Explanation to Sample Input 2:<br>
The initial two pairs of brackets are balanced. But when you see, the opening bracket at the fourth index doesn't have its corresponding closing bracket which makes it imbalanced and in turn, making the whole expression imbalanced. Hence the output prints 'false'.<br>

```java

       import java.util.Stack;
     public class Solution {

    public static boolean isBalanced(String expression) {
        //Your code goes here


     Stack<Character> stack=new Stack<Character>();
        for (int j=0;j<expression.length();j++)
        {
            char i=expression.charAt(j);
            if (i=='[' || i=='{' || i=='(')
            {
                stack.push(i);
            }
            else if(i==']' || i=='}' || i==')')
            {
                if (stack.isEmpty())
                    return false;
                
                else
                {
                    if (i==']')
                    {
                        if (stack.peek()!='[')
                            return false;
                        else
                            stack.pop();
                    }
                    
                    else if (i=='}')
                    {
                        if (stack.peek()!='{')
                            return false;
                        else
                            stack.pop();
                    }
                    
                    else if (i==')')
                    {
                        if (stack.peek()!='(')
                            return false;
                        else
                            stack.pop();
                    }
                }
            }
            
        }
        return stack.isEmpty();
     }} 

``` 

### Reverse Stack
 
You have been given two stacks that can store integers as the data. Out of the two given stacks, one is populated and the other one is empty. You are required to write a function that reverses the populated stack using the one which is empty.
For Example:<br>
Alt txt<br>
<br>
Input Format :<br>
The first line of input contains an integer N, denoting the total number of elements in the stack.<br>
<br>
The second line of input contains N integers separated by a single space, representing the order in which the elements are pushed into the stack.<br>
Output Format:<br>
The only line of output prints the order in which the stack elements are popped, all of them separated by a single space.<br>
Note:<br>
You are not required to print the expected output explicitly, it has already been taken care of. Just make the changes in the input stack itself.
Constraints:<br>
1 <= N <= 10^3<br>
-2^31 <= data <= 2^31 - 1<br>

Time Limit: 1sec<br>
Sample Input 1:<br>
6<br>
1 2 3 4 5 10<br>
Note:<br>
Here, 10 is at the top of the stack.<br>
Sample Output 1:<br>
1 2 3 4 5 10<br>
Note:<br>
Here, 1 is at the top of the stack.<br>
Sample Input 2:<br>
5<br>
2 8 15 1 10<br>
Sample Output 2:<br>
2 8 15 1 10<br>

```java


     import java.util.Stack;
    public class Solution {
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
			//Your code goes here
        if (input.size()==0 || input.size()==1)
        {
            return;
        }
        
        int top=input.pop();
        reverseStack(input,extra);
        
        while(!input.isEmpty())
        {
            extra.push(input.pop());
        }
        input.push(top);
        
        while(!extra.isEmpty())
        {
            input.push(extra.pop());
        }
	}
    }

 ```

### Check redundant brackets
 <br>
For a given expression in the form of a string, find if there exist any redundant brackets or not. It is given that the expression contains only rounded brackets or parenthesis and the input expression will always be balanced.<br>
A pair of the bracket is said to be redundant when a sub-expression is surrounded by unnecessary or needless brackets.<br>
Example:<br>
Expression: (a+b)+c<br>
Since there are no needless brackets, hence, the output must be 'false'.<br>

Expression: ((a+b))<br>
The expression can be reduced to (a+b). Hence the expression has redundant brackets and the output will be 'true'.<br>
Note:<br>
You will not get a partial score for this problem. You will get marks only if all the test cases are passed.<br>
Input Format :<br>
The first and the only line of input contains a string expression, without any spaces in between.<br>
Output Format :<br>
The first and the only line of output will print either 'true' or 'false'(without the quotes) denoting whether the input expression contains redundant brackets or not.<br>
Note:<br>
You are not required to print the expected result. It has already been taken care of.<br>
Constraints:<br>
0 <= N <= 10^6<br>
Where N is the length of the expression.<br>

Time Limit: 1 second<br>
Sample Input 1:<br>
a+(b)+c<br>
Sample Output 1:<br>
true<br>
Explanation:<br>
The expression can be reduced to a+b+c. Hence, the brackets are redundant.<br>
Sample Input 2:<br>
(a+b)<br>
Sample Output 2:<br>
false<br>

```java
import java.util.Stack;
public class Solution {

	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		  Stack<Character> stack=new Stack<Character>();
        int count=0;
        for(int i=0;i<expression.length();i++)
        {
            char c=expression.charAt(i);
            //System.out.print(c);
            
            if (c==')')
            {
                //System.out.println();
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    count=count+1;
                    stack.pop();
                    //System.out.print(stack.pop());
                }
                //System.out.println();
                //System.out.println(count);
                if (count==0 || count==1)
                {
                    return true;
                }
                stack.pop();
                count=0;
                
            }
            else
            {
                stack.push(c);
            }
        }
        return false;
	}
}
```
### Stock Span
 
Afzal has been working with an organization called 'Money Traders' for the past few years. The organization is into the money trading business. His manager assigned him a task. For a given array/list of stock's prices for N days, find the stock's span for each day.<br>
The span of the stock's price today is defined as the maximum number of consecutive days(starting from today and going backwards) for which the price of the stock was less than today's price.<br>
For example, if the price of a stock over a period of 7 days are [100, 80, 60, 70, 60, 75, 85], then the stock spans will be [1, 1, 1, 2, 1, 4, 6].<br>
Explanation:<br>
On the sixth day when the price of the stock was 75, the span came out to be 4, because the last 4 prices(including the current price of 75) were less than the current or the sixth day's price.<br>

Similarly, we can deduce the remaining results.<br>
Afzal has to return an array/list of spans corresponding to each day's stock's price. Help him to achieve the task.<br>
Input Format:<br>
The first line of input contains an integer N, denoting the total number of days.<br>

The second line of input contains the stock prices of each day. A single space will separate them.<br>
Output Format:<br>
The only line of output will print the span for each day's stock price. A single space will separate them.<br>
Note:<br>
You are not required to print the expected output explicitly. It has already been taken care of. Just store the values of output in the spans array.<br>
Constraints:<br>
0 <= N <= 10^7<br>
1 <= X <= 10^9<br>
Where X denotes the stock's price for a day.<br>
<br>
Time Limit: 1 second<br>
Sample Input 1:<br>
4<br>
10 10 10 10<br>
Sample Output 1:<br>
1 1 1 1<br>
Sample Input 2:<br>
8<br>
60 70 80 100 90 75 80 120<br>
Sample Output 2:<br>
1 2 3 4 1 1 2 8 <br>

```java
import java.util.Stack;
public class Solution {

	public static int[] stockSpan(int[] price) {
		//Your code goes here
	int[] span=new int[price.length];
        Stack<Integer> stack=new Stack<Integer>();
        span[0]=1;
        stack.push(0);
        
        for (int i=1;i<price.length;i++)
        {
            while(!stack.isEmpty() && price[stack.peek()]<price[i])
            {
                stack.pop();
            }
            //System.out.println(stack.size());
            
            if (stack.isEmpty())
            {
                span[i]=i+1;
            }
            else
            {
                //System.out.println("i = "+i);
                //System.out.println("top = "+stack.peek());
                span[i]=i-stack.peek();
            }
            stack.push(i);
            //System.out.println("New top: "+stack.peek());
            //System.out.println();
        }
        return span;
	}

}
```

### Minimum bracket Reversal
 
For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order to make the expression balanced. The expression will only contain curly brackets.<br>
If the expression can't be balanced, return -1.<br>
Example:<br>
Expression: {{{{
If we reverse the second and the fourth opening brackets, the whole expression will get balanced. Since we have to reverse two brackets to make the expression balanced, the expected output will be 2.<br>

Expression: {{{<br>
In this example, even if we reverse the last opening bracket, we would be left with the first opening bracket and hence will not be able to make the expression balanced and the output will be -1.<br>
Input Format :<br>
The first and the only line of input contains a string expression, without any spaces in between.<br>
Output Format :<br>
The only line of output will print the number of reversals required to balance the whole expression. Prints -1, otherwise.<br>
Note:<br>
You don't have to print anything. It has already been taken care of.<br>
Constraints:<br>
0 <= N <= 10^6<br>
Where N is the length of the expression.<br>

Time Limit: 1sec<br>
Sample Input 1:<br>
{{{<br>
Sample Output 1:<br><br>
-1<br>
Sample Input 2:<br>
{{{{}}<br>
Sample Output 2:<br>
1<br>
```java

import java.util.*;
public class Solution {

	public static int countBracketReversals(String input) {
		//Your code goes here
		 if (input.length()%2!=0)
        {
            return -1;
        }
        Stack<Character> stack=new Stack<Character>();
        int count=0;
        for (int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if (c=='{')
            {
                stack.push(c);
            }
            else
            {
                if (stack.isEmpty())
                {
                    stack.push(c);
                }
                else if (stack.peek()=='}')
                {
                    stack.push(c);
                }
                else if (stack.peek()=='{')
                {
                    stack.pop();
                }
            }
        }
        
        while(!stack.isEmpty())
        {
            char c1=stack.pop();
            char c2=stack.pop();
            
            if (c1==c2)
            {
                count=count+1;
            }
            else
            {
                count=count+2;
            }
        }
        return count;
	}

}
```
