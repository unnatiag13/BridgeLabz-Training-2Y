package Queues;

import java.util.Stack;

public class queueUsingTwoStacks {
    
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    // Constructor
    public queueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Push (enqueue)
    public void push(int x) {
        stack1.push(x);
    }

    // Pop (dequeue)
    public int pop() {
        if (empty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Peek
    public int peek() {
        if (empty()) {
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    // Check empty
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}