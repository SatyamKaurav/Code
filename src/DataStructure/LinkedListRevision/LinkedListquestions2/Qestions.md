##### Qestion 1:Find a Node in LL (recursive)
 
Given a singly linked list of integers and an integer n, find and return the index for the first occurrence of 'n' in the linked list. -1 otherwise.<br>
Follow a recursive approach to solve this.<br>
Note :<br>
Assume that the Indexing for the linked list always starts from 0.<br>
Input format :<br>
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.<br>

The first line of each test case or query contains the elements of the singly linked list separated by a single space.<br>

The second line of input contains a single integer depicting the value of 'n'.<br>
Remember/Consider :<br>
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element<br>
Output format :<br>
For each test case/query, print the elements of the updated singly linked list.<br>

Output for every test case will be printed in a seperate line.<br>
Constraints :<br>
1 <= t <= 10^2<br>
0 <= M <= 10^5<br>
Where M is the size of the singly linked list.<br>

Time Limit:  1sec<br>
Sample Input 1 :<br>
1<br>
3 4 5 2 6 1 9 -1<br>
100<br>
Sample Output 1 :<br>
-1<br>
Sample Input 2 :<br>
2<br>
10 20010 30 400 600 -1<br>
20010<br>
100 200 300 400 9000 -34 -1<br>
-34<br>
Sample Output 2 :<br>
1<br>
5
##### Question 2:Even after Odd Linked List
For a given singly linked list of integers, arrange the elements such that all the even numbers are placed after the odd numbers. The relative order of the odd and even terms should remain unchanged.<br>
Note :<br>
No need to print the list, it has already been taken care. Only return the new head to the list.<br>
Input format:<br>
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.<br>
<br>
The first line of each test case or query contains the elements of the singly linked list separated by a single space.<br>
Remember/Consider :<br>
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element<br>
Output format:<br>
For each test case/query, print the elements of the updated singly linked list.<br>

Output for every test case will be printed in a seperate line.<br>
Constraints :<br>
1 <= t <= 10^2<br>
0 <= M <= 10^5<br>
Where M is the size of the singly linked list.

Time Limit: 1sec<br>
Sample Input 1 :<br>
1<br>
1 4 5 2 -1<br>
Sample Output 1 :<br>
1 5 4 2<br>
Sample Input 2 :<br>
2<br>
1 11 3 6 8 0 9 -1<br>
10 20 30 40 -1<br>
Sample Output 2 :<br>
1 11 3 9 6 8 0<br>
10 20 30 40<br>

##### Question 3 : Delete every N nodes
 
You have been given a singly linked list of integers along with two integers, 'M,' and 'N.' Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. Continue the same until the end of the linked list.<br>
To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.<br>
Note :<br>
No need to print the list, it has already been taken care. Only return the new head to the list.<br>
Input format :<br>
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.<br>

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line of input contains two integer values 'M,' and 'N,' respectively. A single space will separate them.<br>
Remember/Consider :<br>
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element<br>
Output format :<br>
For each test case/query, print the elements of the updated singly linked list.<br>

Output for every test case will be printed in a seperate line.
Constraints :<br>
1 <= t <= 10^2<br>
0 <= P <= 10^5<br>
Where P is the size of the singly linked list.<br>
0 <= M <= 10^5<br>
0 <= N <= 10^5<br>

Time Limit: 1sec<br>
Sample Input 1 :<br>
1<br>
1 2 3 4 5 6 7 8 -1<br>
2 2<br>
Sample Output 1 :<br>
1 2 5 6<br>
Sample Input 2 :<br>
2<br>
10 20 30 40 50 60 -1<br>
0 1<br>
1 2 3 4 5 6 7 8 -1<br>
2 3<br>
Sample Output 2 :<br>
1 2 6 7<br>
Explanation of Sample Input 2 :<br>
For the first query, we delete one node after every zero elements hence removing all the items of the list. Therefore, nothing got printed.

For the second query, we delete three nodes after every two nodes, resulting in the final list,<br> 1 -> 2 -> 6 -> 7.

##### Question 4 : Swap Two Nodes of Linked List
 
You have been given a singly linked list of integers along with two integers, 'i,' and 'j.' Swap the nodes that are present at the 'i-th' and 'j-th' positions.<br>
Note :<br>
Remember, the nodes themselves must be swapped and not the datas.<br>

No need to print the list, it has already been taken care. Only return the new head to the list.<br>
Input format :<br>
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.<br>
<br>
The first line of each test case or query contains the elements of the singly linked list separated by a single space.<br>

The second line of input contains two integer values 'i,' and 'j,' respectively. A single space will separate them.<br>
Remember/consider :<br>
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element<br>
Output format :<br>
For each test case/query, print the elements of the updated singly linked list.<br>

Output for every test case will be printed in a seperate line.<br>
Constraints :<br>
1 <= t <= 10^2<br>
0 <= M <= 10^5<br>
Where M is the size of the singly linked list.<br>
0 <= i < M<br>
0 <= j < M<br>

Time Limit: 1sec<br>
Sample Input 1 :<br>
1<br>
3 4 5 2 6 1 9 -1<br>
3 4<br>
Sample Output 1 :<br>
3 4 5 6 2 1 9<br>
Sample Input 2 :<br>
2<br>
10 20 30 40 -1<br>
1 2<br>
70 80 90 25 65 85 90 -1<br>
0 6<br>
Sample Output 2 :<br>
10 30 20 40<br>
90 80 90 25 65 85 70 <br>

##### Qestion 5:kReverse
 
Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and return its modified list.
'k' is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.
Example :
Given this linked list: 1 -> 2 -> 3 -> 4 -> 5

For k = 2, you should return: 2 -> 1 -> 4 -> 3 -> 5

For k = 3, you should return: 3 -> 2 -> 1 -> 5 -> 4
Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line of input contains a single integer depicting the value of 'k'.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a separate line.
Constraints :<br>
1 <= t <= 10^2<br>
0 <= M <= 10^5<br>
Where M is the size of the singly linked list.<br>
0 <= k <= M<br>

Time Limit:  1sec<br>
Sample Input 1 :<br>
1<br>
1 2 3 4 5 6 7 8 9 10 -1<br>
4<br>
Sample Output 1 :<br>
4 3 2 1 8 7 6 5 10 9<br>
Sample Input 2 :<br>
2<br>
1 2 3 4 5 -1<br>
0<br>
10 20 30 40 -1<br>
4<br>
Sample Output 2 :<br>
1 2 3 4 5<br>
40 30 20 10 <br>

##### Question 6 Bubble Sort (Iterative) Linked List

Given a singly linked list of integers, sort it using 'Bubble Sort.'<br>
Note :
No need to print the list, it has already been taken care. Only return the new head to the list.<br>
Input format :<br>
The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.<br>
Remember/Consider :<br>
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element<br>
Output format :<br>
For each test case/query, print the elements of the sorted singly linked list.<br>
<br>
Output for every test case will be printed in a seperate line.<br>
Constraints :<br>
0 <= M <= 10^3<br>
Where M is the size of the singly linked list.<br>
<br>
Time Limit: 1sec<br>
Sample Input 1 :<br><br>
10 9 8 7 6 5 4 3 -1<br>
Sample Output 1 :<br>
3 4 5 6 7 8 9 10<br>
Sample Input 2 :<br>
10 -5 9 90 5 67 1 89 -1<br>
Sample Output 2 :<br>
-5 1 5 9 10 67 89 90 <br>