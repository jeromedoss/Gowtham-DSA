package TestDataStructures;

import org.gowtham.DataStructures.LinearDataStructures.List.CircularLinkedList;
import org.gowtham.DataStructures.LinearDataStructures.List.DoublyLinkedList;
import org.gowtham.DataStructures.LinearDataStructures.List.LinkedList;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLinkedList {

    private LinkedList<Integer> list;

    @BeforeClass
    public void beforeSetUp(){
        list = new LinkedList<>();
    }

    @Test
    public void testLinkedList(){
        list.insertAtBeginning(4);
        list.insertAtBeginning(7);
        list.displayAll();
        System.out.println(" ");
        list.insertAtPos(1, 3);
        list.displayAll();
    }
    @Test
    public void insertTenNumbers(){
        for(int i = 10; i>0; i--){
            list.insertAtBeginning(i);
        }
        list.displayAll();
        list.deleteAtPos(9);
        list.displayAll();
        list.search(9);
        System.out.println(" ");
        list.add(23);
        list.displayAll();
        System.out.println(" ");
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.displayAll();
    }
    @Test
    public void testDoublyLinkedList(){
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.insertAtBeginning(3);
        list.insertAtBeginning(7);
        list.insertAtBeginning(9);

        list.displayAll();
        System.out.println();
        list.displayAllInRev();

        list.insertAtPos(3, 10 );
        System.out.println();
        list.displayAll();
        System.out.println();
        list.displayAllInRev();
        list.deleteAtPosition(0);
        list.displayAll();
    }
    @Test
    public void testCircularLinkedList() {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.insertAtBeginning(3);
        list.insertAtBeginning(7);
        list.insertAtBeginning(9);
        list.insertAtEnd(67);
        list.display();
        list.deleteAtBeginning();
        System.out.println();
        list.display();
        list.deleteAtEnd();
        System.out.println();
        list.display();
    }
}
