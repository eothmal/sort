This sort first assumes a sorted list of size 1 an insert additional elements in the right posisition.  
In the worst case (if the list is originally sorted in descending order).   
"N" elements are checked and swapped  for every selected element to get to the right position.  
Checking "N" elements foe each of "N" selected elements.  
O(N^2)  
It is a stable sort -   
It takes O(1) extra space, it is sort in place.  
It makes O(N^2) comparisons and O(N^2) swaps.   
