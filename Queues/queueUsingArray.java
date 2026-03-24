package Queues;

public class QueueUsingArray<T> {
    private T[] arr;
    private int front;
    private int back;
    private int size;
    private int capacity;

    // Constructor
    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        arr = (T[]) new Object[capacity]; // generic array creation
        front = 0;
        back = -1;
        size = 0;
    }

    // Check full
    public boolean isFull() {
        return size == capacity;
    }

    // Check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Push (enqueue)
    public void push(T data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        back = (back + 1) % capacity;  // circular increment
        arr[back] = data;
        size++;
    }

    // Pop (dequeue)
    public T pop() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return null;
        }
        T value = arr[front];
        arr[front] = null;
        front = (front + 1) % capacity; // circular increment
        size--;
        return value;
    }

    // Peek
    public T peek() {
        if (isEmpty()) return null;
        return arr[front];
    }
}