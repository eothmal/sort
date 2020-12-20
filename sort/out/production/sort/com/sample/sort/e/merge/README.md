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

Example:
[Ferry, Debbie, Alex, Jim, Ely, Irina, George, Big, Martha, Chuck]

 Split: [Ferry, Debbie, Alex, Jim, Ely]  [Irina, George, Big, Martha, Chuck]

 Split: [Ferry, Debbie, Alex]  [Jim, Ely]

 Split: [Ferry, Debbie]  [Alex]

 Split: [Ferry]  [Debbie]

Merged: [Debbie, Ferry]

Merged: [Alex, Debbie, Ferry]

 Split: [Jim]  [Ely]

Merged: [Ely, Jim]

Merged: [Alex, Debbie, Ely, Ferry, Jim]

 Split: [Irina, George, Big]  [Martha, Chuck]

 Split: [Irina, George]  [Big]

 Split: [Irina]  [George]

Merged: [George, Irina]

Merged: [Big, George, Irina]

 Split: [Martha]  [Chuck]

Merged: [Chuck, Martha]

Merged: [Big, Chuck, George, Irina, Martha]

Merged: [Alex, Big, Chuck, Debbie, Ely, Ferry, George, Irina, Jim, Martha]