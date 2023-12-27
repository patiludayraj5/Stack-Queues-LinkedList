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
    }
}
