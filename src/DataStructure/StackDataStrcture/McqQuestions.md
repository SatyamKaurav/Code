###### Question 1 Suppose we have 10 chairs(numbered 1 to 10 from top to bottom) placed on top of each other, now we remove the top 5 chairs and from the remaining 5 ,we again remove 2 chairs and place the previous 5 chairs back. Which numbered chair is at 6th position from the bottom?

Answer<br>
3<br>
The removed chairs are number 6 and 7.<br>
Now the seven chairs are in order 1 2 3 4 5 8 9 10(from top to bottom).
###### Question 2 What method is used in implementation of stacks?

Answer<br>
Last In First Out (LIFO)

###### Question.3 Size of Stack
 
Given an empty Stack and we perform following functions on the stack:
1. push(5)<br>
2. push(3)<br>
3. push(4)<br>
4. pop()<br>
5. push(2)<br>
   What is the size of stack now?<br>

Answer: 3<br>
Solution Description<br>
The final stack is 5 3 2.(2 is at the top)

###### Sum of Stack
What would be the sum of elements of Stack after performing following functions:<br>
1. push(5)<br>
2. push(3)<br>
3. push(4)<br>
4. pop()<br>
5. push(2)<br>

Answer: 10 

###### Question 5 Size function

What should be the return type of size function in stack?

Answer: int

###### Which of the following statement(s) about stack data structure is/are NOT correct?
options<br>
This problem may have one or more correct answers<br>

1. Stack data structure can be implemented using linked list<br>
2. New node can only be added at the top of the stack<br>
3. Stack is the FIFO data structure<br>
4. New node can be added at both ends <br>
 Answer : 3 and 4 

###### Stack Implementation
 
Which of the following operation take worst case i.e. linear time (O(n)) in the array implementation of stack?<br>
This problem has only one correct answer<br>
[]Push<br>
[]Pop<br>
[]IsEmpty<br>
[*]None<br>

###### What would be the output for the following functions if the size of array used in stack is 5 ?
1. push(5)<br>
2. push(4)<br>
3. push(3)<br>
4. push (2)<br>
5. pop()<br>
6. push(6)<br>
7. push(8) <br>>
8. push(9)<br>
9. print(size())  //to print the size of stack<br>

This problem has only one correct answer<br>
[]6<br>
[]5<br>
[correct]StackFullException at line 8<br>
[]StackFullException at line 7<br>

###### Correct Statement
 
What should be the sequence of push and pop to get the following output (pop means deleting and printing the deleted element) :<br>

5 4 6<br>
This problem may have one or more correct answers<br>
[*]push(4) push(5) pop pop push(6) pop<br>
[*]push(6) push(4) push(5) pop pop pop<br>
[]push(4) push(5) push(6) pop pop pop<br>
[*]push(5) pop push(4) pop push(6) pop<br>

###### Predict the output
 
What would be the output for the following functions (pop and size means printing also).<br>
Note: No StackFullException occurs.<br>
<br>
push(1)<br>push(2)<br>push(3)<br>size()<br>pop<br>push(8)<br>pop<br>pop<br>pop <br>
This problem has only one correct answer<br>
3 8 3 2 1<br>
2 3 8 2 1<br>
[*]3 3 8 2 1<br>
4 8 3 2 1<br>

###### Double Stack
 
If initially the size of array of stack is 3,and we need to input 34 elements. How many times the doublecapacity function would be called?<br>
Answer: the doubleCapcity funtion will be called 4 times

###### Time complexity
What is the time complexity of doublecapacity function of stack?
***(n is the size of previous array).***
Answer: the complexity will be O(n)

###### LL Stacks
Which of the following is true about linked list implementation of stack?<br>
(A) In push operation, if new nodes are inserted at the beginning of linked list, then in pop operation, nodes must be removed from end.<br>
(B) In push operation, if new nodes are inserted at the end, then in pop operation, nodes must be removed from the beginning.<br>
Answer: None of the above

###### Time complexity
 
What would be the time complexity of the push and pop operations of the stack implemented using linked list (Assuming stack is implemented efficiently)?<br>

Answer:<br>
This problem has only one correct answer<br>
O(1) for insertion and O(n) for deletion<br>
***O(1) for insertion and O(1) for deletion***<br>
O(n) for insertion and O(n) for deletion<br>
O(n) for insertion and O(1) for deletion<br>