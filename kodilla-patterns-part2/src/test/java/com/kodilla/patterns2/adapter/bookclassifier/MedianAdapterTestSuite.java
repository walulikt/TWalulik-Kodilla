package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest (){
        //Given
        Book b1 = new Book("Tolkien","Wladca Pierscienia", 1955, "22b");
        Book b2 = new Book("Grzędowicz","Pan Lodowego Grodu", 2002,"f11");
        Book b3 = new Book("Autor","Tytul",1980,"k67");
        Set<Book> bookSet = new HashSet<Book>();
        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When


        //Then
        Assert.assertEquals(1980,medianAdapter.publicationYearMedian(bookSet));
    }

}
