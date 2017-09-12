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
            System.out.println("Thank you! Enjoy the book");
            return true;
        }else{
            System.out.println("That book is not available");
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

    public boolean returnBook(String bn) {
        if(searchBookByName(bn)==null || searchBookByName(bn).getInDock()==true){
            System.out.println("That is not a valid book to return.");
            return false;
        }
        searchBookByName(bn).setInDock(true);
        if(searchBookByName(bn).getInDock()){
            System.out.println("Thank you for returning the book.");
        }else{
            System.out.println("That is not a valid book to return.");
        }
        return searchBookByName(bn).getInDock();
    }
}
