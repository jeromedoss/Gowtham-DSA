package TestDataStructures;

import DSA.LinkedList;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLinkedList {

    private LinkedList list;

    @BeforeClass
    public void beforeSetUp(){
        list = new LinkedList();
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
}
