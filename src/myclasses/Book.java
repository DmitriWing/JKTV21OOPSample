package myclasses;

import java.util.Arrays;

public class Book {
    private Author[] authors;
    private String title;

    public Book() {     // this is constructor. rbm -> insert code... -> generate... must be in all classes
        authors = new Author[0];
    }

    public Author[] getAuthors() {      // rbm -> insert code... getters and setters, choose all, choose incapsulate
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
    public void addAuthor(Author author){
        // create copy of authors with extra cell
        Author[] newAuthor = Arrays.copyOf(authors, authors.length + 1);
        // to the extra cell put author
        newAuthor[newAuthor.length-1] = author;
        // to the authors put link on new array
        this.authors = newAuthor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {          // rbm -> insert code... -> toString...
        return "Book{" 
                + "authors=" 
                + Arrays.toString(getAuthors())     //can be Arrays.toString(authors) 
                + ", title=" 
                + title 
                + '}';
    }
    
}
