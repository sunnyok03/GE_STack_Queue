package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ability to create a Stack of 56->30->70
        Stack<Integer> UC1 = new Stack<>();
        UC1.push(70);
        UC1.push(30);
        UC1.push(56);

        // Ability to peek and pop from a Stack of 56->30->70 till it is empty
        Stack<Integer> UC2 = new Stack<>();
        UC2.push(70);
        UC2.push(30);
        UC2.push(56);
        System.out.println(UC2.peek()); // expecting 56
        UC2.pop();
        System.out.println(UC2.peek()); // expecting 30

        //Ability to create a Queue of 56->30->70
        Queue<Integer> UC3 = new Queue<>();
        UC3.enqueue(56);
        UC3.enqueue(30);
        UC3.enqueue(70);

        //Ability to dequeue from the beginning
        Queue<Integer> UC4 = new Queue<>();
        UC3.enqueue(56);
        UC3.enqueue(30);
        UC3.enqueue(70);
        UC4.dequeue();
    }
}