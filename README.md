***This submission is still pending discussion with Professor Murphy***

Algorithm Analysis

Example in Section 1.4, Participation Activity 1.4.1 

1. MergeSortPriority Queue

= 5 Operations

= 1 Iterations
    = 2 Operations
        
= N Iterations
    = 1 Operations

= 2 Operations

= N Iterations
    = 2 Operations

big-O Notation is f(N) = 5 + 1 + 2 + N(1+2) = O(N)

The number of inputs is very small and likely to have faster run times. The running time here was 49 ms. 
2. QuickSortPriorityQueue

= 3 Operations

= N Iterations
    = 1 Operations

= N Iterations
    = 2 Operations

= 1 Operations

= 1 Iterations
    = 1 Operations

big-O Notation is f(N) = 3 + 1 + 1 + N(1+2) + = O(N)

The number of inputs is very small and likely to have faster run times. The running time here was 30 ms.

3. SelectionSortPriority Queue

= 3 Operations

= N Iterations
    = 2 Operations
        = N Iterations
            = 2 Operations

= 3 Final Comparison Operations

big-O Notation is f(N) = 3 + 3 + N(2+N(2)) + = O(3N+2)

The number of inputs is very small and likely to have faster run times. The running time here was 27 ms.
