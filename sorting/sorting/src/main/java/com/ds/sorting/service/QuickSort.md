What is Pivot
------------------
1. Choose any element -> after first iteration all the elements less than pivot will be on L.H.S of pivot and
All elements that are greater than pivot will be R.H.S of the pivot.

Think about every problem 1) what it is doing 2) why it is doing.

2) After every iteration the pivot at correct place.
3) In merge sort even array is sorted then also it will go till the end. Here it will not happen. If array sorted
it will not reach end.

How to pick pivot
1) It is random element.
2) Take last element or corner element or middle element.
3) For best time complexity O(log n) choose pivot as middle element.