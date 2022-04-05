# Palindrome Check

Write a function that takes in a non-empty string and that returns a boolean representing whether the string is a palindrome.

A palindrome is defined as a string that's written the same forward and backward. Note that single-character strings are palindromes.

**Sample Input**
```
string = "abcdcba"
```

**Sample Output**
```
true // it's written the same forward and backward
```

---

**Hints**
<details>
    <summary>Hint 1</summary>

    Start by building the input string in reverse order and
    comparing this newly built string to the input string. Can you
    do this without using string concatenations?
</details>

<details>
    <summary>Hint 2</summary>

    Can you optimize your algorithm by using recursion? What are
    the implications of recursion on an algorithm's space-time
    complexity analysis?
</details>

<details>
    <summary>Hint 3</summary>

    Go back to an iterative solution and try using pointers to
    solve this problem: start with a pointer at the first index of
    the string and a pointer at the final index of the string.
    What can you do from there?
</details>

---

**Complexities**
<details>
    <summary>Optimal Sapce & Time Complexity</summary>

    O(n) time | O(1) space - where n is the length of the input
    string
</details>