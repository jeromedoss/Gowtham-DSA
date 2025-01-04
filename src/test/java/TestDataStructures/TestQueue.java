package TestDataStructures;


import org.gowtham.DataStructures.Queue.ArrayCircularQueue;
import org.gowtham.DataStructures.Queue.ArrayQueue;
import org.gowtham.DataStructures.Queue.LinkedListQueue;
import org.testng.annotations.Test;

public class TestQueue {

    @Test
    public void testArrayQueue(){
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(8);
        arrayQueue.enqueue(4);
        arrayQueue.dequeue();
    }

    @Test
    public void testLinkedListQueue(){
        LinkedListQueue<Integer> arrayQueue = new LinkedListQueue<>();
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(8);
        arrayQueue.enqueue(4);
        arrayQueue.dequeue();
        arrayQueue.enqueue(78);
    }

    @Test
    public void testArrayCircularQueue(){
        ArrayCircularQueue<Integer> arrayQueue = new ArrayCircularQueue<>();
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(8);
        arrayQueue.enqueue(4);
        arrayQueue.dequeue();
        arrayQueue.enqueue(78);
    }
}
