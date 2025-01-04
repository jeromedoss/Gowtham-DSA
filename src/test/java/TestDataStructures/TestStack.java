package TestDataStructures;


import org.gowtham.DataStructures.Stack.ArrayStack;
import org.gowtham.DataStructures.Stack.LinkedListStack;
import org.testng.annotations.Test;

public class TestStack {

    @Test
    public void testArrayStack(){
        ArrayStack<Integer> integerArrayStack = new ArrayStack<>();
        integerArrayStack.push(4);
        integerArrayStack.push(6);
        integerArrayStack.push(8);
        integerArrayStack.push(3);
        integerArrayStack.pop();
        System.out.println(integerArrayStack.peek());
        System.out.println(integerArrayStack.isEmpty());
    }
    @Test
    public void testListStack(){
        LinkedListStack<Integer> integerArrayStack = new LinkedListStack<>();
        integerArrayStack.push(4);
        integerArrayStack.push(6);
        integerArrayStack.push(8);
        integerArrayStack.push(3);
        integerArrayStack.pop();
        System.out.println(integerArrayStack.peek());
        System.out.println(integerArrayStack.isEmpty());
    }
}
