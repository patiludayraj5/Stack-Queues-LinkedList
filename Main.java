import java.util.LinkedList;

class Queue {
    private LinkedList<Integer> list;

    // Constructor to initialize the linked list
    public Queue() {
        list = new LinkedList<>();
    }

    // Enqueue operation to add an element to the queue
    public void enqueue(int value) {
        // Adding elements to the end of the linked list
        list.addLast(value);
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Display the elements of the queue
    public void display() {
        System.out.print("Queue: ");
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a queue
        Queue queue = new Queue();

        // Enqueue elements into the queue
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Display the queue
        queue.display();
    }
}
