It takes O(1) extra space, it is sort in place.
It makes O(N^2) comparison and O(N^2) swaps.
It is a stable sort - entities that are equal are not rearranged.
It is an adaptive sort - when the list is sorted, it is possible to break out of the sort early.

Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. The algorithm, which is a comparison sort, is named for the way smaller or larger elements "bubble" to the top of the list.


[4, 5, 3, 2, 1, 0, 6, 8, 9, 7]

i = 9  
No swap at position : 0 and 1   
Swapping at position: 1 and 2  
[4, 3, 5, 2, 1, 0, 6, 8, 9, 7]  
Swapping at position: 2 and 3   
[4, 3, 2, 5, 1, 0, 6, 8, 9, 7]  
Swapping at position: 3 and 4  
 [4, 3, 2, 1, 5, 0, 6, 8, 9, 7]  
Swapping at position: 4 and 5   
[4, 3, 2, 1, 0, 5, 6, 8, 9, 7]  
No swap at position : 5 and 6   
No swap at position : 6 and 7   
No swap at position : 7 and 8   
Swapping at position: 8 and 9   
[4, 3, 2, 1, 0, 5, 6, 8, 7, 9]  

i = 8  
Swapping at position: 0 and 1   
[3, 4, 2, 1, 0, 5, 6, 8, 7, 9]  
Swapping at position: 1 and 2   
[3, 2, 4, 1, 0, 5, 6, 8, 7, 9]  
Swapping at position: 2 and 3   
[3, 2, 1, 4, 0, 5, 6, 8, 7, 9]  
Swapping at position: 3 and 4   
[3, 2, 1, 0, 4, 5, 6, 8, 7, 9]  
No swap at position : 4 and 5   
No swap at position : 5 and 6   
No swap at position : 6 and 7   
Swapping at position: 7 and 8   
[3, 2, 1, 0, 4, 5, 6, 7, 8, 9]  

i = 7  
Swapping at position: 0 and 1   
[2, 3, 1, 0, 4, 5, 6, 7, 8, 9]  
Swapping at position: 1 and 2   
[2, 1, 3, 0, 4, 5, 6, 7, 8, 9]  
Swapping at position: 2 and 3   
[2, 1, 0, 3, 4, 5, 6, 7, 8, 9]  
No swap at position : 3 and 4   
No swap at position : 4 and 5   
No swap at position : 5 and 6   
No swap at position : 6 and 7   

i = 6 
Swapping at position: 0 and 1   
[1, 2, 0, 3, 4, 5, 6, 7, 8, 9]  
Swapping at position: 1 and 2   
[1, 0, 2, 3, 4, 5, 6, 7, 8, 9]  
No swap at position : 2 and 3   
No swap at position : 3 and 4   
No swap at position : 4 and 5   
No swap at position : 5 and 6   

i = 5  
Swapping at position: 0 and 1   
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]  

