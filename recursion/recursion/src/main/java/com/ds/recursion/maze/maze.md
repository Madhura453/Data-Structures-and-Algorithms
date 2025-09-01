1. Order in natural sorting order means

Down, left, Right, UpWord

Visited array

in visited array marking 1 means that is already visited.
in visited array marking 0 means that is not visited.

Marking 1 means having that cell in my current path so when that path is over ex: you are another recursion call those cells should 
not be true.

while you are moving back restore the maze as it was


when do yo go back
----------------------
1) when the function is returned 
2) when you come out of the recursive function you are in now above recursion call.
while going back revert the changes you have made it. Hence, remark the cell has not visited (0) . It is called backtracking


What is backtracking
------------------------------------
what if i  have not taken this path .

you are making some changes while going below recursion calls when you go outside those recursion calls changes that are made 
by via those recursion calls should also not available.  = VVVVVVVVIMP 

Once recursion call completes changes made by that recursion call also not available.

when the function was returned change the changes made by that recursion call.

make the change . once change is done. reverse the change

