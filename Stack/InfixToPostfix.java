package com.gla.dsa;
import java.util.*;

public class InfixToPostfix {
        // Function to return precedence
        static int precedence(char ch) {
            switch (ch) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                case '^':
                    return 3;
            }
            return -1;
        }

        // Main conversion function
        static String infixToPostfix(String exp) {
            StringBuilder result = new StringBuilder();
            Stack<Character> stack = new Stack<>();

            for (char ch : exp.toCharArray()) {

                // 1. Operand
                if (Character.isLetterOrDigit(ch)) {
                    result.append(ch);
                }

                // 2. Opening bracket
                else if (ch == '(') {
                    stack.push(ch);
                }

                // 3. Closing bracket
                else if (ch == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        result.append(stack.pop());
                    }
                    stack.pop(); // remove '('
                }

                // 4. Operator
                else {
                    while (!stack.isEmpty() &&
                            precedence(stack.peek()) >= precedence(ch)) {
                        result.append(stack.pop());
                    }
                    stack.push(ch);
                }
            }

            // Pop remaining elements
            while (!stack.isEmpty()) {
                result.append(stack.pop());
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String exp = "a*(b+c)/d";
            System.out.println(infixToPostfix(exp));
        }
}
