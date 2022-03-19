# Find Three Largest Numbers

Write a function that takes in an array of at least three integers and, without sorting the input array, returns a sorted array of the three largest integers in the input array.

The function should return duplicate integers if necessary; for example, it should return `[10, 10, 12]` for an input array of `[10, 5, 9, 10, 12]`.

**Sample Input**
```
array = [141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7]
```

**Sample Output**
```
[18, 141, 541]
```

---

**Hints**
<details>
    <summary>Hint 1</summary>

    Can you keep track of the three largest numbers in an array as
    you traverse the input array?
</details>

<details>
    <summary>Hint 2</summary>

    Following the suggestion in Hint #1, try traversing the input
    array and updating the three largest numbers if necessary by
    shifting them accordingly.
</details>

---

**Complexities**
<details>
    <summary>Optimal Sapce & Time Complexity</summary>

    O(n) time | O(1) space - where n is the length of the input
    array
</details>