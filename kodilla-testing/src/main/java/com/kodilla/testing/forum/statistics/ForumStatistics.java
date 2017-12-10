package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    int postsNumber=0;
    int commentsNumber=0;
    int usersNumber=0;
    double averagePostUser=0.0;
    double averageCommentUser=0.0;
    double averageCommentPost=0.0;

    public void calculateAdvStatistics(Statistics statistics) {
        postsNumber=statistics.postsCount();
        commentsNumber=statistics.commentsCount();
        usersNumber=statistics.userNames().size();
        if((postsNumber>0)&&(commentsNumber>0)&&(usersNumber>0)) {
            averagePostUser = postsNumber / usersNumber;
            averageCommentUser = commentsNumber / usersNumber;
            averageCommentPost = commentsNumber / postsNumber;
        }
    }
}
