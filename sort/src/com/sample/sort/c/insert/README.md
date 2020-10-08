This sort first assumes a sorted list of size 1 an insert additional elements in the right posisition.  
In the worst case (if the list is originally sorted in descending order).   
"N" elements are checked and swapped  for every selected element to get to the right position.  
Checking "N" elements foe each of "N" selected elements.  
O(N^2)  
It is a stable sort -   
It takes O(1) extra space, it is sort in place.  
It makes O(N^2) comparisons and O(N^2) swaps.   

[4, 5, 3, 2, 1, 0, 6, 8, 9, 7]

Insert Sort : 0 to 1  
Compare: 0 and 1   

Insert Sort : 0 to 2  
Compare: 1 and 2 <-> Swapped!  
[4, 3, 5, 2, 1, 0, 6, 8, 9, 7]
Compare: 0 and 1 <-> Swapped!  
[3, 4, 5, 2, 1, 0, 6, 8, 9, 7]

Insert Sort : 0 to 3  
Compare: 2 and 3 <-> Swapped!  
[3, 4, 2, 5, 1, 0, 6, 8, 9, 7]
Compare: 1 and 2 <-> Swapped!  
[3, 2, 4, 5, 1, 0, 6, 8, 9, 7]
Compare: 0 and 1 <-> Swapped!  
[2, 3, 4, 5, 1, 0, 6, 8, 9, 7]

Insert Sort : 0 to 4  
Compare: 3 and 4 <-> Swapped!  
[2, 3, 4, 1, 5, 0, 6, 8, 9, 7]
Compare: 2 and 3 <-> Swapped!  
[2, 3, 1, 4, 5, 0, 6, 8, 9, 7]
Compare: 1 and 2 <-> Swapped!  
[2, 1, 3, 4, 5, 0, 6, 8, 9, 7]
Compare: 0 and 1 <-> Swapped!  
[1, 2, 3, 4, 5, 0, 6, 8, 9, 7]

Insert Sort : 0 to 5  
Compare: 4 and 5 <-> Swapped!  
[1, 2, 3, 4, 0, 5, 6, 8, 9, 7]
Compare: 3 and 4 <-> Swapped!  
[1, 2, 3, 0, 4, 5, 6, 8, 9, 7]
Compare: 2 and 3 <-> Swapped!  
[1, 2, 0, 3, 4, 5, 6, 8, 9, 7]
Compare: 1 and 2 <-> Swapped!  
[1, 0, 2, 3, 4, 5, 6, 8, 9, 7]
Compare: 0 and 1 <-> Swapped!  
[0, 1, 2, 3, 4, 5, 6, 8, 9, 7]

Insert Sort : 0 to 6  
Compare: 5 and 6   

Insert Sort : 0 to 7  
Compare: 6 and 7   

Insert Sort : 0 to 8  
Compare: 7 and 8   

Insert Sort : 0 to 9  
Compare: 8 and 9 <-> Swapped!  
[0, 1, 2, 3, 4, 5, 6, 8, 7, 9]
Compare: 7 and 8 <-> Swapped!  
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
