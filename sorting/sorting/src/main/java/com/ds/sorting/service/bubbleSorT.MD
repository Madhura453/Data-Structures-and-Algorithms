Step 1
----------------------
1) Given array = [3,1,5,4,2]

Iterate entire array swap the elements if the element is greater than next element.
swap 1, 3 like that

why we need to step1
--------------------------
1) with first iteration of swap the first largest element at the end of the array.

[1,3,4,2,5]
2) with second iteration of swap the second-largest element at the end of the array 2nd
place.

[1,3,2,4,5]

similarly for nth elements.

* The idea was at every step the largest element at the end
* With every recursion right side was sorted. So need to sort again next time.
[1,3,4,2,5] 5 is already sorted. Next time we need to sort again 5. we will ignore 5 we will
sort only [1,3,4,2]