package org.gowtham.DataStructures.Stack;

public class LinkedListStack<T> {
    Node top;
    public LinkedListStack(){
        top = null;
    }
    public void push(T data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    public T pop(){
        if (top == null){
            throw new StackOverflowError("stack is empty");
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek(){
        if (top == null){
            throw new StackOverflowError("stack is empty");
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
    class Node {
        T data;
        Node next;
        public Node(T val){
            data = val;
            next = null;
        }
    }
}
