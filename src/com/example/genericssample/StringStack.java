package com.example.genericssample;

import java.util.ArrayList;
import java.util.List;

public class StringStack {
    private List<String> tasklist;

    public StringStack() {
        tasklist = new ArrayList<>();
    }

    public boolean push(String task) {
        return tasklist.add(task);
    }

    public String pop() {
        if (tasklist.isEmpty()) {
            return null;
        }
        return tasklist.remove(tasklist.size() - 1);
    }
}
