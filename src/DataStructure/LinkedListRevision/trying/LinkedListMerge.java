package DataStructure.LinkedListRevision.trying;


// Question 5 Merge Two Sorted LL
    /*
    Merge Two Sorted LL
Send Feedback
You have been given two sorted(in ascending order) singly linked lists of integers.
Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order) and return the new head to the list.
Note :
Try solving this in O(1) auxiliary space.

No need to print the list, it has already been taken care.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the first sorted singly linked list separated by a single space.

The second line of the input contains the elements of the second sorted singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output :
For each test case/query, print the resulting sorted singly linked list, separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t = 10^2
0 <= N <= 10 ^ 4
0 <= M <= 10 ^ 4
Where N and M denote the sizes of the singly linked lists.

Time Limit: 1sec
Sample Input 1 :
1
2 5 8 12 -1
3 6 9 -1
Sample Output 1 :
2 3 5 6 8 9 12
Sample Input 2 :
2
2 5 8 12 -1
3 6 9 -1
10 40 60 60 80 -1
10 20 30 40 50 60 90 100 -1
Sample Output 2 :
2 3 5 6 8 9 12
10 10 20 30 40 40 50 60 60 60 80 90 100
     */

// Question 6 Merge Sort LL
    /*
    Merge Sort LL
Send Feedback
 Given a singly linked list of integers, sort it using 'Merge Sort.'
Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the sorted singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
10 9 8 7 6 5 4 3 -1
Sample Output 1 :
 3 4 5 6 7 8 9 10
 Sample Input 2 :
2
-1
10 -5 9 90 5 67 1 89 -1
Sample Output 2 :
-5 1 5 9 10 67 89 90
     */




import java.util.Scanner;

public class LinkedListMerge {
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

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + "->");

            temp = temp.next;

        }
        System.out.print("null");
        System.out.println();


    }

    public static Node mergeLL(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node t1 = head1, t2 = head2;
        Node head = null, tail = null;

        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }

        }
//       One of the is over
        if (t1 != null) {
            tail.next = t1;

        } else {
            tail.next = t2;
        }

        return head;

    }

    public static Node mid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;

        }
        Node mid = mid(head);

        Node part1head = head;
        Node part2head = mid.next;
        mid.next = null;

        part1head = mergeSort(part1head);
        part2head = mergeSort(part2head);

        return mergeLL(part1head, part2head);


    }

    public static void main(String[] args) {

        Node head1 = InputLL();

//        Node head2=InputLL();
//        Node head=mergeLL(head1,head2);

        Node head = mergeSort(head1);
        print(head);


    }

}
