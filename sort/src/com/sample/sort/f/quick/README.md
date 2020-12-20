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

[Ferry, Debbie, Alex, Jim, Ely, Irina, George, Big, Martha, Chuck]

Pivot = Ferry
Swapping: 3 and 9 
[Ferry, Debbie, Alex, Chuck, Ely, Irina, George, Big, Martha, Jim]
Swapping: 5 and 7 
[Ferry, Debbie, Alex, Chuck, Ely, Big, George, Irina, Martha, Jim]
Swapping: 0 and 5 
[Big, Debbie, Alex, Chuck, Ely, Ferry, George, Irina, Martha, Jim]

Partitioned: [Big, Debbie, Alex, Chuck, Ely, Ferry, George, Irina, Martha, Jim] around pivot: Ferry

Pivot = Big
Swapping: 1 and 2 
[Big, Alex, Debbie, Chuck, Ely, Ferry, George, Irina, Martha, Jim]
Swapping: 0 and 1 
[Alex, Big, Debbie, Chuck, Ely, Ferry, George, Irina, Martha, Jim]

Partitioned: [Alex, Big, Debbie, Chuck, Ely, Ferry, George, Irina, Martha, Jim] around pivot: Big

Pivot = Debbie
Swapping: 2 and 3 
[Alex, Big, Chuck, Debbie, Ely, Ferry, George, Irina, Martha, Jim]

Partitioned: [Alex, Big, Chuck, Debbie, Ely, Ferry, George, Irina, Martha, Jim] around pivot: Debbie

Pivot = George
Swapping: 6 and 6 
[Alex, Big, Chuck, Debbie, Ely, Ferry, George, Irina, Martha, Jim]

Partitioned: [Alex, Big, Chuck, Debbie, Ely, Ferry, George, Irina, Martha, Jim] around pivot: George

Pivot = Irina
Swapping: 7 and 7 
[Alex, Big, Chuck, Debbie, Ely, Ferry, George, Irina, Martha, Jim]

Partitioned: [Alex, Big, Chuck, Debbie, Ely, Ferry, George, Irina, Martha, Jim] around pivot: Irina

Pivot = Martha
Swapping: 8 and 9 
[Alex, Big, Chuck, Debbie, Ely, Ferry, George, Irina, Jim, Martha]

Partitioned: [Alex, Big, Chuck, Debbie, Ely, Ferry, George, Irina, Jim, Martha] around pivot: Martha

[Alex, Big, Chuck, Debbie, Ely, Ferry, George, Irina, Jim, Martha]