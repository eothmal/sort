It sorts in place, it takes O(1) space
It makes O(N^2) comparison and O(N^2) swap
It is not stable sort - entities that are equal might be rearranged
It is not an adaptive sort, even when the list is sorted the process continues.
Example:
[60, 70, 80, 40, 30, 90, 120, 50, 100, 110]

i = 0
Swapping: 0 and 3 
[40, 70, 80, 60, 30, 90, 120, 50, 100, 110]
Swapping: 0 and 4 
[30, 70, 80, 60, 40, 90, 120, 50, 100, 110]

i = 1
Swapping: 1 and 3 
[30, 60, 80, 70, 40, 90, 120, 50, 100, 110]
Swapping: 1 and 4 
[30, 40, 80, 70, 60, 90, 120, 50, 100, 110]

i = 2
Swapping: 2 and 3 
[30, 40, 70, 80, 60, 90, 120, 50, 100, 110]
Swapping: 2 and 4 
[30, 40, 60, 80, 70, 90, 120, 50, 100, 110]
Swapping: 2 and 7 
[30, 40, 50, 80, 70, 90, 120, 60, 100, 110]

i = 3
Swapping: 3 and 4 
[30, 40, 50, 70, 80, 90, 120, 60, 100, 110]
Swapping: 3 and 7 
[30, 40, 50, 60, 80, 90, 120, 70, 100, 110]

i = 4
Swapping: 4 and 7 
[30, 40, 50, 60, 70, 90, 120, 80, 100, 110]

i = 5
Swapping: 5 and 7 
[30, 40, 50, 60, 70, 80, 120, 90, 100, 110]

i = 6
Swapping: 6 and 7 
[30, 40, 50, 60, 70, 80, 90, 120, 100, 110]

i = 7
Swapping: 7 and 8 
[30, 40, 50, 60, 70, 80, 90, 100, 120, 110]

i = 8
Swapping: 8 and 9 
[30, 40, 50, 60, 70, 80, 90, 100, 110, 120]

i = 9
