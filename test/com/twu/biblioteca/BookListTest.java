package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BookListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    BookList bl = new BookList();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void ListBooksTest(){
        bl.init();
        bl.listBooks();
        assertEquals("Communications, Alice, 1990\n" +
                "Computer Science, Bob, 1995\n" +
                "Math, Emil, 2000\n" +
                "Law of Probability, Frank, 2010\n"
                ,outContent.toString());}
    @Test
    public void checkOutBookTest(){
        bl.init();
        assertEquals(true,bl.checkOutBook("Communications"));
        assertEquals(false,bl.checkOutBook("Communications"));
    }

    @Test
    public void returnBookTest(){
        bl.init();
        bl.checkOutBook("Communications");
        assertEquals(true,bl.returnBook("Communications"));
    }

}
