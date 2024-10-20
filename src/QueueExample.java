import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public Queue<String> createQueue() {
        Queue<String> color = new LinkedList<>();
        color.add("red");
        color.add("blue");
        color.add("green");
        color.add("brown");
        color.add("black");
        return color;
    }

    public void showQueue(Queue<String> color) {
        System.out.println("Queue: " + color);
    }

    public void insertDataQueue(Queue<String> queue) {
        queue.offer("white");
        queue.offer("pink");
        queue.offer("yellow");
        System.out.println("After inserting new colors: " + queue);
    }

    public void checkSize(Queue<String> queue) {
        int size = queue.size();
        System.out.println("Size of queue is: " + size);
    }

    public void checkEmpty(Queue<String> queue) {
        boolean check = queue.isEmpty();
        if (check)
            System.out.println("Queue is empty");
        else
            System.out.println("Queue is not empty");
    }

    public void getElementQueue(Queue<String> queue) {
        String element = queue.element();
        System.out.println("Front element is: " + element);
    }

    public void getElementQueue2(Queue<String> queue) {
        String data = queue.peek();
        System.out.println("Front element using peek: " + data);
    }

    public void removeElement(Queue<String> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            String data = queue.remove();
            System.out.println("Removed element: " + data);
        }
    }

    public void removeElement2(Queue<String> queue) {
        String data2 = queue.poll();
        System.out.println("Removed element using poll: " + data2);
    }

    public void loopElement(Queue<String> queue) {
        System.out.println("Iterating through queue:");
        for (String item : queue) {
            System.out.println("Data item: " + item);
        }
    }

    public boolean isQueueFull(Queue<String> queue) {
        // Check if the queue has reached a maximum capacity (for demo purposes, let's say 10)
        return queue.size() == 10;
    }

    public void addToQueue(Queue<String> queue, String element) {
        if (isQueueFull(queue)) {
            System.out.println("Queue is full, cannot add more elements.");
        } else {
            queue.offer(element);
            System.out.println("Added '" + element + "' to the queue.");
        }
    }

    public static void main(String[] args) {
        QueueExample example = new QueueExample();

        // Create a queue and show its initial state
        Queue<String> colorQueue = example.createQueue();
        example.showQueue(colorQueue);

        // Insert additional colors
        example.insertDataQueue(colorQueue);
        example.checkSize(colorQueue);

        // Check the front element
        example.getElementQueue(colorQueue);
        example.getElementQueue2(colorQueue);

        // Remove elements
        example.removeElement(colorQueue);
        example.removeElement2(colorQueue);

        // Show the queue after removals
        example.showQueue(colorQueue);

        // Check if the queue is empty
        example.checkEmpty(colorQueue);

        // Loop through the elements in the queue
        example.loopElement(colorQueue);
    }
}