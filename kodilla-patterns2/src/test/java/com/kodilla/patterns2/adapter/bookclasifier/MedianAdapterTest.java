package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
public class MedianAdapterTest {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author 1", "Title 1", 2002, "SIG1"));
        bookSet.add(new Book("Author 2", "Title 2", 2003, "SIG2"));
        bookSet.add(new Book("Author 3", "Title 3", 2005, "SIG3"));
        bookSet.add(new Book("Author 4", "Title 4", 2010, "SIG4"));
        bookSet.add(new Book("Author 5", "Title 5", 2011, "SIG5"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(median);
        assertEquals(median, 2005);
    }
}