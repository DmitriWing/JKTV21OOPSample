package jktv21oopsample;

import java.util.Arrays;
import myclasses.Book;
import tools.Tools;
//import java.util.Scanner;

public class App {
    public void run(){
        Tools tools = new Tools();
        // add array with books
        Book[] books = new Book[5];
        for (int i = 0; i < 2; i++) {
            books[i] = tools.createBook();
        }
        System.out.println(Arrays.toString(books));
        for (int i = 0; i < 2; i++) {
            System.out.printf("Book{%n\t%s\tAuthors = [%s]%n}", books[i].getTitle(),Arrays.toString(books[i].getAuthors()));
        }
//            System.out.println("How many authors: ");
//            int countAuthorsInBook = scanner.nextInt();
//            scanner.nextLine();
//                for (int j = 0; j < countAuthorsInBook; j++) {
//                System.out.println("Author name " + (j+1) + " - book " + (i+1) + ": ");
//                String firstname = scanner.nextLine();
//                System.out.println("Author lastname " + (j+1) + " - book " + (i+1) + ": ");
//                String lastname = scanner.nextLine();
//                book.addAuthor(tools.createAuthor(firstname, lastname));
//                }
            
//            books[i] = book;
        }
//        System.out.println(Arrays.toString(books));
    }
    
    
    
    

