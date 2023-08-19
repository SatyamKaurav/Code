package DataStructure.LinkedListRevision.trying;

import java.util.Scanner;



// Question 1 Delete node Recursively
    /*
    Question solution at 63
    Given a singly linked list of integers and position 'i', delete the node present at the 'i-th' position in the linked list recursively.
 Note :
Assume that the Indexing for the linked list always starts from 0.

No need to print the list, it has already been taken care. Only return the new head to the list.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line of input contains a single integer depicting the value of 'i'.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.
0 <= i < M

Time Limit:  2 sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3
Sample Output 1 :
3 4 5 6 1 9
Sample Input 2 :
2
30 -1
0
10 20 30 50 60 -1
4
Sample Output 2 :
10 20 30 50
     */

// Question 2 Reverse LL (Recursive)
    /*
Reverse LL (Recursive)
Send Feedback
Given a singly linked list of integers, reverse it using recursion and return the head to the modified list. You have to do this in O(N) time complexity where N is the size of the linked list.
 Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a seperate line.
 Constraints :
1 <= t <= 10^2
0 <= M <= 10^4
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
1 2 3 4 5 6 7 8 -1
Sample Output 1 :
8 7 6 5 4 3 2 1
Sample Input 2 :
2
10 -1
10 20 30 40 50 -1
Sample Output 2 :
10
50 40 30 20 10
 */

// Question 3 Reverse LL (Iterative)
    /*
    Reverse LL (Iterative)
Send Feedback
Given a singly linked list of integers, reverse it iteratively and return the head to the modified list.
 Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a separate line.
 Constraints :
1 <= t <= 10^2
0 <= N <= 10^4
Where N is the size of the singly linked list.

Time Limit: 1 sec
Sample Input 1 :
1
1 2 3 4 5 6 7 8 -1
Sample Output 1 :
8 7 6 5 4 3 2 1
Sample Input 2 :
2
10 -1
10 20 30 40 50 -1
Sample Output 2 :
10
50 40 30 20 10
     */






class DoubleNode {
    Node head;
    Node tail;

    DoubleNode() {
    }

    DoubleNode(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }
}

public class LinkedListUsingRecursion {

    public static Node InputLL() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node head = null;
        while (data != -1) {
            Node currentNode = new Node(data);
            if (head == null) {
//                Make this node as head node
                head = currentNode;
            } else {
                Node tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = s.nextInt();
        }

        return head;
    }

    //*************************************************************************
    public static void printR(Node head) {
        if (head == null) {
            return;
        }
//    printR(head.next);  To print the linked list in reverse order
        System.out.print(head.data + " ");
        printR(head.next); // To print Linked-list in correct order

    }

    //*************************************************************************
    public static Node insertR(Node head, int element, int pos) {
        if (head == null && pos > 0) {
            return head;
        }
        if (pos == 0) {
            Node newNode = new Node(element);
            newNode.next = head;
            return newNode;
        } else {
            head.next = insertR(head.next, element, pos - 1);
            return head;
        }

    }

    //*************************************************************************
    public static Node deleteR(Node head, int pos) {
        if (head == null && pos > 0) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        head.next = deleteR(head.next, pos - 1);
        return head;
    }

    //*************************************************************************
    public static Node reverseR(Node head) {
        //Reverse LINKED LIST IDEA 3

        if (head == null || head.next == null) {
            return head;
        }
        Node newhead = reverseR(head.next);
        Node tail = head.next;
        tail.next = head;
        head.next = null;
        return newhead;


    }


    //*************************************************************************
    public static Node reverseLLR(Node head) {
        //Reverse LINKED LIST IDEA 1
        // *The time complexity of this method will be O(n^2)*


        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseLLR(head.next); // This will create the lastnode Node of the Linked list the first node
        /*
         head ->[1] -> [2]-> [3]-> [4]-> [5]-> null
         Node newHead=reverseLLR(head.next);
         now after the above the line the newhead will becoeme
         [1]->null     null <-[2] <-[3] <-[4] <-[5] <-newHead
         */

        Node tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;
        /*
        Now this 94 to 99 code of lines are doind that
        the last node which was the head of the linked list now become the taill of the linked list
        and the head.next will start porintng to the null
          null<-[1]<-[2] <-[3] <-[4] <-[5] <-newHead
         */
        return newHead;

    }


    public static DoubleNode reverseLLRBetter(Node head) {
        //Reverse LINKED LIST IDEA 2
        DoubleNode ans;
        if (head == null || head.next == null) {
            ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }
//        This DoubleNode will have both Head and Tail of reverse Linked List
        DoubleNode smallnewHead = reverseLLRBetter(head.next);
        smallnewHead.tail.next = head;
        head.next = null;
        ans = new DoubleNode();
        ans.head = smallnewHead.head;
        ans.tail = head;
        return ans;

    }

    public static Node reverseLLRBetter1(Node head) {
//        This funtion is used to hind the compelxity if the code
//        we don't want that user get to know to about
//        the DoubleNode

        DoubleNode ans = reverseLLRBetter(head);
        return ans.head;
    }


    public static void main(String[] args) {
        Node head = InputLL();
//        Node newNode = insertR(head, 20, 10);
//        head = deleteR(head, 10);
//        printR(head);
//        printR(newNode);
//        head = reverseLLR(head);
        head = reverseLLRBetter1(head);
        printR(head);


    }


}
