package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate userBirthDate;
    private final int userPostSum;

    public ForumUser(final int userID, final String userName, final char sex, final LocalDate userBirthDate,final int userPostSum) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.userBirthDate = userBirthDate;
        this.userPostSum = userPostSum;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public int getUserPostSum() {
        return userPostSum;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", userBirthDate=" + userBirthDate +
                ", userPostSum=" + userPostSum +
                '}';
    }
}
