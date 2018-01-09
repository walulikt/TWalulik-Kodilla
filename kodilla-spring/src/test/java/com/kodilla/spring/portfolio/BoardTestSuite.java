package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);

        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("Jutro 4 godziny kodowania z Kodilla");
        board.getInProgressList().addTask("Realizacja zadań kodilla");
        board.getDoneList().addTask("Wiem jak napisać 'Hello World");

        //Then
        Assert.assertTrue(board.getToDoList().getTasks().contains("Jutro 4 godziny kodowania z Kodilla"));
        Assert.assertTrue(board.getInProgressList().getTasks().contains("Realizacja zadań kodilla"));
        Assert.assertTrue(board.getDoneList().getTasks().contains("Wiem jak napisać 'Hello World"));


    }
}
