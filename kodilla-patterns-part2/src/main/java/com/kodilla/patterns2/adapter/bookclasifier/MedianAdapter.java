package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        for(Book b : bookSet){
            String signature = bookSet.iterator().next().getSignature();
            String author = bookSet.iterator().next().getAuthor();
            String title = bookSet.iterator().next().getTitle();
            int publicationYear =bookSet.iterator().next().getPublicationYear();
            BookSignature bookSignature = new BookSignature(signature);
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book bookB = new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(author,title,publicationYear);

            books.put(bookSignature,bookB);

        }
        return averagePublicationYear(books);
    }
}
