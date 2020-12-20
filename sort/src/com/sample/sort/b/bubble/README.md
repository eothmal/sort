It takes O(1) extra space, it is sort in place.
It makes O(N^2) comparison and O(N^2) swaps.
It is a stable sort - entities that are equal are not rearranged.
It is an adaptive sort - when the list is sorted, it is possible to break out of the sort early.

Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. The algorithm, which is a comparison sort, is named for the way smaller or larger elements "bubble" to the top of the list.
  
Example:  
[60, 70, 80, 40, 30, 90, 120, 50, 100, 110]  

i = 9  
Swapping: 2 and 3  
[60, 70, 40, 80, 30, 90, 120, 50, 100, 110]  
Swapping: 3 and 4  
[60, 70, 40, 30, 80, 90, 120, 50, 100, 110]  
Swapping: 6 and 7  
[60, 70, 40, 30, 80, 90, 50, 120, 100, 110]  
Swapping: 7 and 8  
[60, 70, 40, 30, 80, 90, 50, 100, 120, 110]  
Swapping: 8 and 9  
[60, 70, 40, 30, 80, 90, 50, 100, 110, 120]  

i = 8  
Swapping: 1 and 2   
[60, 40, 70, 30, 80, 90, 50, 100, 110, 120]   
Swapping: 2 and 3   
[60, 40, 30, 70, 80, 90, 50, 100, 110, 120]   
Swapping: 5 and 6   
[60, 40, 30, 70, 80, 50, 90, 100, 110, 120]  

i = 7   
Swapping: 0 and 1   
[40, 60, 30, 70, 80, 50, 90, 100, 110, 120]  
Swapping: 1 and 2   
[40, 30, 60, 70, 80, 50, 90, 100, 110, 120]  
Swapping: 4 and 5   
[40, 30, 60, 70, 50, 80, 90, 100, 110, 120]  

i = 6  
Swapping: 0 and 1   
[30, 40, 60, 70, 50, 80, 90, 100, 110, 120]  
Swapping: 3 and 4   
[30, 40, 60, 50, 70, 80, 90, 100, 110, 120]  

i = 5  
Swapping: 2 and 3   
[30, 40, 50, 60, 70, 80, 90, 100, 110, 120]  

i = 4  

i = 3  

i = 2  

i = 1  