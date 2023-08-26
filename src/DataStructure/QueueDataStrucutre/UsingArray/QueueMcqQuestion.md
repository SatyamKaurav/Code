### Queue Implementation
***GATE | Gate IT 2007 | Question 30***
Suppose you are given an implementation of a queue of integers. The operations that can be performed on the queue are:
i. isEmpty (Q) — returns true if the queue is empty, false otherwise.<br>
ii. delete (Q) — deletes the element at the front of the queue and returns its value.<br>
iii. insert (Q, i) — inserts the integer i at the rear of the queue.<br>
Consider the following function:<br>
```C
void f(queue Q) {
    int i ;
    if (!isEmpty(Q)) {
    i = delete(Q);
    f(Q);
    insert(Q, i);
    }
    }
```

    
    
   

