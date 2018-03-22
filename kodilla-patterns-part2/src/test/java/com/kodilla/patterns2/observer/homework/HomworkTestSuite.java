package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomworkTestSuite {

    @Test
    public void homeworkObserverUpdateTest(){
        //Given
        Mentor kasiaCz = new Mentor("Kasia Czechowicz");
        Mentor andrzejJ = new Mentor ("Andrzej Jaromin");
        Homework homework1 = new Modul5_3Homework();
        Homework homework2 = new Modul20_1Homework();
        KodillaStudent janKowalski = new KodillaStudent("Jan Kowalski", kasiaCz);
        KodillaStudent adamNowak = new KodillaStudent("Adam Nowak", andrzejJ);
        homework1.registerObserver(kasiaCz);
        homework2.registerObserver(andrzejJ);

        //When
        janKowalski.addHomework(homework1);
        adamNowak.addHomework(homework2);

        //Then
        Assert.assertEquals(1,kasiaCz.getUpdateCount());
        Assert.assertEquals(1,andrzejJ.getUpdateCount());

    }
}
