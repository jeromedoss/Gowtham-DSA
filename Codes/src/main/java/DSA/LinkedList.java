package DSA;

public class LinkedList {

    class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }

    Node head;
    public LinkedList(){
        head = null;
    }

    public void insertAtBeginning(int val) {
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
    public void insertAtPos(int pos, int val){
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
}
