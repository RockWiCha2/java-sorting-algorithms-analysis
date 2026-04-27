public class Stack<T> {

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    public void push(T item) {
        // TODO: Push logic
    }

    public T pop() {
        // TODO: Pop logic
        return null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T peek() {
        // Optional
        return isEmpty() ? null : top.data;
    }
}
