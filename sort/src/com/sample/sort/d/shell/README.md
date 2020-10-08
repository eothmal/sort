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
