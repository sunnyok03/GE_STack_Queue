package com.bridgelabz;

/*
Implementation of queue class for generics data type
 */
public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    //add a new element in the queue
    public void enqueue(T data){
        Node<T> newNode = new Node<>(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
}
