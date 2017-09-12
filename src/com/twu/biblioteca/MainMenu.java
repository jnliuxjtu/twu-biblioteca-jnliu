package com.twu.biblioteca;

import java.util.Scanner;

public class MainMenu {

    public void showMainMenu(BookList bl){
        while(true){
            System.out.println("Please enter the corresponding number in the menu:");
            System.out.println("[0] Quit the system");
            System.out.println("[1] List the details of all books");
            System.out.println("[2] Checkout a book");
            Scanner sc = new Scanner(System.in);
            int selection=sc.nextInt();
            switch (selection){
                case 0:{
                    System.exit(1);
                }
                case 1:{
                    System.out.println("Book List:(Organized by: name|author|year)");
                    System.out.print(bl.toString());
                    break;
                }
                case 2:{
                    System.out.println("Please enter the book name:");
                    Scanner sc2=new Scanner(System.in);
                    bl.checkOutBook(sc2.nextLine());
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
