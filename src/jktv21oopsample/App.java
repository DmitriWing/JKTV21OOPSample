package jktv21oopsample;

import myclasses.Book;
import tools.Tools;

public class App {
    public void run(){
        Tools tools = new Tools();
        // using public static Author createAuthor(String firstname, String lastname)
        Book book3 = new Book();
        book3.setTitle("Learning JavaEE7"); 
        book3.addAuthor(tools.createAuthor("Antonio", "Gonsalves"));
        System.out.println(book3.toString());
        //--------- using private Book createBook(String bookTitle) -------------------------------------------
        Book book4 = tools.createBook("New Book Title");
        book4.addAuthor(tools.createAuthor("Tolik", "Pruzhinkin"));
        System.out.println(book4.toString());
    }
    
    
    
    
}
