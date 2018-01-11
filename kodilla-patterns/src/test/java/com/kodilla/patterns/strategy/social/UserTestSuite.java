package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Gvien
        User franek = new Millenials("Franciszek Staszczyk");
        User stasia = new YGeneration("Stanisława Zarzycka");
        User antek = new ZGeneration("Antoni Bogusławski");

        //When
        String millenialPost = franek.sharePost();
        System.out.println(franek.getUserName()+ " 'Millenials' : "+ millenialPost);
        String yGenerationPost = stasia.sharePost();
        System.out.println(stasia.getUserName()+ " 'Y Generation' : " +yGenerationPost);
        String zGenerationPost = antek.sharePost();
        System.out.println(antek.getUserName()+ " 'Z Generation' : " +zGenerationPost);

        //Then
        Assert.assertEquals("User shares with Twitter", millenialPost);
        Assert.assertEquals("User shares with Facebook", yGenerationPost);
        Assert.assertEquals("User shares with Snapchat", zGenerationPost);
    }
    @Test
    public void testIndividualSharingStrategy (){
        //Given
        User zbyszek = new Millenials("Zbigniew Herbert");

        //When
        String millenialPost = zbyszek.sharePost();
        System.out.println(zbyszek.getUserName()+ " 'Millenials' : " +millenialPost);
        zbyszek.setSocialPublisher(new FacebookPublisher());
        millenialPost=zbyszek.sharePost();
        System.out.println(zbyszek.getUserName()+ " 'Millenials' changed to: " +millenialPost);

        //Then
        Assert.assertEquals("User shares with Facebook", millenialPost);

        }
}

