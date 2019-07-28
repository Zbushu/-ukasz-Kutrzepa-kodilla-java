package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.executeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Driving", task.getTaskName());
        Assert.assertEquals(false, task.isTaskExecuted());
    }
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.executeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping", task.getTaskName());
        Assert.assertEquals(true, task.isTaskExecuted());
    }
    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.executeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting", task.getTaskName());
        Assert.assertEquals(true, task.isTaskExecuted());
    }
}
