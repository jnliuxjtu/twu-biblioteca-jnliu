package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class WelcomeMessageTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void WelcomeMessageTest() throws Exception {

        WelcomeMessage welmsg = new WelcomeMessage();
        welmsg.printString();
        assertEquals("*********************\n" +
                "Welcome!\n" +
                "*********************\n",outContent.toString());
    }



}
