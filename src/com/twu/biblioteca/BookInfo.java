package com.twu.biblioteca;

public class BookInfo {

    private String BookName;
    private String Author;
    private String Year;

    private Boolean InDock;

    public void setInDock(Boolean inDock) {
        InDock = inDock;
    }
    public Boolean getInDock() {
        return InDock;
    }

    public BookInfo(String bn, String auth, String yr){

        this.BookName = bn;
        this.Author = auth;
        this.Year = yr;
        this.InDock=true;
    }

    @Override
    public String toString() {
        return this.BookName + ", " + this.Author + ", " + this.Year + "\n";
    }

    public String getBookName() {
        return this.BookName;
    }
}
