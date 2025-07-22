Extended Euclidean Algorithm (Java)
This repository contains a simple Java implementation of the Extended Euclidean Algorithm. It calculates the greatest common divisor (GCD) of two integers and uses recursion to perform the extended operations based on the Euclidean method.

📌 Description
The program takes two integers as input and uses the Extended Euclidean Algorithm to compute:

The GCD of the two input numbers

(Optionally) The Bézout coefficients x and y such that:
ax + by = gcd(a, b)

🚀 How It Works
The algorithm is implemented recursively.

At each step, it calculates the quotient q and updates the remainders and coefficients until the remainder becomes 0.

The final result is the GCD of the two input numbers.

🖥️ Example Usage
bash
$ javac ExtendedEuclidian.java
$ java ExtendedEuclidian
Enter the first number:
60
Enter the second number:
48
The gcd of (60,48)= 12
📂 Files
ExtendedEuclidian.java – Main class containing the logic for input handling and computing the GCD using recursion.

✅ Features
Recursive implementation

Efficient integer division and remainder tracking

Simple console input/output
