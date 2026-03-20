import java.util.*;

public class PostfixEvaluation {

    static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {

            // If operand (digit)
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // convert char to int
            }

            // If operator
            else {
                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "231*+9-";
        System.out.println(evaluatePostfix(exp));
    }
}