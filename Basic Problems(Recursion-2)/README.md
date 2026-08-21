# Basic Problems – Recursion 2

This folder contains **10 problems implemented using recursion in Java**.

These programs focus on different recursion techniques, including **backtracking, string manipulation, array recursion, mathematical recursion, decision-making, and generating possible combinations**.

## 📂 Problems Included

| No. | Problem                                  | File                       |
| --- | ---------------------------------------- | -------------------------- |
| 1   | Remove All Adjacent Duplicate Characters | `RemoveDuplicates.java`    |
| 2   | Generate All Subsets of an Array         | `Subsets.java`             |
| 3   | Palindromic Partitioning                 | `Palindrome.java`          |
| 4   | Generate Parentheses                     | `GenerateParentheses.java` |
| 5   | Factorial of a Number                    | `Factorial.java`           |
| 6   | Pascal's Triangle Row                    | `Pascal.java`              |
| 7   | Last Non-Zero Digit of Factorial         | `LastNonZeroDigit.java`    |
| 8   | Subset Sum                               | `SubsetSum.java`           |
| 9   | Fibonacci Number                         | `Fibonacci.java`           |
| 10  | Binary Strings with More 1s than 0s      | `Binary.java`              |

---

## 1. Remove All Adjacent Duplicate Characters

Removes groups of adjacent duplicate characters from a string using recursion.

### Example

```text
Input:
aaabbccda

Output:
da
```

### Concept Used

* Recursion
* String manipulation
* `substring()`
* Removing consecutive duplicate characters

---

## 2. Generate All Subsets of an Array

Generates all possible subsets of a given array using recursion.

For every element, there are two choices:

* Include the element
* Exclude the element

### Example

```text
Input:
1 2

Output:
[1, 2]
[1]
[2]
[]
```

### Concept Used

* Recursion
* Arrays
* Backtracking
* Include/Exclude approach
* `ArrayList`

---

## 3. Palindromic Partitioning

Generates all possible ways to partition a string such that every substring in the partition is a palindrome.

### Example

```text
Input:
aab

Output:
[a, a, b]
[aa, b]
```

### Concept Used

* Recursion
* Backtracking
* String manipulation
* Palindrome checking
* Partitioning

---

## 4. Generate Parentheses

Generates all valid combinations of `n` pairs of parentheses using recursion.

### Example

```text
Input:
3

Output:
((()))
(()())
(())()
()(())
()()()
```

### Concept Used

* Recursion
* Backtracking
* String generation
* Valid parentheses logic
* Tracking opening and closing parentheses

---

## 5. Factorial of a Number

Calculates the factorial of a number using recursion.

### Example

```text
Input:
5

Output:
Factorial of 5! = 120
```

### Concept Used

* Recursion
* Base case
* Mathematical recursion
* Multiplication through recursive calls

---

## 6. Pascal's Triangle Row

Finds the values in a particular row of Pascal's Triangle using recursion.

### Example

```text
Input:
4

Output:
1 4 6 4 1
```

### Concept Used

* Recursion
* Pascal's Triangle
* Mathematical combinations
* Recursive calculation using previous row values

---

## 7. Last Non-Zero Digit of Factorial

Finds the last non-zero digit of the factorial of a given number.

### Example

```text
Input:
10

Output:
Last non-zero digit of 10! = 8
```

### Concept Used

* Recursion
* Factorial
* Removing trailing zeros
* Modulus operator

---

## 8. Subset Sum

Generates the sum of every possible subset of an array using recursion.

For each element, the program makes two choices:

* Include the element in the sum
* Exclude the element from the sum

### Example

```text
Input:
1 2

Output:
3
1
2
0
```

### Concept Used

* Recursion
* Arrays
* Include/Exclude approach
* Backtracking
* Subset generation

---

## 9. Fibonacci Number

Finds the nth Fibonacci number using recursion.

The Fibonacci sequence is:

```text
0 1 1 2 3 5 8 13 ...
```

### Example

```text
Input:
6

Output:
F(6) th term = 8
```

### Concept Used

* Recursion
* Base cases
* Mathematical recursion
* Multiple recursive calls

---

## 10. Binary Strings with More 1s than 0s

Generates binary strings of length `n` where the number of `1`s is always greater than the number of `0`s at every stage.

### Example

```text
Input:
3

Output:
111
110
101
```

### Concept Used

* Recursion
* Backtracking
* Binary string generation
* Constraint-based recursion
* Tracking the number of `1`s and `0`s

---

## 🧠 Recursion Concepts Covered

Through these 10 problems, the following recursion concepts are practiced:

* Base cases
* Recursive calls
* Multiple recursive calls
* Include/Exclude technique
* Backtracking
* String recursion
* Array recursion
* Mathematical recursion
* Partitioning
* Combination generation
* Constraint-based recursion
* Palindrome checking
* Binary string generation

---

## 🎯 Purpose

The purpose of these programs is to strengthen the understanding of **recursion and backtracking in Java** by solving problems that involve generating different possibilities and making recursive decisions.

These problems provide practice with both **basic recursion** and more advanced recursive techniques such as **backtracking and constraint-based generation**.

---

## 🛠️ Language Used

* **Java**
* **Recursion**
* **Backtracking**
* **ArrayList**
* **Scanner** for user input
