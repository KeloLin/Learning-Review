package com.learn.review.datastructure.stack;

import com.learn.review.datastructure.array.Array;

public class ArrayStack<E> {

    private Array<E> stack;

    public ArrayStack(int maxSize) {
        stack = new Array<>(maxSize);
    }

    public void push(E e) {
        stack.addFirst(e);
    }

    public E pop() {
        return stack.removeFirst();
    }

    public void print() {
        stack.print();
    }


}
