package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @BeforeClass
    public static void before(){
        System.out.println("Początek Testów");
    }
    @AfterClass
    public static void after (){
        System.out.println("Koniec testów");
    }
    static int testCount=0;
    @Before
    public void beforeTest (){
        testCount++;
        System.out.println("wykonywany jest test nr: #"+testCount);
    }
    @Test
    public void testCalculateAdvStatisticsMockitoNull(){
        //Given
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics=new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0,forumStatistics.commentsNumber);
        Assert.assertEquals(0,forumStatistics.postsNumber);
        Assert.assertEquals(0,forumStatistics.usersNumber);
    }
    @Test
    public void testCalculateAdvStatisticsMockitoUser () {
        Statistics statistics = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for(int i=0; i<100; i++){
            String userName="Jan Kowalski"+i;
            usersList.add(userName);
        }
        when(statistics.userNames()).thenReturn(usersList);
        ForumStatistics forumStatistics=new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100,forumStatistics.usersNumber);

    }
    @Test
    public void testCalculateAdvStatisticsMockitoPost() {
        Statistics statistics = mock(Statistics.class);
        int postsSum = 1000;
        when(statistics.postsCount()).thenReturn(postsSum);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(1000, forumStatistics.postsNumber);
    }
    @Test
    public void testCalculateAdvStatisticsMockitoCommentLessPosts() {
        Statistics statistics = mock(Statistics.class);
        int postsSum = 1000;
        int commentsSum = 500;
        when(statistics.postsCount()).thenReturn(postsSum);
        when(statistics.commentsCount()).thenReturn(commentsSum);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertTrue(forumStatistics.commentsNumber<forumStatistics.postsNumber);
    }
    @Test
    public void testCalculateAdvStatisticsMockitoCommentMorePosts() {
        Statistics statistics = mock(Statistics.class);
        int postsSum = 500;
        int commentsSum = 1000;
        when(statistics.postsCount()).thenReturn(postsSum);
        when(statistics.commentsCount()).thenReturn(commentsSum);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertTrue(forumStatistics.commentsNumber>forumStatistics.postsNumber);
    }

}
