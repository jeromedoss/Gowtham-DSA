package org.example;

public class ArrayCircularQueue<T> {

    private T[] arr;
    private static final int capacity = 10;
    private int size;
    private int front;
    private int rear;
    @SuppressWarnings("unchecked")
    public ArrayCircularQueue(){
        arr = (T[]) new Object[10];
        size = 0;
        front = 0;
        rear = -1;
    }
    public void enqueue(T val){
        if(size == capacity){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        rear = (rear + 1)%capacity;
        arr[rear] = val;
        size++;
    }

    public T dequeue(){
        if(size == 0){
            throw new IndexOutOfBoundsException("queue is empty");
        }
        T temp = arr[front];
        front = (front + 1)% capacity;
        size --;
        return temp;
    }
}
