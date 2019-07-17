package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().getTasks().add("Done task.");
        board.getInProgressList().getTasks().add("In progress task.");
        board.getToDoList().getTasks().add("To do task.");
        //Then
        System.out.println(board.getDoneList().getTasks());
        System.out.println(board.getInProgressList().getTasks());
        System.out.println(board.getToDoList().getTasks());
    }

}
