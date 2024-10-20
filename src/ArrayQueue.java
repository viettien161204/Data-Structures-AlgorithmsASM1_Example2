public class ArrayQueue<T> {
    private T[] queue;
    private int front;
    private int rear;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        queue = (T[]) new Object[INITIAL_CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Adds an element to the end of the queue
    public void enqueue(T item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % queue.length; // Circular increment
        queue[rear] = item;
        size++;
    }

    // Removes and returns the element at the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        T item = queue[front];
        queue[front] = null; // Avoid memory leak
        front = (front + 1) % queue.length; // Circular increment
        size--;
        return item;
    }

    // Returns the element at the front of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[front];
    }

    // Returns the element at the rear of the queue without removing it
    public T rear() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[rear];
    }

    // Checks if the queue is full
    public boolean isFull() {
        return size == queue.length;
    }
    // Checks if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }
    // Returns the number of elements in the queue
    public int size() {
        return size;
    }
    // Main method to demonstrate the queue
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        // Enqueue elements
        System.out.println("Enqueuing elements:");
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
            System.out.println("Enqueued: " + i);
        }
        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        System.out.println("\nDequeuing elements:");
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}