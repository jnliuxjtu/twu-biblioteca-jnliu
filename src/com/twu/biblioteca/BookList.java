package com.twu.biblioteca;

import java.util.ArrayList;

public class BookList {

    private ArrayList<BookInfo> BookInfoList = new ArrayList<BookInfo>();

    public void addBookInfo(BookInfo bookInfo){
        this.BookInfoList.add(bookInfo);
    }
    public void addBook(String bn, String auth, String yr){
        this.addBookInfo(new BookInfo(bn,auth,yr));
    }

    public void listBooks(){
        System.out.print(this.toString());
    }

    public void init(){
        this.addBook("Communications","Alice","1990");
        this.addBook("Computer Science","Bob","1995");
        this.addBook("Math","Emil","2000");
        this.addBook("Law of Probability","Frank","2010");
    }

    @Override
    public String toString(){
        String ans= "";
        for(BookInfo book:this.BookInfoList){
            if(book.getInDock()){
                ans += book.toString();
            }
        }
        return ans;
    }

    public boolean checkOutBook(String bn) {
        if(this.searchBookByName(bn)!=null&&this.searchBookByName(bn).getInDock()){
            this.searchBookByName(bn).setInDock(false);
            System.out.println("Check-out succeeded");
            return true;
        }else{
            System.out.println("Check-out failed");
            if(this.searchBookByName(bn)==null){
                System.out.println("The book doesn't exist");
            }else{
                System.out.println("Sorry, the book has been checked-out");
            }
            return false;
        }
    }

    public BookInfo searchBookByName(String bn) {
        for(BookInfo book:this.BookInfoList){
            if(book.getBookName().equals(bn)){
                return book;
            }
        }
        return null;
    }
}
