package org.example;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(6);

        System.out.println("The Length of Stack  : " + stack.getLength());
        System.out.println("Head  : " +  stack.Pop());
        System.out.println("Head  : " +  stack.Pop());
        System.out.println("Head  : " +  stack.Pop());
        System.out.println("Head  : " +  stack.Pop());

    }
}