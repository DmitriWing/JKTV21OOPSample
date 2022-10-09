package jktv21oopsample;

import java.util.Arrays;
import myclasses.Book;
import tools.Tools;
import java.util.Scanner;

public class App {
    public void run(){
        Tools tools = new Tools();
        Scanner scanner = new Scanner(System.in);
        // using public static Author createAuthor(String firstname, String lastname)
//        Book book3 = new Book();
//        book3.setTitle("Learning JavaEE7"); 
//        book3.addAuthor(tools.createAuthor("Antonio", "Gonsalves"));
//        System.out.println(book3.toString());
        //--------- using private Book createBook(String bookTitle) -------------------------------------------
//        Book book4 = tools.createBook("New Book Title");
//        book4.addAuthor(tools.createAuthor("Tolik", "Pruzhinkin"));
//        System.out.println(book4.toString());

        // add array with books
        Book[] books = new Book[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Book title " + (i+1) + " : ");
            String title = scanner.nextLine();
//            Book book = new Book();
            tools.createBook(title);
//            book.setTitle(title);
            System.out.println("How many authors: ");
            int countAuthorsInBook = scanner.nextInt();
            scanner.nextLine();
                for (int j = 0; j < countAuthorsInBook; j++) {
                System.out.println("Author name " + (j+1) + " - book " + (i+1) + ": ");
                String firstname = scanner.nextLine();
                System.out.println("Author lastname " + (j+1) + " - book " + (i+1) + ": ");
                String lastname = scanner.nextLine();
                book.addAuthor(tools.createAuthor(firstname, lastname));
                }
            
            books[i] = book;
        }
        System.out.println(Arrays.toString(books));
    }
    
    
    
    
}
