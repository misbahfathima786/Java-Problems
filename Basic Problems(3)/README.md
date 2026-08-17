# Basic Problems (3)

This folder contains **13 Java programs** based on number-system conversions, mathematical operations, coordinate geometry, and permutations.

## 📂 Programs

| No. | Program            | Description                                                   |
| --: | ------------------ | ------------------------------------------------------------- |
|   1 | `DecToOct.java`    | Converts a decimal number into an octal number                |
|   2 | `DecToHex.java`    | Converts a decimal number into a hexadecimal number           |
|   3 | `BinToOct.java`    | Converts a binary number into an octal number through decimal |
|   4 | `OctToBin.java`    | Converts an octal number into a binary number through decimal |
|   5 | `Quadrant.java`    | Determines the quadrant or axis on which a coordinate lies    |
|   6 | `Permutation.java` | Calculates the number of ways N people can occupy R seats     |
|   7 | `HCF.java`         | Finds the Highest Common Factor of two numbers                |
|   8 | `GCD.java`         | Finds the Greatest Common Divisor of two numbers              |
|   9 | `LCM.java`         | Calculates the Least Common Multiple of two numbers           |
|  10 | `BinToDec.java`    | Converts a binary number into a decimal number                |
|  11 | `OctToDec.java`    | Converts an octal number into a decimal number                |
|  12 | `HexToDec.java`    | Converts a hexadecimal number into a decimal number           |
|  13 | `DecToBin.java`    | Converts a decimal number into a binary number                |

## 🧠 Concepts Covered

* Decimal, Binary, Octal and Hexadecimal number systems
* Number-system conversion
* Arithmetic operations
* Modulus and division operations
* Recursion
* Euclidean Algorithm
* Permutations
* Coordinate geometry
* Conditional statements
* Loops
* `Scanner` for user input
* String and character manipulation

## 🔢 Number System Conversions

### Decimal → Binary

`DecToBin.java` converts a decimal number to its binary representation using repeated division by `2`.

### Decimal → Octal

`DecToOct.java` converts a decimal number to octal using repeated division by `8`.

### Decimal → Hexadecimal

`DecToHex.java` converts a decimal number to hexadecimal using repeated division by `16` and hexadecimal digits `0–9` and `A–F`.

### Binary → Decimal

`BinToDec.java` calculates the decimal value using powers of `2`.

### Octal → Decimal

`OctToDec.java` calculates the decimal value using powers of `8`.

### Hexadecimal → Decimal

`HexToDec.java` converts hexadecimal digits into their corresponding decimal values using powers of `16`.

### Binary → Octal

`BinToOct.java` first converts the binary number to decimal and then converts the decimal value to octal.

**Conversion flow:**

`Binary → Decimal → Octal`

### Octal → Binary

`OctToBin.java` first converts the octal number to decimal and then converts the decimal value to binary.

**Conversion flow:**

`Octal → Decimal → Binary`

## 📐 Coordinate Quadrant

`Quadrant.java` determines the position of a point `(x, y)`.

* `x > 0, y > 0` → 1st Quadrant
* `x < 0, y > 0` → 2nd Quadrant
* `x < 0, y < 0` → 3rd Quadrant
* `x > 0, y < 0` → 4th Quadrant
* `x = 0` → Y-Axis
* `y = 0` → X-Axis
* `x = 0, y = 0` → Origin

## 🔢 HCF / GCD

`HCF.java` and `GCD.java` use the **Euclidean Algorithm with recursion**.

The basic idea is:

```text
gcd(a, b) = gcd(b, a % b)
```

The recursion continues until `b = 0`.

## ➗ LCM

`LCM.java` calculates the LCM using the relationship:

```text
LCM(a, b) = (a × b) / HCF(a, b)
```

The HCF is calculated recursively using the Euclidean Algorithm.

## 🪑 Permutation

`Permutation.java` calculates the number of ways in which `N` people can occupy `R` seats.

The formula used is:

```text
nPr = n! / (n-r)!
```

The program calculates the result using multiplication rather than explicitly calculating factorials.

### Example

For:

```text
n = 5
r = 3
```

The number of arrangements is:

```text
5P3 = 5 × 4 × 3 = 60
```

## 💻 Sample Outputs

### Decimal to Binary

```text
Enter a Decimal number : 10
Binary number of 10 = 1010.
```

### Decimal to Octal

```text
Enter a Decimal number : 25
Octal number of 25 = 31.
```

### Decimal to Hexadecimal

```text
Enter a Decimal number : 255
Hexa Decimal number of 255 = FF.
```

### Binary to Decimal

```text
Enter a binary number(0/1) : 1010
Decimal number of 1010 = 10
```

### HCF

```text
Enter two values..
12
18
HCF(12, 18) = 6
```

### LCM

```text
Enter two values..
12
18
LCM(12, 18) = 36
```

### Quadrant

```text
Enter the value of x : 5
Enter the value of y : 8
Coordinate : (5 , 8).
Point lies in the 1st Quadrant.
```

### Permutation

```text
Enter the number of people : 5
Enter the number of available seats : 3
5 people can occupy 3 seats in 60 different ways.
```

## 🛠️ Technologies Used

* **Language:** Java
* **Input:** `Scanner`
* **Concepts:** Loops, Recursion, Conditional Statements, Arithmetic Operations and Number Systems


## 🎯 Purpose

These programs are designed to strengthen fundamental **Java programming, mathematical logic, recursion, number-system conversion, and problem-solving skills**.

---

**Part of my Java programming practice — Basic Problems (3).**
