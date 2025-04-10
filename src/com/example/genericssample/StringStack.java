package com.example.genericssample;

import java.util.ArrayList;
import java.util.List;

public class StringStack<E> {
    private List<E> tasklist;

    public StringStack() {
        tasklist = new ArrayList<>();
    }

    public boolean push(E task) {
        return tasklist.add(task);
    }

    public E pop() {
        if (tasklist.isEmpty()) {
            return null;
        }
        return tasklist.remove(tasklist.size() - 1);
    }
}
