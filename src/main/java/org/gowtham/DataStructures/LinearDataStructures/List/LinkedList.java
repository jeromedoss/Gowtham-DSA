package org.gowtham.DataStructures.LinearDataStructures.List;

import java.util.Iterator;

public class LinkedList<T> implements Iterable{


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node temp = head;
            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public T next() {
                T val = temp.data;
                temp = temp.next;
                return val;
            }
        };
    }

    class Node {
        T data;
        Node next;
        Node(T val) {
            data = val;
            next = null;
        }
    }

    Node head;
    public LinkedList(){
        head = null;
    }

    public void insertAtBeginning(T val) {
        Node newNode = new Node(val);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }
    public void displayAll(){
        Node temp = head;
        while (temp !=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void insertAtPos(int pos, T val){
        if(pos == 0) {
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i = 1; i<pos; i++){
            temp = temp.next;
            if(temp == null){
                throw new NullPointerException("Invalid Position");
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void deleteAtPos(int pos){
        if(head == null){
            throw new IndexOutOfBoundsException("No data present in the list");
        }
        if (pos ==0){
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        for(int i=1; i<=pos;i++){
            prev = temp;
            temp = temp.next;
            if(temp == null){
                throw new NullPointerException("Invalid Position");
            }
        }
        assert prev != null;
        prev.next = temp.next;
    }
    public void search(T val){
        Node temp = head;
        int index = 0;
        while(temp != null){
            if(temp.data.equals(val)){
                System.out.println("Index of the given number is " + index);
                break;
            }
            temp = temp.next;
            if (temp == null) System.out.println("No such element present");
            index++;
        }
    }
    public void add(T val){
        Node newNode = new Node(val);
        Node temp = head;
        if(head == null){
            head = newNode;
            return;
        }
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
}
