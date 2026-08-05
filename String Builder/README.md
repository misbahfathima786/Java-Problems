# 🌟 Java StringBuilder Programs

This folder contains **3 beginner-friendly Java programs** that demonstrate the usage of the **StringBuilder** class for efficient string manipulation. These programs cover common operations such as calculating string lengths, replacing characters, and extracting usernames from email addresses.

---

# 1. Total Length of Strings Using StringBuilder

## 📝 Description
This program accepts multiple strings from the user, stores them in an array, displays the length of each string, appends all strings using `StringBuilder`, and finally prints the total length of the combined string.

### ✨ Features
- Accepts multiple string inputs
- Stores strings in an array
- Displays the length of each string
- Appends all strings using `StringBuilder`
- Prints the total length of the combined string

### 💻 Concepts Used
- Java
- Scanner Class
- Arrays
- StringBuilder
- Loops
- String Length

### 📥 Sample Input
```
Enter the size of an array : 3
Java
Programming
Language
```

### 📤 Sample Output
```
Length of Java is = 4
Length of Programming is = 11
Length of Language is = 8
Total Length = 23
```

---

# 2. Replace Character Using StringBuilder

## 📝 Description
This program accepts a string from the user and replaces every occurrence of the character **'e'** with **'i'** using the `StringBuilder` class.

### ✨ Features
- Accepts a string as input
- Replaces all occurrences of 'e' with 'i'
- Uses `setCharAt()` method
- Displays the modified string

### 💻 Concepts Used
- Java
- Scanner Class
- StringBuilder
- Character Manipulation
- Loops

### 📥 Sample Input
```
Enter a string : welcome
```

### 📤 Sample Output
```
Resultant String after replacement of character = wilcomi
```

---

# 3. Extract Username from Email

## 📝 Description
This program accepts an email address from the user and extracts the username by removing everything from the **'@'** symbol onwards using the `StringBuilder` class.

### ✨ Features
- Accepts an email address
- Extracts the username
- Uses `delete()` method of `StringBuilder`
- Displays the username

### 💻 Concepts Used
- Java
- Scanner Class
- StringBuilder
- Character Search
- String Manipulation

### 📥 Sample Input
```
Enter an email : john123@gmail.com
```

### 📤 Sample Output
```
Username = john123
```

---

## 🎯 Learning Outcomes

After completing these programs, you will understand:
- How to create and use a `StringBuilder`
- How to append strings efficiently
- How to modify characters using `setCharAt()`
- How to remove a portion of a string using `delete()`
- The advantages of `StringBuilder` over immutable `String` objects
- Practical applications of `StringBuilder` in Java string manipulation