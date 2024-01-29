package com.local;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TaskIterator implements Iterator<Task> {

    private TaskList taskList;
    private int currentIndex = 0;

    public TaskIterator(TaskList taskList) {
        this.taskList = taskList;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < taskList.size();
    }

    @Override
    public Task next() {
        if (hasNext()) {
            return taskList.getTaskAt(currentIndex++);
        }
        throw new NoSuchElementException("No hay más tareas");
    }

}
