import java.util.LinkedList;

class Stack {
    private LinkedList<Integer> list;

    // Constructor to initialize the linked list
    public Stack() {
        list = new LinkedList<>();
    }

    // Push operation to add an element to the stack
    public void push(int value) {
        // Adding elements to the front of the linked list
        list.addFirst(value);
    }

    // Pop operation to remove and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        // Removing and returning the first element of the linked list
        return list.removeFirst();
    }

    // Peek operation to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        // Returning the first element of the linked list without removing it
        return list.getFirst();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Display the elements of the stack
    public void display() {
        System.out.print("Stack: ");
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a stack
        Stack stack = new Stack();

        // Push elements onto the stack
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Display the stack
        stack.display();

        // Peek and pop until the stack is empty
        while (!stack.isEmpty()) {
            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
            stack.display();
        }
    }
}
