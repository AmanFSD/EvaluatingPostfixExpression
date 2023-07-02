Evaluating Postfix Expressions using Stack

In the field of computer science, postfix notation (also known as Reverse Polish Notation) is a mathematical notation in which every operator follows all of its operands. It is parenthesis-free as long as the operators have a fixed number of operands.

For example:
Infix expression: 2 * (3 + 4)
Postfix expression: 2 3 4 + *

Your task is to create a program that can evaluate these postfix expressions. Here are the details of your assignment:

Create a Stack class with the necessary methods like push(), pop(), isEmpty(), top(), etc. If you are using a language like Java, you can utilize its built-in Stack class.

Create a PostfixEvaluator class that has a method evaluate(String expression). This method should accept a string which represents the postfix expression. This string will contain numbers and operators separated by spaces. The operators that your evaluator needs to support are '+', '-', '*', and '/'.

When evaluating the postfix expression, you should scan from left to right. Numbers should be pushed onto the stack. When an operator is encountered, pop the top two elements from the stack, perform the operation, and push the result back onto the stack.

When the expression has been fully scanned, the final result should be the only element left in the stack. If there are more elements left in the stack, this means the expression was not properly formatted.

Your program should be able to handle incorrect expressions by throwing and catching exceptions appropriately.

Create a main() method to demonstrate your program. The user should be able to enter a postfix expression and your program should print out the result of the expression.

Remember, you should use a stack to perform the calculations and not try to convert the postfix expression to infix or use eval-like functions.

This assignment tests your understanding of stacks, string manipulation, exception handling, and Object-Oriented Programming (OOP).

Tips:

Be mindful of the order in which you pop the operands from the stack when performing operations.
Take care when handling division, as division by zero should be properly handled as an error.
Consider using the split() function to divide the expression into numbers and operators.
Example:

Input: "2 3 4 + *"
Output: 14

In the given example, 3 and 4 are added to give 7, then 7 is multiplied by 2 to give 14.