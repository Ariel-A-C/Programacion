package EX_02;

public class StackArray<T> {
    private Object[] array;
    private int size;

    public StackArray() {
        array = new Object[10];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T removeFirst() {
        T firstItem = (T) array[0];
        System.arraycopy(array, 1, array, 0, size - 1);
        size--;
        return firstItem;
    }

    public T getFirst() {
        return (T) array[0];
    }

    public void add(T item) {
        if (size == array.length) {
            System.out.print("ERROR: array is full");
        } else {
            System.arraycopy(array, 0, array, 1, size);
            array[0] = item;
            size++;
        }
    }

    @Override
    public String toString() {
        String strArray = "";
        for (int i = 0; i < size; i++) {
            strArray += (array[i]);
            if (i < size - 1) {
                strArray += (", ");
            }
        }
        return strArray;
    }

    public static void main(String[] args) {
        StackArray<Integer> stack = new StackArray<>();
        
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
