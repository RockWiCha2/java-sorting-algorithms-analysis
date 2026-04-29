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
        // push item
        Node<T> node = new Node<>(item);
        node.next = top;
        top = node;
    }

    public T pop() {
        // pop item
        if (isEmpty()) return null;

        T value = top.data;
        top = top.next;
        return value;
    }

    public boolean isEmpty() {
        // check empty
        return top == null;
    }

    public T peek() {
        // view top
        return isEmpty() ? null : top.data;
    }
}