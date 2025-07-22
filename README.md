# Extended Euclidean Algorithm (Java)

This repository contains a simple Java implementation of the **Extended Euclidean Algorithm**. It calculates the **greatest common divisor (GCD)** of two integers using recursion based on the Euclidean method.

## 📌 Description

The program takes two integers as input and uses the Extended Euclidean Algorithm to compute:

- The **GCD** of the two input numbers  
- (Optionally) This algorithm can be extended to find Bézout coefficients `x` and `y` such that: ax + by = gcd(a, b)

This version currently focuses on computing and returning the GCD.

## 💡 How It Works

- The algorithm uses a recursive approach.
- At each step, it performs integer division and updates the coefficients and remainders.
- The process continues until the remainder becomes 0, and the last non-zero remainder is the GCD.

## 🖥️ Example Usage

$ javac ExtendedEuclidian.java
$ java ExtendedEuclidian
Enter the first number:
60
Enter the second number:
48
The gcd of (60,48)= 12

## 📂 File Structure

- `ExtendedEuclidian.java` – Java class containing recursive implementation for computing GCD.

## ✅ Features

- Accepts user input from console
- Recursive implementation
- Efficient and clean approach to GCD computation

## 🔧 Requirements

- Java 8 or higher
- Command-line interface (CLI) for input/output

---
Feel free to fork the repo, improve the code, and submit pull requests! 💻✨

