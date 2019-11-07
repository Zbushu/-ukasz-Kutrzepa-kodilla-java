package com.kodilla.patterns2.observe.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTest {
    @Test
    public void testUpdate() {
        //Given
        TaskQueue student1 = new TaskQueue("Student 1");
        TaskQueue student2 = new TaskQueue("Student 2");
        TaskQueue student3 = new TaskQueue("Student 3");

        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        student1.registerObserver(mentor1);
        student2.registerObserver(mentor1);
        student3.registerObserver(mentor2);
        //When
        student1.addTask("20.1");
        student1.addTask("20.2");
        student2.addTask("20.3");
        student3.addTask("20.4");
        student3.addTask("20.3");
        student1.addTask("21.1");
        //Then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}