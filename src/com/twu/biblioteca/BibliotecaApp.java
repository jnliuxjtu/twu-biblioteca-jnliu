package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        new WelcomeMessage().printString();
        BookList bl=new BookList();
        bl.init();
        MovieList ml=new MovieList();
        ml.init();
        new MainMenu().showMainMenu(bl,ml);
    }
}
