package com.local;

public class Main {
    public static void main(String[] args) {

        TaskList taskList = new TaskList();
        taskList.addTask(new Task("Hacer la compra"));
        taskList.addTask(new Task("Preparar la presentación"));
        taskList.addTask(new Task("Ejercicio físico"));

        for (Task task : taskList) {
            System.out.println("Tarea " + task.getTaskDescription());
        }

    }
}