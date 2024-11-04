package LR6;

public class Stack<T> {
    private T[] data;
    private int size;

    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public void push(T element) {
        data[size] = element;
        size++;
    }

    public T pop() {
        return data[--size];
    }

    public T peek() {
        return data[size - 1];
    }
    public static void main(String[] args){
        Stack<String> stack = new Stack<>(10);
        stack.push("apple");
        stack.push("orange");
        stack.push("grape");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push("banana");
        System.out.println(stack.pop());
    }
}
