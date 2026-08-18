# Basic Problems (4)

This folder contains **13 Java programs** based on mathematical calculations, number manipulation, digit operations, and basic problem-solving concepts.

## 📂 Programs Included

| No. | Program                           | Description                                                                                |
| --: | --------------------------------- | ------------------------------------------------------------------------------------------ |
|   1 | **Digits of Occurrence**          | Counts how many times a given digit occurs in a number.                                    |
|   2 | **Roots of a Quadratic Equation** | Calculates the real roots of a quadratic equation using the discriminant.                  |
|   3 | **Number to Words**               | Converts the digits of a number into their corresponding words.                            |
|   4 | **Count Possible Decodings**      | Calculates the number of possible ways a given digit sequence can be decoded.              |
|   5 | **Exactly X Divisors**            | Finds the number of integers up to a given limit that have exactly `X` divisors.           |
|   6 | **Maximum Handshakes**            | Calculates the maximum number of handshakes possible among a given number of people.       |
|   7 | **Addition of Fractions**         | Calculates the sum of two fractions using the common denominator method.                   |
|   8 | **Replace 0's With 1's**          | Replaces every `0` digit in an integer with `1`.                                           |
|   9 | **Sum of Two Prime Numbers**      | Checks whether a number can be expressed as the sum of two prime numbers.                  |
|  10 | **Area of a Circle**              | Calculates the area of a circle using its radius.                                          |
|  11 | **Prime Numbers from 1 to 100**   | Finds and displays all prime numbers between 1 and 100.                                    |
|  12 | **Count Number of Digits**        | Counts the number of digits present in a given integer.                                    |
|  13 | **Number of Days in a Month**     | Determines the number of days in a given month, including leap-year handling for February. |

## 🧠 Concepts Practiced

* `Scanner` for user input
* `if-else` statements
* `switch` statements
* `for` loops
* `while` loops
* Nested loops
* Arithmetic operators
* Modulus operator (`%`)
* Mathematical formulas
* Methods and return values
* Boolean conditions
* String manipulation
* `StringBuilder`
* Recursion
* Prime number checking
* Digit extraction and manipulation
* Leap year calculation

## 📌 Problems Covered

### 1. Digits of Occurrence

The program extracts each digit of a number and counts how many times a specified digit occurs.

### 2. Roots of a Quadratic Equation

The program calculates the discriminant:

```text
D = b² - 4ac
```

Based on the value of `D`:

* `D > 0` → Two distinct real roots
* `D = 0` → One repeated real root
* `D < 0` → No real roots

### 3. Number to Words

The program converts individual digits of a number into their corresponding English words.

Example:

```text
123 → One Two Three
```

### 4. Count Possible Decodings

The program finds the number of possible ways to decode a digit sequence where:

```text
1 → A
2 → B
...
26 → Z
```

This program uses **recursion** to explore different decoding possibilities.

### 5. Integers Having Exactly X Divisors

The program checks every integer from `1` to a given limit and counts its divisors. It then determines how many integers have exactly `X` divisors.

### 6. Maximum Handshakes

For `n` people, the maximum number of handshakes is calculated using:

```text
n × (n - 1) / 2
```

Each pair of people can shake hands exactly once.

### 7. Addition of Two Fractions

For two fractions:

```text
a/b + c/d
```

the program calculates:

```text
(a × d + c × b) / (b × d)
```

### 8. Replace All 0's With 1's

The program extracts each digit and replaces every `0` with `1`.

Example:

```text
Input:  102030
Output: 112131
```

### 9. Sum of Two Prime Numbers

The program checks whether a given number can be represented as the sum of two prime numbers.

Example:

```text
10 = 3 + 7
```

### 10. Area of a Circle

The area is calculated using:

```text
Area = π × r²
```

### 11. Prime Numbers from 1 to 100

The program checks every number from `1` to `100` and displays the numbers that are prime.

### 12. Count Number of Digits

The program repeatedly divides the number by `10` until it becomes `0`, counting the number of divisions.

### 13. Number of Days in a Month

The program uses a `switch` statement to determine the number of days in a month.

February is handled separately using the leap-year condition:

```java
year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
```

## 🎯 Purpose

These programs are designed to strengthen **Java fundamentals and mathematical problem-solving skills** through practical problems involving numbers, digits, formulas, recursion, conditions, and loops.

> **Language:** Java
> **Folder:** `Basic Problems(4)`
