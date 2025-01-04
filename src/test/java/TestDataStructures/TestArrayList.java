package TestDataStructures;

import org.gowtham.DataStructures.LinearDataStructures.List.ArrayList;
import org.testng.annotations.Test;

public class TestArrayList {

    @Test
    public void testArrayList(){
        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(8);
        array.add(56);
        array.displayAll();
        array.remove(1);
        System.out.println(array.size());
        array.displayAll();
        array.add(1, 99);
        array.displayAll();
        array.add(3, 78);
        array.displayAll();
        array.add(10, 74);
        array.displayAll();
    }
}
