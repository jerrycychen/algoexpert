# Insertion Sort

Write a function that takes in an array of integers and returns a sorted version of that array. Use the Insertion Sort algorithm to sort the array.

If you're unfamiliar with Insertion Sort, we recommend watching the Conceptual Overview section of this question's video explanation before starting to code.

**Sample Input**
```
array = [8, 5, 2, 9, 5, 6, 3]
```

**Sample Output**
```
[2, 3, 5, 5, 6, 8, 9]
```

---

**Hints**
<details>
    <summary>Hint 1</summary>

    Devide the input array into two subarrays in place. The first element 
    subarray should be sorted at all times and should start with a length 
    of 1, while the second subarray should be unsorted. Iterate through 
    the unsorted subarray, inserting all of its elements into the sorted 
    subarray in the correct position by swapping them into place, 
    Eventually, the entire array will be sorted.
</details>

---

**Complexities**
<details>
    <summary>Optimal Sapce & Time Complexity</summary>

    Best: O(n) time | O(1) space - where n is the length of the input
    arrays

    Average: O(n^2) time | O(1) space - where n is the length of the
    input arrays

    Worst: O(n^2) time | O(1) space - where n is the length of the input
    arrays
</details>