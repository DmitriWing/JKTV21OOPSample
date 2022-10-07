package jktv21oopsample;

import myclasses.Author;
import myclasses.Book;

public class App {
    public void run(){
        // using public static Author createAuthor(String firstname, String lastname)
        Book book3 = new Book();
        book3.setTitle("Learning JavaEE7"); 
        book3.addAuthor(createAuthor("Antonio", "Gonsalves"));
        System.out.println(book3.toString());
        //--------- using private Book createBook(String bookTitle) -------------------------------------------
        Book book4 = createBook("New Book Title");
        book4.addAuthor(createAuthor("Tolik", "Pruzhinkin"));
        System.out.println(book4.toString());
    }
    
    public static Author createAuthor(String firstname, String lastname){
        Author author = new Author();
        author.setName(firstname);                    // set value for variable. Object.method(method's parametr)
        author.setLastname(lastname);
        return author;
    }
    private Book createBook(String bookTitle){
        Book book = new Book();
        book.setTitle(bookTitle);
        return book;
    }
    
    
}
