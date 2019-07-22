package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {
    @Test
    public void testToString() {
        //Given
        //creating the TaskList for todos
        TaskList listToDo = new TaskList("To Do Tasks");
        IntStream.iterate(1,n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To do Task number " + n)));
        //creating the TaskList for tasks in progress
        TaskList listInProgress = new TaskList("In progress Tasks");
        IntStream.iterate(1,n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In progress Task number " + n)));
        //creating the TaskList for done tasks
        TaskList listDone = new TaskList("Done Tasks");
        IntStream.iterate(1,n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done Task number " + n)));
        //creating the board and assigning the lists
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        //making a shallow cloe of object board
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making a deep cloe of object board
        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDo);
        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);
        Assert.assertEquals(2, board.getLists().size());
        Assert.assertEquals(2, clonedBoard.getLists().size());
        Assert.assertEquals(3, deepClonedBoard.getLists().size());
        Assert.assertEquals(clonedBoard.getLists(), board.getLists());
        Assert.assertNotEquals(deepClonedBoard, board.getLists());
    }

}
