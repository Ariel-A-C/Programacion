package EX_01;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<>();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public T removeFirst() {
        return list.removeFirst();
    }
    public T getFirst() {
        return list.getFirst();
    }
    public void add(T item) {
        list.addFirst(item);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        
        System.out.println("Initial stack: " + stack.toString());
        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("Removed element: " + stack.removeFirst());
        System.out.println("First element: " + stack.getFirst());
        System.out.println("Stack: " + stack.toString());
    }
}