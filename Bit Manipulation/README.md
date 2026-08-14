# Bit Manipulation

This folder contains **5 Java programs** based on **Bit Manipulation** concepts. These programs demonstrate how bitwise operators can be used to perform efficient operations on integers and binary representations.

## 📂 Programs Included

| No. | Program                         | Description                                                                                  |
| --: | ------------------------------- | -------------------------------------------------------------------------------------------- |
|   1 | **Power of 2**                  | Checks whether a given number is a power of 2 using bitwise AND.                             |
|   2 | **Toggle**                      | Toggles a specific bit at a given position using XOR and a bit mask.                         |
|   3 | **Number of 1's**               | Counts the number of set bits (`1`s) in the binary representation using `n & (n - 1)`.       |
|   4 | **Decimal ↔ Binary Conversion** | Converts a decimal number to binary and a binary number to decimal using bitwise operations. |
|   5 | **Unique Number**               | Finds the unique number in an array using the XOR operation.                                 |

## 🧠 Concepts Practiced

* Bitwise AND (`&`)
* Bitwise OR (`|`)
* Bitwise XOR (`^`)
* Left Shift (`<<`)
* Right Shift (`>>`)
* Bit Masking
* Set Bits
* Binary Representation
* XOR properties
* Array traversal
* User-defined methods
* `StringBuilder`
* `Scanner` for user input

## 📌 Bit Manipulation Techniques Covered

### 1. Power of 2

A positive number is a power of 2 if:

```java
(n & (n - 1)) == 0
```

This works because powers of 2 have exactly **one set bit** in their binary representation.

### 2. Toggle a Bit

The program uses a bit mask:

```java
1 << pos
```

and XOR:

```java
n ^ bitMasking
```

XOR toggles the selected bit:

* `0 → 1`
* `1 → 0`

### 3. Number of 1's

The expression:

```java
n = n & (n - 1);
```

removes the **rightmost set bit** from the number. Repeating this operation allows the program to count the number of `1`s efficiently.

### 4. Decimal ↔ Binary Conversion

The program demonstrates both conversions:

* **Decimal → Binary** using `& 1` and right shift.
* **Binary → Decimal** using bit shifting and bitwise OR.

### 5. Unique Number

The program uses XOR to find the unique element in an array.

Important XOR properties:

```text
n ^ n = 0
n ^ 0 = n
```

Therefore, when every number occurs twice except one number, XORing all elements leaves the unique number.

## 🎯 Purpose

These programs are designed to build a strong foundation in **bitwise operators and bit manipulation techniques in Java**, which are useful for efficient problem-solving and coding interviews.

> **Language:** Java
> **Folder:** `Bit Manipulation`
