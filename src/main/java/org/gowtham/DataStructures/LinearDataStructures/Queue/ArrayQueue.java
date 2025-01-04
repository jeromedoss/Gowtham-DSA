package org.gowtham.DataStructures.LinearDataStructures.Queue;

public class ArrayQueue<T> {
    private static final int capacity = 1000;
    private T[] arr;
    private int rear;
    @SuppressWarnings("unchecked")
    public ArrayQueue(){
        arr = (T[]) new Object[capacity];
        rear = -1;
    }

    public void enqueue(T val){ //O(1)
        if(rear == capacity - 1){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        arr[++rear] = val;
    }

    public T dequeue(){//O(n)
        if(rear == - 1){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        T temp = arr[0];
        for(int i = 1; i <= rear; i++){
            arr [i - 1] = arr[i];
        }
        rear--;
        return temp;
    }

}
