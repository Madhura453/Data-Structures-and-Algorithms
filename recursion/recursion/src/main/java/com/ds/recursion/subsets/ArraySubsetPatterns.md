#### First pattern
1) pick and not -pick the elements

##### second pattern

1) Base case: if the target is zero return it
    f(index,target,ds,ans):
       for(index->n-1)
    pick                                                                       not-pick
   
   do this if(arr[i]<=target) else break
   ls.add(arr[i])
  f(index+1,target-arr[i],ds,ans)
   ds.remove(arr[i])
