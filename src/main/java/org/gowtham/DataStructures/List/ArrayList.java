package org.gowtham.DataStructures.List;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<T> implements Iterable<T> {
    private static final int initialCapacity = 16;
    private T[] arr;
    private int capacity;
    private int size;
    @SuppressWarnings("unchecked")
    public ArrayList(){
        arr =  (T[]) new Object[initialCapacity];
        capacity = initialCapacity;
        size = 0;
    }

    public void add (T val){
        if(size == capacity){
            expandArray();
        }
        arr[size++] = val;
    }

    public void add (int pos, T val){
        if(pos <0 || pos > size){
            throw new IndexOutOfBoundsException("Index: " + pos + " ,size: " + size);
        }
        if(size == capacity){
            expandArray();
        }
        for(int i = size - 1; i >= pos; i--){
            arr[i + 1] = arr[i];
        }
        arr[pos] = val;
        size++;
    }

    public void remove(int pos){
        for(int i = pos + 1; i< size; i++){
            arr[i - 1] = arr[i];
        }
        size--;
        if(capacity > initialCapacity && capacity > size * 3){
            shrinkArray();

        }
    }

    public int size(){
        return size;
    }

    public void displayAll(){
        for(int i= 0;i < size;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private void expandArray() {
        capacity = capacity * 2;
        arr = Arrays.copyOf(arr, capacity); // copy of - gives the same array a new size
    }
    private void shrinkArray() {
        capacity /= 2;
        arr = Arrays.copyOf(arr, capacity);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return arr[index++];
            }
        };
    }
}
