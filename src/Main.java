import java.util.Stack;

class PostfixEvaluator {

    public int evaluate(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] elements = expression.split(" ");

        for (String element : elements) {
            if (isOperator(element)) {
                int num2 = stack.pop(); // the operand order matters for division and subtraction
                int num1 = stack.pop();

                switch (element) {
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        stack.push(num1 - num2);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        if (num2 == 0) throw new ArithmeticException("Cannot divide by zero");
                        stack.push(num1 / num2);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(element));
            }
        }

        if (stack.size() != 1) throw new IllegalArgumentException("Invalid expression");
        return stack.pop();
    }

    private boolean isOperator(String element) {
        return element.equals("+") || element.equals("-") || element.equals("*") || element.equals("/");
    }
}

public class Main {
    public static void main(String[] args) {
        PostfixEvaluator evaluator = new PostfixEvaluator();
        System.out.println(evaluator.evaluate("2 3 4 + *"));  // prints 14
        System.out.println(evaluator.evaluate("5 6 7 * + 1 -"));  // prints 46
    }
}
