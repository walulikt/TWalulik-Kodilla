package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> usersList= new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(01,"John Dole", 'M', LocalDate.of(1980,01,01),40 ));
        usersList.add(new ForumUser(02,"Natasha McDonald", 'F', LocalDate.of(1985,01,01),30 ));
        usersList.add(new ForumUser(03,"Adam Trump", 'M', LocalDate.of(2005,01,01),20 ));
        usersList.add(new ForumUser(04,"Nicole Perish", 'F', LocalDate.of(2007,01,01),10 ));

    }

    public List<ForumUser> getUsersList() {
        return usersList;
    }
}
