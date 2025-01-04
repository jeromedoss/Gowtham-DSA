package org.gowtham.DataStructures.LinearDataStructures.List;

public class DoublyLinkedList<T> {
    class Node {
        T data;
        Node next;
        Node prev;
        Node(T val) {
            data = val;
            next = null;
            prev = null;
        }
    }
    Node head;
    Node tail;
    public DoublyLinkedList(){
        head = null;
        tail = null;
    }

    public void insertAtBeginning(T val) {
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
        }else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    public void displayAll(){
        Node temp = head;
        while (temp !=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void displayAllInRev(){
        Node temp = tail;
        while (temp !=null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
    public void insertAtPos(int pos, T val){
        if(pos == 0){
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i = 1; i < pos; i++){
            temp = temp.next;
        }
        if(temp == tail){
            temp.next = newNode;
            newNode.prev = temp;
            tail = newNode;
        }else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }

    }

    public void deleteAtPosition(int pos){

        if(head == null) {
            throw new IndexOutOfBoundsException("list is empty");
        }
        if(pos ==0){
            head = head.next;
            if(head == null){
                tail = null;
            }else {
                head.prev = null;
            }
            return;
        }
        Node temp = head;
        Node prev = null;

        for(int i =0; i< pos;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        if(temp.next == null){
            tail = prev;
            tail.next = null;
        }else {
            temp.next.prev = prev;
        }
    }
}
