package me.squidxtv.oop.exercises.exercise04;

public class Stack {

    int[] content = new int[10];
    int top = -1;

    public void push(int number) {
        if (top == content.length - 1) {
            int[] old = content;
            content = new int[content.length * 2];
            System.arraycopy(old, 0, content, 0, old.length);
        }
        content[++top] = number;
    }

    public int pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack underflow");
        }
        return content[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

}
