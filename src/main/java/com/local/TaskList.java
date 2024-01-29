package com.local;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskList implements Iterable<Task> {

    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public int size() {
        return tasks.size();
    }

    public Task getTaskAt(int index) {
        if (index >= 0 && index < tasks.size()) {
            return tasks.get(index);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + index);
        }
    }

    @Override
    public Iterator<Task> iterator() {
        return new TaskIterator(this);
    }

}
