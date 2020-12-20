A modified version of the insertion sort.  
Rather than comparing adjacent elements a certain interval apart are compared.  
Exp:   
N=10  
Shell increment N/4 = 2  
The increment sequence: 0 to 2, 1 to 3...  
Shell sort uses insertion sort - the entire list divided and those sub-lists are sorted.  
Getting the exact complexity of shell sort is hard because it depends on the increment value chosen.  
The best increment is N/2, N/4..1  
Shell sort complexity is better than insertion sort as the final iteration with increment = 1 has to work with a nearly sorted list.  
The complexity of shell sort is somewhere between O(N) and O(N^2). 
  
Example:  
[60, 70, 80, 40, 30, 90, 120, 50, 100, 110]  

i = 0 increment = 5  

i = 1 increment = 5  

i = 2 increment = 5  
Swapping 7 and 2   
[60, 70, 80, 40, 30, 90, 50, 120, 100, 110]  

i = 3 increment = 5  

i = 4 increment = 5  

i = 0 increment = 2  

i = 1 increment = 2  
Swapping 3 and 1 
[60, 70, 40, 80, 30, 90, 50, 120, 100, 110]  

i = 2 increment = 2  
Swapping 4 and 2  
[60, 70, 40, 30, 80, 90, 50, 120, 100, 110]  
Swapping 2 and 0  
[60, 40, 70, 30, 80, 90, 50, 120, 100, 110]  

i = 3 increment = 2  

i = 4 increment = 2  
Swapping 6 and 4  
[60, 40, 70, 30, 80, 50, 90, 120, 100, 110]  

i = 5 increment = 2  

i = 6 increment = 2  

i = 7 increment = 2  
Swapping 9 and 7   
[60, 40, 70, 30, 80, 50, 90, 120, 110, 100]  

i = 0 increment = 1  
Swapping 1 and 0   
[40, 60, 70, 30, 80, 50, 90, 120, 110, 100]  

i = 1 increment = 1  

i = 2 increment = 1  
Swapping 3 and 2   
[40, 60, 30, 70, 80, 50, 90, 120, 110, 100]  
Swapping 2 and 1  
[40, 30, 60, 70, 80, 50, 90, 120, 110, 100]  
Swapping 1 and 0   
[30, 40, 60, 70, 80, 50, 90, 120, 110, 100]  

i = 3 increment = 1  

i = 4 increment = 1  
Swapping 5 and 4 
[30, 40, 60, 70, 50, 80, 90, 120, 110, 100]  
Swapping 4 and 3  
[30, 40, 60, 50, 70, 80, 90, 120, 110, 100]  
Swapping 3 and 2   
[30, 40, 50, 60, 70, 80, 90, 120, 110, 100]  

i = 5 increment = 1  

i = 6 increment = 1  

i = 7 increment = 1  
Swapping 8 and 7   
[30, 40, 50, 60, 70, 80, 90, 110, 120, 100]  

i = 8 increment = 1  
Swapping 9 and 8   
[30, 40, 50, 60, 70, 80, 90, 110, 100, 120]  
Swapping 8 and 7  
[30, 40, 50, 60, 70, 80, 90, 100, 110, 120]  
 
