package com.kodilla.patterns.prototype.Library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Library 1");
        Book book1 = new Book("Book 1", "Author 1", LocalDate.of(2000,1,1));
        Book book2 = new Book("Book 1", "Author 1", LocalDate.of(2000,1,1));
        Book book3 = new Book("Book 1", "Author 1", LocalDate.of(2000,1,1));
        Book book4 = new Book("Book 1", "Author 1", LocalDate.of(2000,1,1));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //making a shallow cloe of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making a deep cloe of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book1);
        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}
