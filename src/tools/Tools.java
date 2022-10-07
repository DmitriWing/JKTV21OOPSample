package tools;

import myclasses.Author;
import myclasses.Book;

public class Tools {
    public Author createAuthor(String firstname, String lastname){
        Author author = new Author();
        author.setName(firstname);                    // set value for variable. Object.method(method's parametr)
        author.setLastname(lastname);
        return author;
    }
    public Book createBook(String bookTitle){
        Book book = new Book();
        book.setTitle(bookTitle);
        return book;
    }
}
