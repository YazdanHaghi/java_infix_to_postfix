Infix to Postfix Converter
This repository contains the Java code for a program that converts infix expressions to postfix expressions.

Infix Notation:  Operators (+, -, *, /) are placed between operands (letters).
Postfix Notation: Operators are placed after operands.

The program utilizes a stack data structure to achieve the conversion.

Features:

Supports basic arithmetic operators (+, -, *, /).
Handles parentheses for proper operator precedence.
Validates input for uppercase letters only.
Provides informative error messages for invalid input.
Getting Started:

Clone the Repository: Use git clone https://github.com/YazdanHaghi/java_infix_to_postfix.git to clone the repository locally.
Compile and Run:
Navigate to the project directory.
Run javac proje4.java to compile the code.
Run java proje4 to initiate the program.
Input: Enter an infix expression using uppercase letters for operands.
Example:

Input (infix): A + B * C - (D / E)
Output (postfix): ABC*+DE/-
Potential Enhancements:

Implement unit testing to ensure code correctness.
Extend support to include a wider range of mathematical operators.
Broaden error handling to encompass additional invalid input scenarios.
Contribution

Feel free to contribute to this project by forking the repository and submitting pull requests.
