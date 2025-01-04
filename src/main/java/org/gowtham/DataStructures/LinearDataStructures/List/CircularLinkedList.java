package org.gowtham.DataStructures.LinearDataStructures.List;

public class CircularLinkedList<T> {
    Node last;

    public CircularLinkedList(){
        last = null;
    }
    public void insertAtBeginning(T val){
        Node newNode = new Node(val);
        if(last == null){
            newNode.next = newNode;
            last = newNode;
        }else {
            newNode.next = last.next;
            last.next = newNode;
        }
    }
    public void insertAtEnd(T val){
        Node newNode = new Node(val);
        if(last == null){
            newNode.next = newNode;
            last = newNode;
        }else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void display(){
        if(last == null){
            return;
        }
        Node temp = last.next;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while (temp != last.next);

    }

    public T deleteAtBeginning(){
        if(last == null){
            throw new IndexOutOfBoundsException("list is empty");
        }
        T data = last.next.data;
        if(last.next == last){
            last = null;
        }else {
            last.next = last.next.next;
        }
        return data;
    }
    public void deleteAtEnd(){
        if(last == null){
            throw new IndexOutOfBoundsException("list is empty");
        }
        if(last.next == last){
            last = null;
        }else {
            Node temp = last.next;
            while (temp.next != last){
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
        }
     }
    class Node {
        T data;
        Node next;
        Node(T val) {
            data = val;
            next = null;
        }
    }

}
