package me.squidxtv.oop.exercises.exercise04;

import java.util.Arrays;

public class Stack {

    private int[] content = new int[10];
    private int top = 0;

    public void push(int number) {
        if (top == content.length) {
            content = Arrays.copyOf(content, content.length * 2);
        }
        content[top++] = number;
    }

    public int pop() {
        if (top == 0) {
            throw new IllegalStateException("Stack underflow");
        }
        return content[--top];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

}
