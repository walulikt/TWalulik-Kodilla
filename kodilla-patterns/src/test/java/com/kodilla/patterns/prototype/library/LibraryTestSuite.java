package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks (){
        //Give
        Library nation = new Library("Biblioteka Narodowa");

        Book book = new Book("Potop", "Henryk Sienkiewicz", LocalDate.of(1886,10,10));
        Book book1 = new Book("Ogniem i mieczem", "Henryk Sienkiewicz", LocalDate.of(1884,10,10));
        Book book2 = new Book("Pan Wołodyjowski", "Henryk Sienkiewicz", LocalDate.of(1888,10,10));

        nation.getBooks().add(book);
        nation.getBooks().add(book1);
        nation.getBooks().add(book2);

        Library city = null;
        try {
            city = nation.shallowCopy();
            city.setName("Biblioteka Miejska");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library vilige = null;
        try {
            vilige = nation.shallowCopy();
            vilige.setName("Biblioteka Wiejska");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        //Then
        System.out.println(nation+"\n");
        System.out.println(city+"\n");
        System.out.println(vilige+"\n");
        Assert.assertEquals(3, nation.getBooks().size());
        Assert.assertEquals(3, city.getBooks().size());
        Assert.assertEquals(3, vilige.getBooks().size());
    }
}
