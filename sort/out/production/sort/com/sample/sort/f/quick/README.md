This is once again a divide and conquer algorithm that partitions the list at every step.
The partition is not based on the length or an artificial index, it's based on pivot.
The pivot is an element from the list.
The list is partitioned with all elements smaller than the pivot on the other. 
1. On the right of the pivot find the first element smaller that the pivot.
2. Swap that element with the pivot.
3. On the left of the pivot, find the first element larger than the pivot.
4. Swap that element with the pivot.
#
- Quick sort uses divide and conquer to create smaller problems that are easier to tackle.
- Just as in the case of other divide ad conquer algorithms (e.g. merge sort) the complexity has to be derived.
The worst case time complexity is O(N^2)
The average case time complexity is O(N logN)

