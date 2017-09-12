package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MovieListTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    MovieList ml = new MovieList();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void ListBooksTest(){
        ml.init();
        ml.listMovies();
        assertEquals("Titanic, 1997, James Cameron, 10\n" +
                        "Lucy, 2014, Luc Besson, 9\n" +
                        "Big Hero 6, 2014, Don Hall & Chris Williams, 8\n" +
                        "Spider-Man, 1977, E. W. Swackhamer, 7\n"
                ,outContent.toString());}

    @Test
    public void checkOutMovieTest(){
        ml.init();
        assertEquals(true,ml.checkOutMovie("Titanic"));
        assertEquals(false,ml.checkOutMovie("Titanic"));

    }
}
