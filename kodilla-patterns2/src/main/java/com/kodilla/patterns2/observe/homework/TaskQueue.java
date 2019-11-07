package com.kodilla.patterns2.observe.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TaskQueue implements Observable {
    private final List<Observer> observers;
    private final Queue<String> tasks;
    private final String name;

    public TaskQueue(String name) {
        this.observers = new ArrayList<>();
        this.tasks = new ArrayDeque<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    public Queue<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
