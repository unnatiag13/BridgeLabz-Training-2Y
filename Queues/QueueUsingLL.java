package Queues;

public class QueueUsingLL<T> {

    // Node class
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    // Constructor
    public QueueUsingLL() {
        front = rear = null;
        size = 0;
    }

    // Check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Enqueue (push)
    public void push(T data) {
        Node newNode = new Node(data);

        if (rear == null) {  // queue empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    // Dequeue (pop)
    public T pop() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return null;
        }

        T value = front.data;
        front = front.next;

        if (front == null) { // queue becomes empty
            rear = null;
        }

        size--;
        return value;
    }

    // Peek
    public T peek() {
        if (isEmpty()) return null;
        return front.data;
    }

    // Size
    public int size() {
        return size;
    }
}