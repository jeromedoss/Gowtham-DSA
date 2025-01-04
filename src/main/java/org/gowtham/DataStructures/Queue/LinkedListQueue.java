package org.gowtham.DataStructures.Queue;

public class LinkedListQueue<T> {
    Node front;
    Node rear;

    public LinkedListQueue(){
        front = null;
        rear = null;
    }

    public void enqueue(T val) { //O(1)
        Node newNode = new Node(val);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public T dequeue(){ // O(1)
        if(front == null){
            throw new IndexOutOfBoundsException("queue is empty");
        }
        T temp = front.data;
        front = front.next;
        if(front == null) rear = null;
        return temp;
    }
    class Node{
        T data;
        Node next;
        public Node(T val){
            data = val;
            next = null;
        }

    }
}
