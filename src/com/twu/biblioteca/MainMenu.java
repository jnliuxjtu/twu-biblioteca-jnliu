package com.twu.biblioteca;

import java.util.Scanner;

public class MainMenu {

    public void showMainMenu(BookList bl, MovieList ml){
        while(true){
            System.out.println("");
            System.out.println("*********************");
            System.out.println("Please enter the corresponding number in the menu:");
            System.out.println("[0] Quit the system");
            System.out.println("[1] List the details of all books");
            System.out.println("[2] Checkout a book");
            System.out.println("[3] Return a book");
            System.out.println("[4] List movies");
            System.out.println("[5] Checkout a movie");
            Scanner sc = new Scanner(System.in);
            int selection=sc.nextInt();
            switch (selection){
                case 0:{
                    System.exit(1);
                }
                case 1:{
                    System.out.println("Book List:(Organized by: name|author|year)");
                    bl.listBooks();
                    break;
                }
                case 2:{
                    System.out.println("Please enter the book name:");
                    Scanner sc2=new Scanner(System.in);
                    bl.checkOutBook(sc2.nextLine());
                    break;
                }
                case 3:{
                    System.out.println("Please enter the book name:");
                    Scanner sc2=new Scanner(System.in);
                    bl.returnBook(sc2.nextLine());
                    break;
                }
                case 4:{
                    System.out.println("Movie List:(Organized by: name|year|director|rate)");
                    ml.listMovies();
                    break;
                }
                case 5:{
                    System.out.println("Please enter the movie name:");
                    Scanner sc2=new Scanner(System.in);
                    ml.checkOutMovie(sc2.nextLine());
                    break;
                }
                default:{
                    System.out.println("*********************");
                    System.out.println("Please enter a valid option!");
                    System.out.println("*********************");
                    break;
                }
            }
        }

    }
}
