package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;


@Configuration

public class BoardConfig {
    @Autowired
   @Qualifier("Do zrobienia")
    TaskList taskList;


    @Bean (name = "Do zrobienia")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean (name = "W trakcie")
    @Scope("prototype")
    public TaskList getInProgrestList () {
        return new TaskList();
    }

    @Bean (name = "Zrobione")
    @Scope("prototype")
    public TaskList getDoneList () {
        return new TaskList();
    }

    @Bean
    public Board getBoard(){
        return new Board(getToDoList(), getInProgrestList(), getDoneList());
    }

}
