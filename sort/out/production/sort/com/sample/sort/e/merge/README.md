Follow the divide and conquer approach to create smaller sub-problem.
A list broken down into smaller and smaller parts recursively.
At some point there will be a list of length one.
Considered as sorted list.
Then merge the sorted lists together to get the fully sorted list.
To calculate the complexity we need to consider the recursive step where the problem is divided into two and 
the merge of teo lists on N/2 lenght.
The complexity if mere sort is O(N logN).
- Merge sort is not adaptive. 
- it is a stable sort.
- It take O(N) extra space when we use array (all smaller lists we create in the divide phase)