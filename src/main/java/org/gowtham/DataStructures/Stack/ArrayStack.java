package org.example;

public class ArrayStack<T> {
    private T[] arr;
    private static final int capacity = 1000;
    private int top;
    @SuppressWarnings("unchecked")
    public ArrayStack(){
        arr = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T val){
        if(top == capacity - 1){
            throw new StackOverflowError("stack is full");
        }
        arr[++top] = val;
    }

    public T pop(){
        if(top < 0){
            throw new StackOverflowError("stack is empty");
        }
        return arr[top--];
    }

    public T peek(){
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
