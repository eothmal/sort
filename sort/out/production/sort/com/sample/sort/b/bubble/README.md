It takes O(1) extra space, it is sort in place.
It makes O(N^2) comparison and O(N^2) swaps.
It is a stable sort - entities that are equal are not rearranged.
It is an adaptive sort - when the list is sorted, it is possible to break out of the sort early.

Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. The algorithm, which is a comparison sort, is named for the way smaller or larger elements "bubble" to the top of the list.
  
Example:  
[4, 5, 3, 2, 1, 0, 6, 8, 9, 7]  

i = 9  
Compare: 0 and 1     
Compare: 1 and 2   <-> Swapped!    
[4, 3, 5, 2, 1, 0, 6, 8, 9, 7]  

i = 8  
Compare: 0 and 1   <-> Swapped!    
[3, 4, 5, 2, 1, 0, 6, 8, 9, 7]  

i = 7  
Compare: 0 and 1     
Compare: 1 and 2     
Compare: 2 and 3   <-> Swapped!    
[3, 4, 2, 5, 1, 0, 6, 8, 9, 7]  

i = 6  
Compare: 0 and 1     
Compare: 1 and 2   <-> Swapped!    
[3, 2, 4, 5, 1, 0, 6, 8, 9, 7]  

i = 5  
Compare: 0 and 1   <-> Swapped!    
[2, 3, 4, 5, 1, 0, 6, 8, 9, 7]  

i = 4  
Compare: 0 and 1     
Compare: 1 and 2   
Compare: 2 and 3   
Compare: 3 and 4   <-> Swapped!  
[2, 3, 4, 1, 5, 0, 6, 8, 9, 7]  

i = 3  
Compare: 0 and 1   
Compare: 1 and 2   
Compare: 2 and 3   <-> Swapped!  
[2, 3, 1, 4, 5, 0, 6, 8, 9, 7]  

i = 2  
Compare: 0 and 1   
Compare: 1 and 2   <-> Swapped!  
[2, 1, 3, 4, 5, 0, 6, 8, 9, 7]  

i = 1  
Compare: 0 and 1   <-> Swapped!  
[1, 2, 3, 4, 5, 0, 6, 8, 9, 7]  
