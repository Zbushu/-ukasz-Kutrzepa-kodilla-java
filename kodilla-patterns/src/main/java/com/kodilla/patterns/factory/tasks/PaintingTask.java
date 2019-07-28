package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("I am a painter!");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return color.equals("Blue") && whatToPaint.equals("Bedroom");
    }
}
