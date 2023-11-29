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

    // return top element of the stack
    public T peek(){
        return head.data;
    }

    // remove top element from the stack
    public void pop(){
        if(head != null)head = head.next;
        if(size > 0)size--;
    }


}
