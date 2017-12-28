package com.kodilla.good.patterns.challenges;

public class User {

    private String realName;
    private String userName;

    public User(String realName, String userName) {
        this.realName = realName;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Użytkownik" + realName + '\'' +
                ", userName='" + userName + '\'';
    }
}
