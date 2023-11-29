package com.bridgelabz;


/*
Implementation of stack class for generics data type
 */
public class Stack<T> {

    private Node<T> head;
    private int size;

    // insert a new element in the stack
    public void push(T data){
        Node<T> newNode = new Node<>(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

}
