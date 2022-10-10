package tools;

import myclasses.Author;
import myclasses.Book;
import java.util.Scanner;


public class Tools {
    Scanner scanner = new Scanner(System.in);
    
    public Author[] createAuthor(int countAuthorsInBook){
        Author[] authors = new Author[countAuthorsInBook];
        for (int i = 0; i < countAuthorsInBook; i++) {
            System.out.println("Author name " + (i+1) + ": ");
            String firstname = scanner.nextLine();
            System.out.println("Author lastname " + (i+1) + ": ");
            String lastname = scanner.nextLine();
            Author author = new Author();
            author.setName(firstname);                    // set value for variable. Object.method(method's parametr)
            author.setLastname(lastname);
            authors[i] = author;
        }
        return authors;
    }
    
    public Book createBook(){
        Book book = new Book();
        System.out.println("Book title: ");
        book.setTitle(scanner.nextLine());
        System.out.println("How many authors: ");
        int countAuthorsInBook = scanner.nextInt();
        scanner.nextLine();
        book.setAuthors(createAuthor(countAuthorsInBook));
        return book;
    }
}
